package com.proyect.module;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Class implements Comparable<Class> {

    private String name;
    private int number;
    private List<ClassChild> classList = new ArrayList<>();
    private Collection<Person> personList = new HashSet<>();
    //private Collection<Person> personList = new LinkedHashSet<>();
    private Map<String, Person> personMap = new HashMap<>();
    //private Map<String, Person> personMap = new LinkedHashMap<>();

    public Class(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Class(String name, int number, List<ClassChild> classList) {
        this.name = name;
        this.number = number;
        this.classList = classList;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setClassList(List<ClassChild> classList) {
        this.classList = classList;
    }

    public void addClass(ClassChild class2) {
        this.classList.add(class2);
    }

    public List<ClassChild> getClassList() {
        return Collections.unmodifiableList(classList);
    }

    public void addPerson(Person person) {
        this.personList.add(person);
        this.personMap.put(person.getCode(), person);
    }
    
    public boolean verifyPerson(Person person) {
        return this.personList.contains(person);
    }

    public Collection<Person> getPersonList() {
        return personList;
    }

    public Map<String, Person> getPersonMap() {
        return personMap;
    }

    @Override
    public String toString() {
        return this.name + " " + this.number;
    }

    @Override
    public int compareTo(Class o) {
        return this.name.compareTo(o.getName());
    }

}
