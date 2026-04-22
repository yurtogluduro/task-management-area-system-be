package com.example.taskmanagementareasystem.service;

import com.example.taskmanagementareasystem.dto.TaskAreaDto;
import com.example.taskmanagementareasystem.dto.UnitPositionDto;
import com.example.taskmanagementareasystem.entity.TaskAreaEntity;
import com.example.taskmanagementareasystem.mapper.UnitPositionMapper;
import com.example.taskmanagementareasystem.repository.UnitPositionRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UnitPositionServiceImpl implements UnitPositionService{

    private final UnitPositionRepository repository;
    private final UnitPositionMapper mapper;

    public UnitPositionServiceImpl(UnitPositionRepository repository, UnitPositionMapper mapper){

        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public UnitPositionDto save(UnitPositionDto unitPositionDto){
        if(Objects.isNull(unitPositionDto.getUnit()) || Objects.isNull(unitPositionDto.getUnit().getId())){
            throw new RuntimeException("Birim bilgisi olmadan kayıt yapılamaz!");
        }
        return mapper.toDto(repository.save(mapper.toEntity(unitPositionDto)));
    }

    @Override
    public TaskAreaDto getByUnitId(Long unitId){
        Optional<TaskAreaEntity> optTaskArea = repository.findById(id);
        if(optTaskArea.isPresent()){
            return mapper.toDto(optTaskArea.get());
        }
        throw new RuntimeException("Görev Alanı bulunamadı");
    }

}
