package com.rmdev.dadosbrasileiraobackendapi.Domain.Models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ano;
    private Date data_inicio;
    private Date data_fim;

    @ManyToOne
    @JoinColumn(name="campeao", referencedColumnName="id", nullable=false)
    private Clube campeao;

    @ManyToOne
    @JoinColumn(name="vicecampeao", referencedColumnName="id", nullable=false)
    private Clube vicecampeao;

    private String resumo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public Clube getCampeao() {
        return campeao;
    }

    public void setCampeao(Clube campeao) {
        this.campeao = campeao;
    }

    public Clube getVicecampeao() {
        return vicecampeao;
    }

    public void setVicecampeao(Clube vicecampeao) {
        this.vicecampeao = vicecampeao;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}
