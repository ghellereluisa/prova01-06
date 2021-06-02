package com.prova.prova.entities;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String taskName;
    private String taskGoal;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    public Task() {
    }

    public Task(long id, String taskName, String taskGoal, Client client) {
        this.id = id;
        this.taskName = taskName;
        this.taskGoal = taskGoal;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskGoal() {
        return taskGoal;
    }

    public void setTaskGoal(String taskGoal) {
        this.taskGoal = taskGoal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
