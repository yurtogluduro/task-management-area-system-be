package com.example.taskmanagementareasystem.service;

import com.example.taskmanagementareasystem.dto.TaskAreaDto;
import com.example.taskmanagementareasystem.mapper.TaskAreaMapper;
import com.example.taskmanagementareasystem.repository.TaskAreaRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskAreaServiceImpl implements TaskAreaService{

    private TaskAreaRepository taskAreaRepository;
    private TaskAreaMapper mapper;
    TaskAreaServiceImpl(TaskAreaRepository taskAreaRepository, TaskAreaMapper mapper){
        this.taskAreaRepository = taskAreaRepository;
        this.mapper = mapper;
    }

    @Override
    public TaskAreaDto save(TaskAreaDto taskAreaDto){
       return mapper.toDto(taskAreaRepository.save(mapper.toEntity(taskAreaDto)));
    }

}
