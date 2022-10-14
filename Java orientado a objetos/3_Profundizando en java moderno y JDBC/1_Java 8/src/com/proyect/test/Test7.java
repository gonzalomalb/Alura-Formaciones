package com.proyect.test;

import java.util.List;

import com.proyect.module.TestClass;

import java.util.ArrayList;
import java.util.Comparator;

public class Test7 {
    public static void main(String[] args) {

        List<TestClass> testList = new ArrayList<>();
        testList.add(new TestClass("testObj_1", 200));
        testList.add(new TestClass("testObj_2", 500));
        testList.add(new TestClass("testObj_3", 400));
        testList.add(new TestClass("testObj_4", 300));

        testList.sort(Comparator.comparing(TestClass::getNumber));

        testList.stream().filter(x -> x.getNumber() >= 300)
            .forEach(x -> System.out.println(x.getName() + " " + x.getNumber()));

    }
}


