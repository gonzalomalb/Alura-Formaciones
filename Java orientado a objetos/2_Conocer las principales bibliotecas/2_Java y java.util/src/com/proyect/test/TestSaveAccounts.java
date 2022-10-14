package com.proyect.test;

import com.bytebank.module.*;
import com.proyect.module.SaveAccounts;

public class TestSaveAccounts {

    public static void main(String[] args) { 

        SaveAccounts saveAccounts = new SaveAccounts();

        Account cc = new CurrentAccount(22, 11);
        saveAccounts.addAcc(cc);
        Account cc2 = new CurrentAccount(11, 33);
        saveAccounts.addAcc(cc2);

        System.out.println(saveAccounts.getAcc(0));
        System.out.println(saveAccounts.getAcc(1));
    }
}
