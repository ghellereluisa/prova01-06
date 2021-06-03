package com.prova.prova.resources;

import com.prova.prova.entities.Task;
import com.prova.prova.services.TaskServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class TaskResources {
  private final TaskServices taskServices;

  public TaskResources(TaskServices taskServices) {
    this.taskServices = taskServices;
  }

  @GetMapping
  public ResponseEntity<List<Task>> taskList() {
    return ResponseEntity.ok(taskServices.taskList());
  }

  @PostMapping
  public ResponseEntity<Task> newTask(@RequestBody @Valid Task task) {
    return new ResponseEntity<>(taskServices.newTask(task), HttpStatus.CREATED);
  }
}
