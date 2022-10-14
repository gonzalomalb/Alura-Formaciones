package com.proyect.test;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Test9 {
    public static void main(String[] args) {
        
        String variable1 = "Sample 1";
        String variable2 = "Sample 2";
        String variable3 = "Sample 3";
        String variable4 = "Sample 42";
        String variable5 = "Sample 1";
        String variable6 = "Sample 2";


        Collection<String> listHashSet = new HashSet<>(); // or new ArrayList(), new LinkedList();

        listHashSet.add(variable1);
        listHashSet.add(variable2);
        listHashSet.add(variable3);
        listHashSet.add(variable4);
        listHashSet.add(variable5);
        listHashSet.add(variable6);

        for (String var: listHashSet) {
            System.out.println(var);
        }

        System.out.println("listHashSet contains a Sample 2: " + listHashSet.contains("Sample 2"));

        System.out.println("variable with max number of characters: " + listHashSet.stream().max(Comparator.comparingInt(String::length)).get());

        listHashSet.removeIf(var -> "Sample 3".equalsIgnoreCase(var));
        System.out.println(listHashSet);
    }
}
