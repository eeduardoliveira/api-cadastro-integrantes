package com.banktech.apicadastrointegrantes.repository;

import com.banktech.apicadastrointegrantes.model.GerenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface GerenciaRepository extends JpaRepository<GerenciaModel, Integer> {
}
