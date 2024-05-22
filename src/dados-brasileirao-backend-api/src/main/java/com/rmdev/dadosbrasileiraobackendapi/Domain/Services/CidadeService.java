package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Cidades;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.CidadesRepository;
import org.springframework.stereotype.Service;

@Service
public class CidadeService  extends MainService<Cidades, Integer> {
    public CidadeService(CidadesRepository repository) {
        super(repository);
    }
}
