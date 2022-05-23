package com.banktech.apicadastrointegrantes.controller;

import com.banktech.apicadastrointegrantes.model.GerenciaModel;
import com.banktech.apicadastrointegrantes.repository.GerenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GerenciaController {

    @Autowired
    private GerenciaRepository Grepository;

    @PostMapping(path = "/api/gerencia/cadastrar")
    public Object save(@RequestBody GerenciaModel gerencia){
        return Grepository.save(gerencia);
    }
    @GetMapping(path = "/api/{nome}")
    public List<GerenciaModel> All() {
        return Grepository.findAll();
    }


    @DeleteMapping(path = "api/{nome}")
    public ResponseEntity delete(@RequestParam Integer codigo) {
        Grepository.deleteById(codigo);
        return new ResponseEntity<String>("Gerencia Deleted", HttpStatus.OK);
    }


}


