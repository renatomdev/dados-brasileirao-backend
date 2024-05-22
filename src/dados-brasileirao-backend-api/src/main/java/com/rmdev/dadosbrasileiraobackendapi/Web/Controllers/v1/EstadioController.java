package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Estadio;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.EstadioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/estadio")
public class EstadioController extends MainController<Estadio, Integer> {
    public EstadioController(EstadioService service) {
        super(service);
    }
}
