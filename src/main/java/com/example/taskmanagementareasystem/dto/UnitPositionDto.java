package com.example.taskmanagementareasystem.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class UnitPositionDto extends BaseModelDto{

    private Long id;
    @NotNull
    private Double lat;
    @NotNull
    private Double lng;
    private UnitPositionDto unit;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public UnitPositionDto getUnit() {
        return unit;
    }

    public void setUnit(UnitPositionDto unit) {
        this.unit = unit;
    }
}
