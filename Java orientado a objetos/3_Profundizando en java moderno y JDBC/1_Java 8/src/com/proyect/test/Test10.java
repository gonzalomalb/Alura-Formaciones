package com.proyect.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.proyect.module.TestClassType;

import java.util.ArrayList;


public class Test10 {
    public static void main(String[] args) {

        List<TestClassType> testListType = new ArrayList<>();
        testListType.add(new TestClassType("testObj_1", 200, 1));
        testListType.add(new TestClassType("testObj_2", 500, 1));
        testListType.add(new TestClassType("testObj_3", 400, 2));
        testListType.add(new TestClassType("testObj_4", 300, 2));

        Map<Integer, String> mapTCtoMap = testListType.stream().filter(x -> x.getNumber() > 300)
            .collect(Collectors.toMap(TestClassType::getNumber, TestClassType::getName));

        mapTCtoMap.forEach((key, value) -> System.out.println(value + " - " + key));
        System.out.println(" ");

        Map<Integer, List<TestClassType>> mapTCgroupBy = testListType.stream().filter(x -> x.getNumber() > 100)
            .collect(Collectors.groupingBy(TestClassType::getType));

        mapTCgroupBy.get(1).forEach(System.out::println);
        System.out.println(" ");
        mapTCgroupBy.get(2).forEach(System.out::println);
       
    }
}


