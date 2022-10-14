package com.proyect.module;

import java.io.Serializable;

public class Client implements Serializable{
    
    // private static final long serialVersionUID = 1L;
    private String name;
    private int id;

    public Client(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
