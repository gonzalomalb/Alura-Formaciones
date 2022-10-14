package com.proyect.test;

import java.util.ArrayList;

import com.proyect.module.Class;

public class Test7 {
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

        int sum = 0;
        for (Class cls : list) {
            sum += cls.getNumber();
        }
        System.out.println("sum of numbers using a for: " + sum);
        System.out.println("sum of numbers using stream: " + list.stream().mapToInt(Class::getNumber).sum());

        int max = 0;
        for (Class cls : list) {
            if (cls.getNumber() > max) {
                max = cls.getNumber();
            };
        }
        System.out.println("max number using a for: " + max);    
        System.out.println("max number using stream: " + list.stream().mapToInt(Class::getNumber).max().getAsInt());

        int sumIf = 0;
        for (Class cls : list) {
            if (!cls.getName().equalsIgnoreCase("Physics")) {
                sumIf += cls.getNumber();
            }
        }
        System.out.println("sum of numbers using a for with a filter if: " + sumIf);
        System.out.println("sum of numbers using stream with a filter: " + list.stream()
            .filter(Class -> !Class.getName().equalsIgnoreCase("Physics")).mapToInt(Class::getNumber).sum());

        System.out.println("average number using stream: " + list.stream().mapToInt(Class::getNumber).average().getAsDouble());
        System.out.println("max number using stream: " + list.stream().mapToInt(Class::getNumber).max().getAsInt());
        System.out.println("min number using stream: " + list.stream().mapToInt(Class::getNumber).min().getAsInt());
    }
}
