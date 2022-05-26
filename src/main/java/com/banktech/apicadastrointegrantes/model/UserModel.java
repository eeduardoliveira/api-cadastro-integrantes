package com.banktech.apicadastrointegrantes.model;


import javax.persistence.*;

@Entity(name = "usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer codigo;

    @Column(nullable = false, length = 100)
    public String nome;

    @Column(nullable = false, length = 5)
    public Integer matricula;

    @JoinColumn( name = "")
    public String unidade;

    @Column(nullable = false, length = 10)
    public String login;

    @Column(nullable = false, length = 10)
    public String senha;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}



