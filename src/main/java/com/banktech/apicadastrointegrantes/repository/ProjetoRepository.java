package com.banktech.apicadastrointegrantes.repository;
import com.banktech.apicadastrointegrantes.model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjetoRepository extends JpaRepository<ProjetoModel, Long> {
    ProjetoModel deleteByNome(String nome);
}
