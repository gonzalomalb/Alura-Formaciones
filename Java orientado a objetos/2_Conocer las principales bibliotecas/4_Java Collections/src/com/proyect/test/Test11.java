package com.proyect.test;

import com.proyect.module.Class;
import com.proyect.module.Person;

public class Test11 {
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

        Person newPerson = new Person("Pablo", "001");

        System.out.println(object1.verifyPerson(newPerson));
        System.out.println(person1.equals(newPerson));
    }
}
