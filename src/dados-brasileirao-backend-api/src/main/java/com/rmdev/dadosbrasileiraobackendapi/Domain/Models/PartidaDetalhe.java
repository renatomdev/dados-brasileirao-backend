package com.rmdev.dadosbrasileiraobackendapi.Domain.Models;

import jakarta.persistence.*;

@Entity
public class PartidaDetalhe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_partida", nullable=false)
    private Partida partida;

    @ManyToOne
    @JoinColumn(name="id_estadio")
    private Estadio estadio;

    @ManyToOne
    @JoinColumn(name="id_arbitro")
    private Arbitro arbitro;

    @ManyToOne
    @JoinColumn(name="id_treinador_mandante")
    private Treinador treinador_mandante;

    @ManyToOne
    @JoinColumn(name="id_treinador_visitante")
    private Treinador treinador_visitante;

    private Integer publico;
    private Integer publico_maximo;
    private Integer colocacao_mandante;
    private Integer colocacao_visitante;
    private Integer valor_equipe_titular_mandante;
    private Integer valor_equipe_titular_visitante;
    private Double idade_media_titular_mandante;
    private Double idade_media_titular_visitante;
    private Integer gols_1_tempo_mandante;
    private Integer gols_1_tempo_visitante;
    private Integer escanteios_mandante;
    private Integer escanteios_visitante;
    private Integer faltas_mandante;
    private Integer faltas_visitante;
    private Integer chutes_bola_parada_mandante;
    private Integer chutes_bola_parada_visitante;
    private Integer defesas_mandante;
    private Integer defesas_visitante;
    private Integer impedimentos_mandante;
    private Integer impedimentos_visitante;
    private Integer chutes_mandante;
    private Integer chutes_visitante;
    private Integer chutes_fora_mandante;
    private Integer chutes_fora_visitante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Treinador getTreinador_mandante() {
        return treinador_mandante;
    }

    public void setTreinador_mandante(Treinador treinador_mandante) {
        this.treinador_mandante = treinador_mandante;
    }

    public Treinador getTreinador_visitante() {
        return treinador_visitante;
    }

    public void setTreinador_visitante(Treinador treinador_visitante) {
        this.treinador_visitante = treinador_visitante;
    }

    public Integer getPublico() {
        return publico;
    }

    public void setPublico(Integer publico) {
        this.publico = publico;
    }

    public Integer getPublico_maximo() {
        return publico_maximo;
    }

    public void setPublico_maximo(Integer publico_maximo) {
        this.publico_maximo = publico_maximo;
    }

    public Integer getColocacao_mandante() {
        return colocacao_mandante;
    }

    public void setColocacao_mandante(Integer colocacao_mandante) {
        this.colocacao_mandante = colocacao_mandante;
    }

    public Integer getColocacao_visitante() {
        return colocacao_visitante;
    }

    public void setColocacao_visitante(Integer colocacao_visitante) {
        this.colocacao_visitante = colocacao_visitante;
    }

    public Integer getValor_equipe_titular_mandante() {
        return valor_equipe_titular_mandante;
    }

    public void setValor_equipe_titular_mandante(Integer valor_equipe_titular_mandante) {
        this.valor_equipe_titular_mandante = valor_equipe_titular_mandante;
    }

    public Integer getValor_equipe_titular_visitante() {
        return valor_equipe_titular_visitante;
    }

    public void setValor_equipe_titular_visitante(Integer valor_equipe_titular_visitante) {
        this.valor_equipe_titular_visitante = valor_equipe_titular_visitante;
    }

    public Double getIdade_media_titular_mandante() {
        return idade_media_titular_mandante;
    }

    public void setIdade_media_titular_mandante(Double idade_media_titular_mandante) {
        this.idade_media_titular_mandante = idade_media_titular_mandante;
    }

    public Double getIdade_media_titular_visitante() {
        return idade_media_titular_visitante;
    }

    public void setIdade_media_titular_visitante(Double idade_media_titular_visitante) {
        this.idade_media_titular_visitante = idade_media_titular_visitante;
    }

    public Integer getGols_1_tempo_mandante() {
        return gols_1_tempo_mandante;
    }

    public void setGols_1_tempo_mandante(Integer gols_1_tempo_mandante) {
        this.gols_1_tempo_mandante = gols_1_tempo_mandante;
    }

    public Integer getGols_1_tempo_visitante() {
        return gols_1_tempo_visitante;
    }

    public void setGols_1_tempo_visitante(Integer gols_1_tempo_visitante) {
        this.gols_1_tempo_visitante = gols_1_tempo_visitante;
    }

    public Integer getEscanteios_mandante() {
        return escanteios_mandante;
    }

    public void setEscanteios_mandante(Integer escanteios_mandante) {
        this.escanteios_mandante = escanteios_mandante;
    }

    public Integer getEscanteios_visitante() {
        return escanteios_visitante;
    }

    public void setEscanteios_visitante(Integer escanteios_visitante) {
        this.escanteios_visitante = escanteios_visitante;
    }

    public Integer getFaltas_mandante() {
        return faltas_mandante;
    }

    public void setFaltas_mandante(Integer faltas_mandante) {
        this.faltas_mandante = faltas_mandante;
    }

    public Integer getFaltas_visitante() {
        return faltas_visitante;
    }

    public void setFaltas_visitante(Integer faltas_visitante) {
        this.faltas_visitante = faltas_visitante;
    }

    public Integer getChutes_bola_parada_mandante() {
        return chutes_bola_parada_mandante;
    }

    public void setChutes_bola_parada_mandante(Integer chutes_bola_parada_mandante) {
        this.chutes_bola_parada_mandante = chutes_bola_parada_mandante;
    }

    public Integer getChutes_bola_parada_visitante() {
        return chutes_bola_parada_visitante;
    }

    public void setChutes_bola_parada_visitante(Integer chutes_bola_parada_visitante) {
        this.chutes_bola_parada_visitante = chutes_bola_parada_visitante;
    }

    public Integer getDefesas_mandante() {
        return defesas_mandante;
    }

    public void setDefesas_mandante(Integer defesas_mandante) {
        this.defesas_mandante = defesas_mandante;
    }

    public Integer getDefesas_visitante() {
        return defesas_visitante;
    }

    public void setDefesas_visitante(Integer defesas_visitante) {
        this.defesas_visitante = defesas_visitante;
    }

    public Integer getImpedimentos_mandante() {
        return impedimentos_mandante;
    }

    public void setImpedimentos_mandante(Integer impedimentos_mandante) {
        this.impedimentos_mandante = impedimentos_mandante;
    }

    public Integer getImpedimentos_visitante() {
        return impedimentos_visitante;
    }

    public void setImpedimentos_visitante(Integer impedimentos_visitante) {
        this.impedimentos_visitante = impedimentos_visitante;
    }

    public Integer getChutes_mandante() {
        return chutes_mandante;
    }

    public void setChutes_mandante(Integer chutes_mandante) {
        this.chutes_mandante = chutes_mandante;
    }

    public Integer getChutes_visitante() {
        return chutes_visitante;
    }

    public void setChutes_visitante(Integer chutes_visitante) {
        this.chutes_visitante = chutes_visitante;
    }

    public Integer getChutes_fora_mandante() {
        return chutes_fora_mandante;
    }

    public void setChutes_fora_mandante(Integer chutes_fora_mandante) {
        this.chutes_fora_mandante = chutes_fora_mandante;
    }

    public Integer getChutes_fora_visitante() {
        return chutes_fora_visitante;
    }

    public void setChutes_fora_visitante(Integer chutes_fora_visitante) {
        this.chutes_fora_visitante = chutes_fora_visitante;
    }
}
