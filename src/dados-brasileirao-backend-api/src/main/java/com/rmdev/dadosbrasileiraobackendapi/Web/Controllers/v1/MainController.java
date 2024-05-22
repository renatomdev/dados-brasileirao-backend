package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public abstract class MainController <T, ID> {

    private final MainService<T, ID> service;

    protected MainController(MainService<T, ID> service) {
        this.service = service;
    }

    @GetMapping("/all")
    public Iterable<T> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable ID id) {
        Optional<T> optionalEntity = service.getById(id);
        return optionalEntity.map(entity -> new ResponseEntity<>(entity, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}


