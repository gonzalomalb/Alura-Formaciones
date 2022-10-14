package com.proyect.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        testList.add("testItem_1");
        testList.add("testItem_2");
        testList.add("testItem_333");
        testList.add("testItem_4444");

        testList.sort(new CompareTest3());
        testList.forEach(s -> System.out.println(s));

        // testList.forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String t) {
        //         System.out.println(t);
        //     }
        // });

    }
}

class CompareTest3 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return 0;
    }  
}
