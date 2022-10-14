package com.proyect.test;

import java.util.List;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        testList.add("testItem_1");
        testList.add("testItem_2");
        testList.add("testItem_333");
        testList.add("testItem_4444");

        testList.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        testList.forEach(s -> System.out.println(s));

    }
}

