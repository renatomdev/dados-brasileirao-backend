package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.CampeonatoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/campeonato")
public class CampeonatoController  extends MainController<Campeonato, Integer> {

    public CampeonatoController(CampeonatoService service) {
        super(service);
    }

}
