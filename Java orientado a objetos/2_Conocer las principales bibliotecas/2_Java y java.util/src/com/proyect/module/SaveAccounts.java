package com.proyect.module;

import com.bytebank.module.Account;

public class SaveAccounts {

    Account[] accounts = new Account[10];
    int index = 0;

    public void addAcc(Account cc) {
        accounts[index] = cc;
        index ++;
    }

    public Account getAcc(int index) {
        return accounts[index];
    }
}
