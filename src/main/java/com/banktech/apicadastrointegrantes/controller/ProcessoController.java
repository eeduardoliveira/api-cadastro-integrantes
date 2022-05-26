package com.banktech.apicadastrointegrantes.controller;

import com.banktech.apicadastrointegrantes.model.ProcessoModel;
import com.banktech.apicadastrointegrantes.repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProcessoController {


    @Autowired
    private ProcessoRepository repository;


    @GetMapping(path = "/processo")
    public List<ProcessoModel> consulta(){
        return repository.findAll();
    }

    @PostMapping(path = "/processo/cadastrar")
    public ProcessoModel create(@RequestBody ProcessoModel processo)  {
        return repository.save(processo);
    }

    @PutMapping(path = "/processo/{id}")
    public ProcessoModel edit(@RequestBody ProcessoModel processo){
        return repository.save(processo);
    }

    @DeleteMapping(path = "/processo/{id}")
    public ProcessoModel delet(@RequestParam String nome){
        return repository.deleteByNome(nome);
    }


}
