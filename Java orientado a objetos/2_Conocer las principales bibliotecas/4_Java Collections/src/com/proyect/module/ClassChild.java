package com.proyect.module;

public class ClassChild{

    private String name;

    public ClassChild(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
