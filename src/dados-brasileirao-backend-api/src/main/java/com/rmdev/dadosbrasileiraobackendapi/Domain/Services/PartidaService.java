package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Partida;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Views.RodadaView;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService extends MainService<Partida, Integer> {

        @Autowired
        private PartidaRepository repository;

    public PartidaService(PartidaRepository repository){
        super(repository);
    }

    public List<Partida> GetPartidaPorCampeonato(int id_campeonato){
        return repository.FindPartidaPorCampeonato(id_campeonato);
    }
}
