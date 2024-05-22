package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Estadio;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.EstadioRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadioService extends MainService<Estadio, Integer> {
    public EstadioService(EstadioRepository repository) {
        super(repository);
    }
}
