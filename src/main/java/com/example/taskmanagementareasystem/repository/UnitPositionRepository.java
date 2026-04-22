package com.example.taskmanagementareasystem.repository;

import com.example.taskmanagementareasystem.entity.UnitEntity;
import com.example.taskmanagementareasystem.entity.UnitPositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitPositionRepository extends JpaRepository<UnitPositionEntity, Long> {

}
