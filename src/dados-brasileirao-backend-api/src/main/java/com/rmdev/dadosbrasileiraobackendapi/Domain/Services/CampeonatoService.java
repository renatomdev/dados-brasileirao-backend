package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Views.RodadaView;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampeonatoService extends MainService<Campeonato, Integer> {

    @Autowired
    private CampeonatoRepository repository;

    public CampeonatoService(CampeonatoRepository repository) {
        super(repository);
    }

    public List<RodadaView> GetRodadasPorCampeonato(int id_campeonato){
        return repository.GetRodadasPorCampeonato(id_campeonato);
    }
}
