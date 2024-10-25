package com.rmdev.dadosbrasileiraobackendapi.Domain.Models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_campeonato", nullable=false)
    private Campeonato Campeonato;

    private Integer rodada;
    private Date data_partida;

    @ManyToOne
    @JoinColumn(name="id_time_mandante", nullable=false)
    private Clube TimeMandante;

    @ManyToOne
    @JoinColumn(name="id_time_visitante", nullable=false)
    private Clube TimeVisitante;
    private Integer gols_mandante;
    private Integer gols_visitante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato getCampeonato() {
        return Campeonato;
    }

    public void setCampeonato(com.rmdev.dadosbrasileiraobackendapi.Domain.Models.Campeonato campeonato) {
        Campeonato = campeonato;
    }

    public Integer getRodada() {
        return rodada;
    }

    public void setRodada(Integer rodada) {
        this.rodada = rodada;
    }

    public Date getData_partida() {
        return data_partida;
    }

    public void setData_partida(Date data_partida) {
        this.data_partida = data_partida;
    }

    public Clube getTimeMandante() {
        return TimeMandante;
    }

    public void setTimeMandante(Clube timeMandante) {
        TimeMandante = timeMandante;
    }

    public Clube getTimeVisitante() {
        return TimeVisitante;
    }

    public void setTimeVisitante(Clube timeVisitante) {
        TimeVisitante = timeVisitante;
    }

    public Integer getGols_mandante() {
        return gols_mandante;
    }

    public void setGols_mandante(Integer gols_mandante) {
        this.gols_mandante = gols_mandante;
    }

    public Integer getGols_visitante() {
        return gols_visitante;
    }

    public void setGols_visitante(Integer gols_visitante) {
        this.gols_visitante = gols_visitante;
    }
}
