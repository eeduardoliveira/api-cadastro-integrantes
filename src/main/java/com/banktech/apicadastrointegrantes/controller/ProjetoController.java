package com.banktech.apicadastrointegrantes.controller;

import com.banktech.apicadastrointegrantes.model.ProjetoModel;
import com.banktech.apicadastrointegrantes.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ProjetoController {

    @Autowired
    private ProjetoRepository repository;


    @PostMapping(path = "/processo/cadastrar")
    public ProjetoModel create(@RequestBody ProjetoModel projeto)  {
        return repository.save(projeto);
    }

    @PutMapping(path = "/processo/{id}")
    public ProjetoModel edit(@RequestBody ProjetoModel projeto){
        return repository.save(projeto);
    }

    @DeleteMapping(path = "/processo/{id}")
    public ProjetoModel delet(@RequestParam String nome){
        return repository.deleteByNome(nome);
    }

}
