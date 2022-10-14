package com.proyect.test;

import java.util.List;
import java.util.stream.Collectors;

import com.proyect.module.TestClass;
import java.util.ArrayList;


public class Test9 {
    public static void main(String[] args) {

        List<TestClass> testList = new ArrayList<>();
        testList.add(new TestClass("testObj_1", 200));
        testList.add(new TestClass("testObj_2", 500));
        testList.add(new TestClass("testObj_3", 400));
        testList.add(new TestClass("testObj_4", 300));

        testList.stream().filter(x -> x.getNumber() > 600).findFirst().ifPresent(System.out::println);

        TestClass testClass = testList.stream().filter(x -> x.getNumber() > 100).findFirst().orElse(new TestClass("Non existent", 0));
        System.out.println(testClass);

        List<TestClass> listTC = testList.stream().filter(x -> x.getNumber() > 300).collect(Collectors.toList());
        listTC.forEach(System.out::println);
    }
}


