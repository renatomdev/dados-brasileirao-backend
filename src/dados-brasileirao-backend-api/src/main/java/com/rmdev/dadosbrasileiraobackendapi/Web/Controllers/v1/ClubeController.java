package com.rmdev.dadosbrasileiraobackendapi.Web.Controllers.v1;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Clube;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Services.ClubeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/clube")
public class ClubeController extends MainController<Clube, Integer> {
    public ClubeController(ClubeService service) {
        super(service);
    }
}
