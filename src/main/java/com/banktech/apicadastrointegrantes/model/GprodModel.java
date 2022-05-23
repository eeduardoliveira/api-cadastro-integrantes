package com.banktech.apicadastrointegrantes.model;



import javax.persistence.*;

@Entity(name = "gerencia")
public class GprodModel {

    @Id
    public Integer codigo; // foreign key unidade

    @Column(nullable = false, length = 100)
    public String nome;

    @Column(nullable = false, length = 5)
    public Integer matricula;


}