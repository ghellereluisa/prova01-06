package com.prova.prova.repositories;

import com.prova.prova.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientInterface extends JpaRepository<Client, Long> {
}
