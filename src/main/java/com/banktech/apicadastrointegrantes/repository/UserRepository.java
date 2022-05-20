package com.banktech.apicadastrointegrantes.repository;

import com.banktech.apicadastrointegrantes.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<UserModel, Integer> { // < Classe(modelo de dados), id da classe (tipo d o id)


    List<UserModel> findAllByUnidade(String unidade);

    UserModel findbyLogin(String login);
}
