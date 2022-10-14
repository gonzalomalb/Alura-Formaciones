package com.proyect.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestWrite {
    public static void main(String[] args) throws IOException {

        // generating the file
        OutputStream fileOutputStream = new FileOutputStream("generated-text.txt");
        // processing the file
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        // writing the file
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        
        bufferedWriter.write("fisrt line of generated file");
        bufferedWriter.newLine();
        bufferedWriter.write("second line of generated file");

        bufferedWriter.close();
    }
}
