package com.rmdev.dadosbrasileiraobackendapi.Domain;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public abstract class MainService <T, ID> implements IMainService<T, ID>{

    private final CrudRepository<T, ID> repository;

    public MainService(CrudRepository<T, ID> repository) {

        this.repository = repository;
    }

    @Override
    public Iterable<T> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }

}
