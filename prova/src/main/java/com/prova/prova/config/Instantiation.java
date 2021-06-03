package com.prova.prova.config;

import com.prova.prova.entities.Client;
import com.prova.prova.entities.Task;
import com.prova.prova.repositories.ClientInterface;
import com.prova.prova.repositories.TaskInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class Instantiation implements CommandLineRunner {

    @Autowired
    private final ClientInterface clientInterface;

    @Autowired
    private final TaskInterface taskInterface;

    public Instantiation(ClientInterface clientInterface, TaskInterface taskInterface) {
        this.clientInterface = clientInterface;
        this.taskInterface = taskInterface;
    }

    @Override
    public void run(String... arts) throws Exception{
        clientInterface.deleteAll();
        Client client1 = new Client(1, "Luisa", "luisaghellereramos@gmail.com");
        Client client2 = new Client(2, "Laura", "lauraghellere@gmail.com");
        Client client3 = new Client(3, "Raul", "raulrios0907@outlook.com");

        clientInterface.saveAll(Arrays.asList(client1, client2, client3));

        taskInterface.deleteAll();
        Task task1 = new Task(1, "lavar louça", "limpar tudo que estiver na pia", client3);
        Task task2 = new Task(2, "fazer bolo", "fazer bolo de cenoura com cobertura", client2);
        Task task3 = new Task(3, "arrumar", "arrumar todo o quarto", client1);

        taskInterface.saveAll(Arrays.asList(task1, task2, task3));

    }

}
