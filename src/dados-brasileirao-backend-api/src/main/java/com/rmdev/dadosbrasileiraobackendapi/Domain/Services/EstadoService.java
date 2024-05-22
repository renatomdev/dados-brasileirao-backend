package com.rmdev.dadosbrasileiraobackendapi.Domain.Services;

import com.rmdev.dadosbrasileiraobackendapi.Domain.MainService;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Estados;
import com.rmdev.dadosbrasileiraobackendapi.Infraestructure.EstadoRepository;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends MainService<Estados, Integer> {
    public EstadoService(EstadoRepository repository) {
        super(repository);
    }
}
