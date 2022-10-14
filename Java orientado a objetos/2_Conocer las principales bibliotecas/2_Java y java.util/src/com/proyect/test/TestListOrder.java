package com.proyect.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.module.Account;
import com.bytebank.module.Client;
import com.bytebank.module.CurrentAccount;
import com.bytebank.module.SavingsAccount;

public class TestListOrder {
    public static void main(String[] args) {

        Account cc1 = new CurrentAccount(22, 33);
        Client c1 = new Client();
        c1.setName("Diego");
        cc1.setHolder(c1);
        cc1.deposit(333.0);

        Account cc2 = new SavingsAccount(22, 44);
        Client c2 = new Client();
        c2.setName("Mario");
        cc2.setHolder(c2);
        cc2.deposit(444.0);

        Account cc3 = new CurrentAccount(22, 11);
        Client c3 = new Client();
        c3.setName("Laura");
        cc3.setHolder(c3);
        cc3.deposit(111.0);

        Account cc4 = new SavingsAccount(22, 22);
        Client c4 = new Client();
        c4.setName("Romina");
        cc4.setHolder(c4);
        cc4.deposit(222.0);

        List<Account> list = new ArrayList<>();
        list.add(cc1);
        list.add(cc2);
        list.add(cc3);
        list.add(cc4);

        System.out.println("Before sort");
        for (Account acc : list) {
            System.out.println(acc.getHolder().getName() + " " + acc.getNumber());
        }

        // Sort Accounts
        // Comparator <? extends Account> c 
        Comparator<Account> comparatorAccNumber = new SortByAccNumber();
        list.sort(comparatorAccNumber);

        System.out.println("After sort by account number");
        for (Account acc : list) {
            System.out.println(acc.getHolder().getName() + " " + acc.getNumber());
        }

        // Anonymous class
        list.sort (new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getHolder().getName()
                .compareTo(o2.getHolder().getName());
            }
        });
        
        System.out.println("After sort by account holder name");
        for (Account acc : list) {
            System.out.println(acc.getHolder().getName() + " " + acc.getNumber());
        }
    }
}

class SortByAccNumber implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        // Wrapper implementation
        return Integer.compare(o1.getNumber(), o2.getNumber());

        /* Basic implementation
        if (o1.getNumber() == o2.getNumber()) {
            return 0;
        } else if (o1.getNumber() > o2.getNumber()) {
            return 1;
        } else {
            return -1;
        }
        */

        /* Short implementation
        return o1.getNumber() - o2.getNumber();
        */      
    }  
}

