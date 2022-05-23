package com.banktech.apicadastrointegrantes.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "gerencia")
public class GerenciaModel {

    @Id
    public Integer codigo;

    @Column(nullable = false, length = 100)
    public String nome;

}
