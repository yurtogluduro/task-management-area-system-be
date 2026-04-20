package com.example.taskmanagementareasystem.entity;

import com.example.taskmanagementareasystem.common.TaskAreaTypeEnum;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "task_area")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskAreaEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_area_seq")
    @SequenceGenerator(name = "task_area_seq", sequenceName = "task_area_seq", allocationSize = 1)
    private Long id;
    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "description")
    private String description;

    @Column(name = "area_type")
    private TaskAreaTypeEnum type;
    /*@Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;
    */
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "taskArea", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("orderIndex ASC")
    private List<TaskAreaCoordinateEntity> coordinates = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public TaskAreaTypeEnum getType() {
        return type;
    }

    public void setType(TaskAreaTypeEnum type) {
        this.type = type;
    }


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

    public List<TaskAreaCoordinateEntity> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<TaskAreaCoordinateEntity> coordinates) {
        this.coordinates = coordinates;
    }
}
