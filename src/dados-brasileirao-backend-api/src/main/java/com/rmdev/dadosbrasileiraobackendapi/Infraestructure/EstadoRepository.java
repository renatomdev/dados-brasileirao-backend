package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Estados;

@Repository
public interface EstadoRepository extends CrudRepository<Estados, Integer> { }
