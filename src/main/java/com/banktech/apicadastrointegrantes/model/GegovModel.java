package com.banktech.apicadastrointegrantes.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "gerencia")
public class GegovModel {

    @Id
    public Integer codigo; // foreign key unidade

    @Column(nullable = false, length = 100)
    public String nome;

    @Column(nullable = false, length = 5)
    public Integer matricula;


}
