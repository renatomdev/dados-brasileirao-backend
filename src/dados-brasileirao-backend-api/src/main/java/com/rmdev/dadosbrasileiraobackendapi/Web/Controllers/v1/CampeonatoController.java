package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.CampeonatoService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Views.RodadaView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/campeonato")
public class CampeonatoController  extends MainController<Campeonato, Integer> {

    @Autowired
    private CampeonatoService service;

    public CampeonatoController(CampeonatoService service) {
        super(service);
    }

    @GetMapping("/rodadas/{id_campeonato}")
    public List<RodadaView> GetRodadasCampeonato(@PathVariable int id_campeonato) {
        return service.GetRodadasPorCampeonato(id_campeonato);
    }
}
