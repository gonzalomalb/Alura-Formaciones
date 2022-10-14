package com.proyect.module;

public class TestClassType {
    private String name;
    private int number;
    private int type;

    public TestClassType(String name, int number, int type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.name + " - " + String.valueOf(this.getNumber());
    }
}
