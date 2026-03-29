package com.baozistore.backend.repository;

import com.baozistore.backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliente, Long> {}