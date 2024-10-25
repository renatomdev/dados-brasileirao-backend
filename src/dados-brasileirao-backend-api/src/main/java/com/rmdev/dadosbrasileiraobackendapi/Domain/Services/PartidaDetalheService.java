package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.PartidaDetalhe;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.PartidaDetalheRepository;
import org.springframework.stereotype.Service;

@Service
public class PartidaDetalheService extends MainService<PartidaDetalhe, Integer> {
    public PartidaDetalheService(PartidaDetalheRepository repository) {
        super(repository);
    }
}
