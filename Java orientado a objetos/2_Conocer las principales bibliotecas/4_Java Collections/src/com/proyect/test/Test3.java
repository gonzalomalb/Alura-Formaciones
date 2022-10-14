package com.proyect.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        
        String variable1 = "Sample 1";
        String variable2 = "Sample 2";
        String variable3 = "Sample 3";
        String variable4 = "Sample 4";

        ArrayList<String> list = new ArrayList<>();
        list.add(variable4);
        list.add(variable2);
        list.add(variable1);
        list.add(variable3);

        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        List<String> streamList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(streamList);
        
    }
}
