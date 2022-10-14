package com.proyect.test;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("generated-FileWriter-text.txt");
        fileWriter.write("first line FileWriter");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("second line FileWriter");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("third line FileWriter");
        fileWriter.close();

    }
}
