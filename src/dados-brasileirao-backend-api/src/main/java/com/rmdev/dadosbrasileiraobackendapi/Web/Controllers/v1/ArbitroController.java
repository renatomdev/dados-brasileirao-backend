package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Arbitro;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.ArbitroService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/v1/arbitro")
public class ArbitroController extends MainController<Arbitro, Integer> {

    public ArbitroController(ArbitroService service) {
        super(service);
    }
}
