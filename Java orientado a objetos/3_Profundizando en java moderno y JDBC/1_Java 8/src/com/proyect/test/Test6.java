package com.proyect.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test6 {
    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        testList.add("testItem_1");
        testList.add("testItem_2");
        testList.add("testItem_333");
        testList.add("testItem_4444");

        testList.sort(Comparator.comparing(String::length).reversed());
        testList.forEach(System.out::println);

    }
}

