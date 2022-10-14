package com.proyect.test;

import java.util.Collection;
import java.util.HashSet;

import com.proyect.module.Person;

public class Test10 {
    public static void main(String[] args) {
        
        Person person1 = new Person("Pablo", "001");
        Person person2 = new Person("Diego", "002");
        Person person3 = new Person("Camila", "003");
        Person person4 = new Person("Laura", "004");

        Collection<Person> listPerson = new HashSet<>(); // or new ArrayList(), new LinkedList();

        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person4);

        System.out.println(listPerson.contains(person1));

        Person newPerson = new Person("Pablo", "001");

        System.out.println(listPerson.contains(newPerson));
        System.out.println(person1.equals(newPerson));
    }
}
