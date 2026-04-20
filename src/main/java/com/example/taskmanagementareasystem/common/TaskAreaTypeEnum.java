package com.example.taskmanagementareasystem.common;

public enum TaskAreaTypeEnum {

    RECONNAISSANCE("Keşif"),
    SURVEILLANCE("Gözetleme"),
    LOGISTICS("Lojistik"),
    PATROL("Devriye"),
    EMERGENCY("Acil Durum");

    private final String label;

    TaskAreaTypeEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
