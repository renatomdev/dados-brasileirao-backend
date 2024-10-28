package com.rmdev.dadosbrasileiraobackendapi.Infraestructure;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Views.RodadaView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato;

import java.util.List;

@Repository
public interface CampeonatoRepository extends CrudRepository<Campeonato, Integer> {

    @Query(value = "select distinct(rodada) from partida where id_campeonato = :id_campeonato", nativeQuery = true)
    List<RodadaView> GetRodadasPorCampeonato(@Param("id_campeonato") int id_campeonato);
}
