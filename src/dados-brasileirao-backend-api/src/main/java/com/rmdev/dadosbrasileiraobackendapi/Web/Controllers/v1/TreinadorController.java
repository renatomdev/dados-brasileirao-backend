package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.TreinadorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Treinador;

@RestController
@RequestMapping("/v1/treinador")
public class TreinadorController extends MainController<Treinador, Integer> {
    public TreinadorController(TreinadorService service) {
        super(service);
    }
}
