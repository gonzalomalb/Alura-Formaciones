package com.proyect.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test6 {
    public static final List<List<Integer>> lists = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {

        for(List<Integer> list : lists) {
            final String implementationName = list.getClass().getSimpleName();

            //add
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                list.add(i);
            }
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println(implementationName + " add: " + duration);

            //get
            start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                list.get(i);
            }
            end = System.currentTimeMillis();
            duration = end - start;
            System.out.println(implementationName + " get: " + duration);

            //remove
            start = System.currentTimeMillis();
            for (int i = 99999; i >= 0; i--) {
                list.remove(i);
            }
            end = System.currentTimeMillis();
            duration = end - start;
            System.out.println(implementationName + " remove: " + duration);

        }
    }
}
