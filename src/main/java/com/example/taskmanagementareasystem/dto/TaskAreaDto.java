package com.example.taskmanagementareasystem.dto;

import com.example.taskmanagementareasystem.common.TaskAreaTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class TaskAreaDto extends BaseModelDto{

    public TaskAreaDto(){
        super();
    }
    private String taskName;
    private String description;
    private List<TaskAreaCoordinateDto> coordinates;
    private TaskAreaTypeEnum type;
    /*private Date startDate;
    private Date endDate;*/
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TaskAreaCoordinateDto> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<TaskAreaCoordinateDto> coordinates) {
        this.coordinates = coordinates;
    }

    public TaskAreaTypeEnum getType() {
        return type;
    }

    public void setType(TaskAreaTypeEnum type) {
        this.type = type;
    }

    /*public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }*/

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
