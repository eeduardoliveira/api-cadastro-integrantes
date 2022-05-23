package com.banktech.apicadastrointegrantes.controller;

import com.banktech.apicadastrointegrantes.model.UserModel;
import com.banktech.apicadastrointegrantes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/api/usuario")
    public List<UserModel> All() {
        return repository.findAll();
    }

    @PostMapping(path = "/api/usuario/cadastrar")
    public UserModel save(@RequestBody UserModel usuario) {

        return repository.save(usuario);
    }

    @PutMapping(path = "/api/usuario/{codigo}")
    public UserModel update(@RequestBody UserModel usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping(path = "api/usuario/{codigo}")
    public ResponseEntity delete(@RequestParam Integer codigo) {
        repository.deleteById(codigo);
        return new ResponseEntity<String>("User Deleted", HttpStatus.OK);
    }

    @GetMapping(path ="/api/usuario/{unidade}")
    public List<UserModel> consultaUnidade(@PathVariable("unidade") String unidade){
      return repository.findAllByUnidade("{unidade}");
    }


}


