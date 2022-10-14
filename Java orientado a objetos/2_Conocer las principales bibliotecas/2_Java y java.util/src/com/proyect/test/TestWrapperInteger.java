package com.proyect.test;

import java.util.List;
import java.util.ArrayList;

public class TestWrapperInteger {
    public static void main(String[] args) {

        int number = 40;
        //Wrapper
        // Integer numberObject = new Integer(40);  -  Deprecated
        Integer numberObject = Integer.valueOf(number); // Integer Object - Wrapper
        int primitiveValue = numberObject; // unboxing - int primitiveValue = numberObject.intValue();

        //Primitive array
        int[] numbers = new int[10];
        numbers[0] = number; // autoboxing - 
        numbers[1] = numberObject; // Integer Object
        numbers[2] = primitiveValue; // unboxing
 
        //Wrapper list
        List<Integer> list = new ArrayList<Integer>();
        list.add(number); // autoboxing  - list.add(Integer.valueOf(number));
        list.add(numberObject); // Integer Object
        list.add(primitiveValue); // unboxing - list.add(numberObject.intValue())

        byte byteInteger = numberObject.byteValue();
        double doubleInteger = numberObject.doubleValue();
        float floatInteger = numberObject.floatValue();
        System.out.print(byteInteger);
        System.out.println("");
        System.out.print(doubleInteger);
        System.out.println("");
        System.out.print(floatInteger);

    }
}
