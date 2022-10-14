package com.proyect.module;

public class TestClass {
    private String name;
    private int number;

    public TestClass(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return this.name + " - " + String.valueOf(this.getNumber());
    }
}
