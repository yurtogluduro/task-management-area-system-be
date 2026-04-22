package com.example.taskmanagementareasystem.service;

import com.example.taskmanagementareasystem.dto.UnitPositionDto;
import com.example.taskmanagementareasystem.entity.UnitPositionEntity;
import com.example.taskmanagementareasystem.mapper.UnitPositionMapper;
import com.example.taskmanagementareasystem.repository.UnitPositionRepository;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UnitPositionServiceImpl implements UnitPositionService{

    private final UnitPositionRepository repository;
    private final UnitPositionMapper mapper;

    private static final double EARTH_RADIUS = 6371.0;
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
    public List<UnitPositionDto> getByUnitId(Long unitId){
        return mapper.toDtoList(repository.findByUnit_Id(unitId));
    }

}
