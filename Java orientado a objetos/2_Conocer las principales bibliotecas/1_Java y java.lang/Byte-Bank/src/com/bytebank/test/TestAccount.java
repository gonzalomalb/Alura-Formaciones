package com.bytebank.test;

import com.bytebank.module.*;

public class TestAccount {
    public static void main(String[] args) {

        CurrentAccount ca = new CurrentAccount(1, 1);
        SavingsAccount sa = new SavingsAccount(2, 3);

        ca.deposit(2000);
        ca.transfer(1000, sa);

        System.out.println(ca.getBalance());
        System.out.println(sa.getBalance());

    }
}
