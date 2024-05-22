package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Clube;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubeRepository extends CrudRepository<Clube, Integer> {}
