package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Estadio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends CrudRepository<Estadio, Integer> {}
