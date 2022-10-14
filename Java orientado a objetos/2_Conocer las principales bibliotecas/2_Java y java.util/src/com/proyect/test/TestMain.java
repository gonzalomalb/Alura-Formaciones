package com.proyect.test;


public class TestMain {
    public static void main(String[] args) {
        
        int age1 = 20;
        int age2 = 15;
        int age3 = 67;

        int[] ages = new int[5];

        ages[1] = age1;
        ages[2] = age2;
        ages[3] = age3;

        int lenghtAges = ages.length;
        System.out.println("lenght of array ages: " + lenghtAges);

        for (int i = 0; i < lenghtAges; i++) {
            System.out.println("Value of array at position " + i + ": " + ages[i]);
        }
    }
}
