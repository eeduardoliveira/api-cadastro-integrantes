package com.banktech.apicadastrointegrantes.model;


import javax.persistence.*;

@Entity
@Table(name = "PROCESSO")
public class ProcessoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PROCESSO")
    private long id;


    @Column(name = "NO_PROCESSO", length = 255, nullable = false)
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}