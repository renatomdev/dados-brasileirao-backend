package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.PartidaDetalhe;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.PartidaDetalheService;

@RestController
@RequestMapping("/v1/partida_detalhe")
public class PartidaDetalheController extends MainController<PartidaDetalhe, Integer> {
    public PartidaDetalheController(PartidaDetalheService service) {
        super(service);
    }
}
