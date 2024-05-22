package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Estados;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.EstadoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/estado")
public class EstadoController extends MainController<Estados, Integer> {
    public EstadoController(EstadoService service) {
        super(service);
    }
}
