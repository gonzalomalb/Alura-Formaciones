package com.proyect.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.proyect.module.Class;

public class Test4 {
    public static void main(String[] args) {
        
        Class object1 = new Class("Geometry", 1);
        Class object2 = new Class("Physics", 2);
        Class object3 = new Class("Chemistry", 3);
        Class object4 = new Class("History", 4);

        ArrayList<Class> list = new ArrayList<>();
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        //Sort with Comparator Without implementing Comparable on the class
        Collections.sort(list, Comparator.comparing(Class::getName).reversed());
        System.out.println(list);

        List<Class> objectList = list.stream().filter(SampleObject -> !SampleObject.getName().equalsIgnoreCase("Physics"))
            .sorted(Comparator.comparingInt(Class::getNumber)).collect(Collectors.toList());
        System.out.println(objectList);
    }
}
