package com.proyect.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        
        String variable1 = "Sample 1";
        String variable2 = "Sample 2";
        String variable3 = "Sample 3";
        String variable4 = "Sample 4";

        ArrayList<String> list = new ArrayList<>();
        list.add(variable1);
        list.add(variable2);
        list.add(variable3);
        list.add(variable4);

        System.out.println(list);

        list.remove(2);
        list.set(2, "Altered Sample");

        System.out.println(list);
        System.out.println(list.size());
    }
}
