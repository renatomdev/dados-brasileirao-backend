package com.rmdev.dadosbrasileiraobackendapi.Domain.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Clube {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String nome_completo;
    private Date data_fundacao;
    private String historia;
    private String distintivo;

    @ManyToOne
    @JoinColumn(name="id_cidade", nullable=false)
    private Cidades cidades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public Date getData_fundacao() {
        return data_fundacao;
    }

    public void setData_fundacao(Date data_fundacao) {
        this.data_fundacao = data_fundacao;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getDistintivo() {
        return distintivo;
    }

    public void setDistintivo(String distintivo) {
        this.distintivo = distintivo;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }
}
