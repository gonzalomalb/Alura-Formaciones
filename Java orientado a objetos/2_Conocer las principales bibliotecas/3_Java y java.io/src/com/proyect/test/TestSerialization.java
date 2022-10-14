package com.proyect.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.proyect.module.Client;

public class TestSerialization {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Output - Client
        Client data = new Client("Diego", 123456);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("client.bin"));
        objectOutputStream.writeObject(data);
        objectOutputStream.close();

        // Input - Client
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("client.bin"));
        Client result = (Client) objectInputStream.readObject();
        System.out.println(result.getName() + " " + result.getId());
        objectInputStream.close();

        
        // Output - String
        // String data = "Diego";
        // ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.bin"));
        // objectOutputStream.writeObject(data);
        // objectOutputStream.close();

        // Input - String
        // ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.bin"));
        // String result = (String) objectInputStream.readObject();
        // System.out.println(result);
        // objectInputStream.close();

    }
}
