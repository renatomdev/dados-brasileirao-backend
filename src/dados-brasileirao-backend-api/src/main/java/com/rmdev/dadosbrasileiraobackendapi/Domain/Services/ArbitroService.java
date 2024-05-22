package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Arbitro;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.ArbitroRepository;
import org.springframework.stereotype.Service;

@Service
public class ArbitroService extends MainService<Arbitro, Integer> {

    public ArbitroService(ArbitroRepository repository) {
        super(repository);
    }
}
