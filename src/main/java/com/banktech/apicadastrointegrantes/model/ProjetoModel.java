package com.banktech.apicadastrointegrantes.model;

import javax.persistence.*;

@Entity
@Table(name = "PROJETO")
public class ProjetoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PROJETO")
    private long id;

    @ManyToOne
    @JoinColumn(name = "ID_PROCESSO")
    private ProcessoModel processo;

    @Column(name = "NO_NOMEPROJETO", length = 255, nullable = false)
    private String nome;

    @Column(name = "DS_DESCRICAO", length = 1000, nullable = false)
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProcessoModel getProcesso() {
        return processo;
    }
}
