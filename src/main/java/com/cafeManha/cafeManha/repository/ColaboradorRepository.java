package com.cafeManha.cafeManha.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cafeManha.cafeManha.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, UUID> {
    List<Colaborador> findByCpf(String cpf);
}