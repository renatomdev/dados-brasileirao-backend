package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Cidades;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.CidadeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cidade")
public class CidadeController extends MainController<Cidades, Integer> {
    public CidadeController(CidadeService service) {
        super(service);
    }
}
