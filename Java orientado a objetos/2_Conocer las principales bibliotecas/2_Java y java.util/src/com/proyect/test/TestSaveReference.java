package com.proyect.test;

import com.bytebank.module.*;
import com.proyect.module.SaveReference;

public class TestSaveReference {
    public static void main(String[] args) {

        SaveReference refs = new SaveReference();

        Account cc = new CurrentAccount(22, 11);
        Client carlos = new Client();

        refs.addRef(cc);
        refs.addRef(carlos);

        System.out.println(refs.getRef(0));
        System.out.println(refs.getRef(1));
    }
}
