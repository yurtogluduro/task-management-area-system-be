package com.example.taskmanagementareasystem.controller;

import com.example.taskmanagementareasystem.dto.UnitDto;
import com.example.taskmanagementareasystem.dto.UnitPositionDto;
import com.example.taskmanagementareasystem.service.UnitPositionService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/unitPosition")
@CrossOrigin(origins = "http://localhost:3000")
public class UnitPositionController {

    private final UnitPositionService service;

    public UnitPositionController(UnitPositionService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<UnitPositionDto> create(@RequestBody @Valid UnitPositionDto unitDto) {
        return new ResponseEntity<>(service.save(unitDto), HttpStatus.OK);
    }

    @GetMapping("/getByUnitId/{unitId}")
    public ResponseEntity<List<UnitPositionDto>> getById(@PathVariable @NotNull Long unitId) {
        return ResponseEntity.ok(service.getByUnitId(unitId));
    }

}
