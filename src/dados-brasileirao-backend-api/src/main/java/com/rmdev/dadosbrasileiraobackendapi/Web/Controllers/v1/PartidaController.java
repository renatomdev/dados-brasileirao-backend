package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Views.RodadaView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Partida;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.PartidaService;

import java.util.List;

@RestController
@RequestMapping("/v1/partida")
public class PartidaController extends MainController<Partida, Integer> {

    @Autowired
    private PartidaService service;

    public PartidaController(PartidaService service) {
        super(service);
    }

    @GetMapping("/campeonato/{id_campeonato}")
    public List<Partida> GetPartidaPorCampeonato(@PathVariable int id_campeonato) {
        return service.GetPartidaPorCampeonato(id_campeonato);
    }
}
