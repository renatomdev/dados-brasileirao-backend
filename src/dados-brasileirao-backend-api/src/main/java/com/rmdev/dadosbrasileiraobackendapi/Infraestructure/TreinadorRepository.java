package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Treinador;

@Repository
public interface TreinadorRepository extends CrudRepository<Treinador, Integer> { }
