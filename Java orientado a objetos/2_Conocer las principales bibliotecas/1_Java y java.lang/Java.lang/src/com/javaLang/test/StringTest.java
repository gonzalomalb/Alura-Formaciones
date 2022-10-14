package com.javaLang.test;

import com.javaLang.module.Sample;

public class StringTest {
    public static void main(String[] args) {

        // String name = new String("Alura");
        String name = "Alura";

        printLine("Before replace: " + name);
        name = name.replace("A", "a");
        printLine("After replace: " + name);

        name = name.concat(" Curos Online");
        printLine("After concat: " + name);

        name = name.toUpperCase();
        printLine("After toUpperCase: " + name);

        name = name.toLowerCase();
        printLine("After toLowerCase: " + name);

        char letter = name.charAt(3);
        printLine("Letter of variable name at position 3: " + letter);

        int index = name.indexOf("e");
        printLine(name + ". Position of letter e: " + index);

        Sample samplito = new Sample(122, 133);
        System.out.println(samplito);
    }

    public static void printLine(Object value){
        System.out.println(value);
    }
}
