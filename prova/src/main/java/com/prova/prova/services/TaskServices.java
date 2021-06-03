package com.prova.prova.services;

import com.prova.prova.entities.Task;
import com.prova.prova.mappers.TaskMapper;
import com.prova.prova.repositories.TaskInterface;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TaskServices {
    private final TaskInterface taskInterface;

    public TaskServices(TaskInterface taskInterface) {
        this.taskInterface = taskInterface;
    }

    public List<Task> taskList(){
        return taskInterface.findAll();
    }

    @Transactional
    public Task newTask(Task task){
        return taskInterface.save(TaskMapper.INSTANCE.toTask(task));
    }
}









