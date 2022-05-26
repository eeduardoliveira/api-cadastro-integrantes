package com.banktech.apicadastrointegrantes.repository;

import com.banktech.apicadastrointegrantes.model.ProcessoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessoRepository extends JpaRepository<ProcessoModel, Long> {
    ProcessoModel deleteByNome(String nome);
}
