package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Arbitro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbitroRepository extends CrudRepository <Arbitro, Integer>{ }
