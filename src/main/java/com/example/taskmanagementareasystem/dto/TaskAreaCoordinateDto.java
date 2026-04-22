package com.example.taskmanagementareasystem.dto;

import lombok.Getter;
import lombok.Setter;

public class TaskAreaCoordinateDto extends BaseModelDto{

    public TaskAreaCoordinateDto(){
        super();
    }
    private Double latitude;
    private Double longitude;
    private Double altitude;
    private Integer orderIndex;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }
}
