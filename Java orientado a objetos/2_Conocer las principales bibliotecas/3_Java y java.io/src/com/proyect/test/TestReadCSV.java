package com.proyect.test;

import java.io.File;
import java.io.FileNotFoundException;
// import java.util.Arrays;
import java.util.Scanner;

public class TestReadCSV {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(new File("contas.csv"));

        String line;

        while (scanner.hasNextLine() && (line = scanner.nextLine()) != null){
            // Using Split
            // String[] lines = line.split(",");
            // System.out.println(Arrays.toString(lines));
            // System.out.println(lines[3]);

            // Using Scanner
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            String value;
            while (lineScanner.hasNextLine() && (value = lineScanner.nextLine()) != null){
                System.out.println(value);
            }
            lineScanner.close();
        }

        //String.format
        System.out.println(String.format("I'm %d years old", 29));
    }
}
