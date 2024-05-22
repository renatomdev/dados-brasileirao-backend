package com.rmdev.dadosbrasileiraobackendapi.Domain.Models;

import jakarta.persistence.*;

@Entity
public class Estadio {
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String apelido;
    @ManyToOne
    @JoinColumn(name="id_cidade", nullable=false)
    private Cidades cidades;
}
