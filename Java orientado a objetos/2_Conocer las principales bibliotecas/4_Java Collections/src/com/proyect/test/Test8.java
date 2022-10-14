package com.proyect.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.proyect.module.Class;

public class Test8 {
    public static void main(String[] args) {
        
        Class object1 = new Class("Geometry", 1);
        Class object2 = new Class("Physics", 2);
        Class object3 = new Class("Chemistry", 3);
        Class object4 = new Class("History", 4);
        Class object5 = new Class("Geometry", 5);
        Class object6 = new Class("Physics", 6);

        ArrayList<Class> list = new ArrayList<>();
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);

        System.out.println(list);

        System.out.println("average number using stream: " + list.stream().mapToInt(Class::getNumber).average().getAsDouble());
        System.out.println("max number using stream: " + list.stream().mapToInt(Class::getNumber).max().getAsInt());
        System.out.println("min number using stream: " + list.stream().mapToInt(Class::getNumber).min().getAsInt());

        Map<String, List<Class>> groupClass = list.stream().collect(Collectors.groupingBy(Class::getName));
        groupClass.forEach((key, value) -> System.out.println(key + " - " + value.size()));

        
        System.out.println("sum of numbers using parallelStream: " + list.parallelStream().mapToInt(Class::getNumber).sum());
    }
}
