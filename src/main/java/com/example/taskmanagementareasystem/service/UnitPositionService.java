package com.example.taskmanagementareasystem.service;

import com.example.taskmanagementareasystem.dto.UnitPositionDto;

import java.util.List;

public interface UnitPositionService {
    UnitPositionDto save(UnitPositionDto unitPositionDto);

    List<UnitPositionDto> getByUnitId(Long unitId);

}
