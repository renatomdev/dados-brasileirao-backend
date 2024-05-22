package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Clube;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.ClubeRepository;
import org.springframework.stereotype.Service;

@Service
public class ClubeService extends MainService<Clube, Integer> {
    public ClubeService(ClubeRepository repository) {
        super(repository);
    }
}
