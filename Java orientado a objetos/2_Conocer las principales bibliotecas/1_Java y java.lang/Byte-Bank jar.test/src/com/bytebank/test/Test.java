package com.bytebank.test;

import com.bytebank.module.Account;

public class Test {
    public static void main(String[] args) {
        
        Account account = new Account() {

            @Override
            public void deposit(double arg0) {
                this.balance += arg0;
            }
            
        };

        account.deposit(3000);
        System.out.println("Excecuting Test.java");
        System.out.println("Balance of account: " + account.getBalance());
    }
}
