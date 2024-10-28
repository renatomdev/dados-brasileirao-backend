package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Partida;
import com.rmdev.dadosbrasileiraobackendapi.Domain.Views.RodadaView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PartidaRepository extends CrudRepository<Partida, Integer> {

    @Query(value = "select * from partida where id_campeonato = :id_campeonato", nativeQuery = true)
    List<Partida> FindPartidaPorCampeonato(@Param("id_campeonato") int id_campeonato);
}
