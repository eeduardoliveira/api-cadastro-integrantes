package com.banktech.apicadastrointegrantes.controller;
import java.io.File;
import java.time.LocalDate;

import javax.transaction.Transactional;

import com.banktech.apicadastrointegrantes.model.Role;
import com.banktech.apicadastrointegrantes.model.UserModel;
import com.banktech.apicadastrointegrantes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.RestController;


@Component
@Transactional
public class AuthController implements CommandLineRunner {


    @Autowired
    private UserRepository usuarioRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        File jsonFile = ResourceUtils.getFile("classpath:usuario.json");
        ObjectMapper usuarioMapper = new ObjectMapper();
        JsonNode dataNode = usuarioMapper.readTree(jsonFile).get("data")
        UserModel u1 = new UserModel("Eduardo", passwordEncoder.encode("123"));
        u1.setRole(Role.ADMIN.getNome());

        Usuario u2 = new Usuario("user", passwordEncoder.encode("user"));

        usuarioRepo.save(u1);
        usuarioRepo.save(u2);