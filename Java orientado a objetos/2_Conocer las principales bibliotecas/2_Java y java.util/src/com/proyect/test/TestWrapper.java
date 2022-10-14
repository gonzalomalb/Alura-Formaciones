package com.proyect.test;

public class TestWrapper {
    public static void main(String[] args) {
        
        Integer integerNumber = 30; // autoboxing
        System.out.println("Value of integerNumber: " + integerNumber);

        Double doubleNumber = 33.3; // autoboxing
        System.out.println("Value of doubleNumber: " + doubleNumber);

        Double doubleNumber2 = Double.valueOf(integerNumber);
        System.out.println("Value of doubleNumber2 after conversion: " + doubleNumber2);

        Boolean isTrue = true; // autoboxing
        System.out.println("Value of isTrue: " + isTrue);
        Boolean isFalse = Boolean.FALSE;
        System.out.println("Value of isFalse: " + isFalse); 
        
        String stringNumber = "43"; // autoboxing
        System.out.println("Value of stringNumber: " + stringNumber);
        Double stringToDouble = Double.valueOf(stringNumber);
        System.out.println("Value of stringToDouble after conversion: " + stringToDouble);
        Integer stringToInteger = Integer.valueOf(stringNumber);  
        System.out.println("Value of stringToInteger after conversion: " + stringToInteger);

        Number number = Integer.valueOf(5);
        System.out.println("Value of number: " + number);
        Double primDoubleNumber = number.doubleValue();
        System.out.println("Value of primDoubleNumber after conversion: " + primDoubleNumber);

    }
}
