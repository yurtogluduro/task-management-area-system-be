package com.example.taskmanagementareasystem.service;

import com.example.taskmanagementareasystem.dto.TaskAreaDto;
import com.example.taskmanagementareasystem.dto.UnitDto;
import com.example.taskmanagementareasystem.entity.UnitEntity;
import com.example.taskmanagementareasystem.mapper.TaskAreaMapper;
import com.example.taskmanagementareasystem.mapper.UnitMapper;
import com.example.taskmanagementareasystem.repository.UnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService{

    private final UnitRepository unitRepository;
    private final UnitMapper unitMapper;
    private final TaskAreaService taskAreaService;
    private final TaskAreaMapper taskAreaMapper;

    public UnitServiceImpl(UnitRepository unitRepository, UnitMapper unitMapper, TaskAreaService taskAreaService, TaskAreaMapper taskAreaMapper){
        this.unitRepository = unitRepository;
        this.unitMapper = unitMapper;
        this.taskAreaService = taskAreaService;

        this.taskAreaMapper = taskAreaMapper;
    }

    @Override
    public UnitDto save(UnitDto unitDtoModel){

        TaskAreaDto taskArea = taskAreaService.getById(unitDtoModel.getTaskAreaId());
        UnitEntity unit = unitMapper.toEntity(unitDtoModel);
        unit.setTaskArea(taskAreaMapper.toEntity(taskArea));
        return unitMapper.toDto(unitRepository.save(unit));
    }

    @Override
    public List<UnitDto> getAllTasks(){
        return unitMapper.toDtoList(unitRepository.findAll());
    }

    @Override
    public UnitDto getById(Long id){
        Optional<UnitEntity> optionalUnit = unitRepository.findById(id);
        if(optionalUnit.isPresent()){
            return unitMapper.toDto(optionalUnit.get());
        }
        throw new RuntimeException("Birim bulunamadı");
    }

}
