package com.proyect.test;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;
import com.bytebank.module.*;

public class TestLambda {
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

        //Lambda expression
        list.sort((Account o1, Account o2) -> 
            Integer.compare(o1.getNumber(), o2.getNumber())
        );
        System.out.println("After sorted by lambda function");
        list.forEach(acc -> System.out.println(acc.getHolder().getName() + " " + acc.getNumber())); // consumer
        /*
        for (Account acc : list) {
            System.out.println(acc.getHolder().getName() + " " + acc.getNumber());
        }
        */

        /*
        // Collection with lambda - need to implement comparable on class.
        Collections.sort(list, (cc1, cc2) -> 
            cc1.getHolder().getName()
                .compareTo(cc2.getHolder().getName())
        );
        */
    }
}
