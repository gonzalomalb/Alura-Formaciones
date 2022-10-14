package com.proyect.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        testList.add("testItem_1");
        testList.add("testItem_2");
        testList.add("testItem_333");
        testList.add("testItem_4444");

        Collections.sort(testList, new Compare());

        for (String items: testList) {
            System.out.println(items);
        }

    }
}

class Compare implements Comparator<String> {

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
