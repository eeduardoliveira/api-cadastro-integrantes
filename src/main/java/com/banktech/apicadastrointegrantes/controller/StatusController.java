package com.banktech.apicadastrointegrantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/api/status") //Função GET
    public String check(){return "online";}
}
