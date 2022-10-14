package com.proyect.test;

import com.bytebank.module.*;

public class TestArrayReference {
    public static void main(String[] args) {

        CurrentAccount cc = new CurrentAccount(23, 44);
        Client cl = new Client();
        Object[] reference = new Object[5];
        reference[0] = cc;
        reference[1] = cl;
        reference[2] = new CurrentAccount(11, 99);

        for (int i = 0; i < reference.length; i++) {
            System.out.println("id account: " + reference[i]);
        }

        // Cast;
        CurrentAccount account = (CurrentAccount) reference[0]; 
        System.out.println(account);

        Client client = (Client) reference[1];
        System.out.println(client);

    }
}
