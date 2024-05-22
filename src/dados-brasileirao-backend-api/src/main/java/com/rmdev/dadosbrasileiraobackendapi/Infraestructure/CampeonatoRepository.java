package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato;

@Repository
public interface CampeonatoRepository extends CrudRepository<Campeonato, Integer> { }
