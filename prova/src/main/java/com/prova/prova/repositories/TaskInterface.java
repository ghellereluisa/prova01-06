package com.prova.prova.repositories;

import com.prova.prova.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskInterface extends JpaRepository<Task, Long> {
}
