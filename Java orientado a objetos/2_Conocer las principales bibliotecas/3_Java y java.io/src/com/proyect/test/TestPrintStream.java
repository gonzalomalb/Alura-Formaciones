package com.proyect.test;

import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) throws IOException {

        // auto generated new lines
        PrintStream printStream = new PrintStream("generated-text-PrintStream.txt");
        printStream.println("first line PrintStream");
        printStream.println("second line PrintStream");
        printStream.println("third line PrintStream");
        printStream.close();
    }
}
