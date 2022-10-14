package com.proyect.test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import com.proyect.module.TestClass;

import java.util.ArrayList;
import java.util.Comparator;

public class Test8 {
    public static void main(String[] args) {

        List<TestClass> testList = new ArrayList<>();
        testList.add(new TestClass("testObj_1", 200));
        testList.add(new TestClass("testObj_2", 500));
        testList.add(new TestClass("testObj_3", 400));
        testList.add(new TestClass("testObj_4", 300));

        testList.sort(Comparator.comparing(TestClass::getNumber));

        int sumItems = testList.stream().filter(x -> x.getNumber() >= 300).mapToInt(x -> x.getNumber()).sum();
        System.out.println(sumItems);

        OptionalInt maxItems = testList.stream().mapToInt(x -> x.getNumber()).max();
        System.out.println(maxItems.getAsInt());

        boolean validateAll = testList.stream().allMatch(x -> x.getNumber() > 200);
        System.out.println(validateAll);

        Optional<TestClass> optionalTC = testList.stream().filter(x -> x.getNumber() > 200).findFirst();
        if(optionalTC.isPresent()) {
            System.out.println(optionalTC.get().getName());

        } 
    }
}


