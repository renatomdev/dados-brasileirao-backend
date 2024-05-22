package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Treinador;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.TreinadorRepository;
import org.springframework.stereotype.Service;

@Service
public class TreinadorService extends MainService<Treinador, Integer> {
    public TreinadorService(TreinadorRepository repository) {
        super(repository);
    }
}
