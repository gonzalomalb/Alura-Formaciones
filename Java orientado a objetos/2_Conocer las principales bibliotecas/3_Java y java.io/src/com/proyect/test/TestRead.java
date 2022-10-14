package com.proyect.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestRead {
    public static void main(String[] args) throws IOException {

        // getting the file
        InputStream fileInputStream = new FileInputStream("text.txt");
        // processing the file
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        // reading the file
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String line;
        // System.out.println(line);

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
