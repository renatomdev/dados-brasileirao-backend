package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.CampeonatoRepository;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoService extends MainService<Campeonato, Integer> {
    public CampeonatoService(CampeonatoRepository repository) {
        super(repository);
    }
}
