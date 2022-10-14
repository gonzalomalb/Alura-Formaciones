package com.proyect.test;

import java.util.Optional;

import com.proyect.module.Class;
import com.proyect.module.Person;

public class Test13 {
    public static void main(String[] args) {
        
        Class object1 = new Class("Geometry", 1);

        Person person1 = new Person("Pablo", "001");
        Person person2 = new Person("Diego", "002");
        Person person3 = new Person("Camila", "003");
        Person person4 = new Person("Laura", "004");

        object1.addPerson(person1);
        object1.addPerson(person2);
        object1.addPerson(person3);
        object1.addPerson(person4);

        //object1.getPersonList().forEach(person -> System.out.println(person));

        Optional<Person> person = object1.getPersonList().stream().filter(p -> "003".equalsIgnoreCase(p.getCode())).findFirst();

        if (person.isPresent()){
            System.out.println(person.get());
        }

        Person personMap = object1.getPersonMap().get("003");

        System.out.println(personMap);
    }
}
