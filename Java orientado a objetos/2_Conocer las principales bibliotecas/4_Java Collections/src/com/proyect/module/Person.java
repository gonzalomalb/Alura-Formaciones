package com.proyect.module;

public class Person{

    private String name;
    private String code;

    public Person(String name, String code) {
        this.name = name;
        this.code = code;
    }
    
    public String getName() { return name; }

    public String getCode() { return code; }


    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.name.equals(person.getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
