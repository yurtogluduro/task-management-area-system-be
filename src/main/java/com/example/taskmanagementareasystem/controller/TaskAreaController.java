package com.example.taskmanagementareasystem.controller;

import com.example.taskmanagementareasystem.dto.TaskAreaDto;
import com.example.taskmanagementareasystem.service.TaskAreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task-area")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class TaskAreaController {

    private final TaskAreaService taskAreaService;

    @PostMapping
    public ResponseEntity<TaskAreaDto> create(@RequestBody TaskAreaDto taskAreaDto) {
        TaskAreaDto savedTask = taskAreaService.save(taskAreaDto);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    /*
    @GetMapping
    public ResponseEntity<List<TaskAreaDto>> getAll() {
        return ResponseEntity.ok(taskAreaService.getAllTasks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskAreaDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(taskAreaService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        taskAreaService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
     */
}