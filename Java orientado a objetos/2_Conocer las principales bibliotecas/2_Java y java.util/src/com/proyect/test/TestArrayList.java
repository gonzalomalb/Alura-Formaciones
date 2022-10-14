package com.proyect.test;

import java.util.List;
import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Vector;

import com.bytebank.module.*;
import com.proyect.module.CompareAccounts;

public class TestArrayList {
    public static void main(String[] args) {

        // <> force only 1 type of object;
        List<Account> list = new ArrayList<>();
        // List<Account> list = new LinkedList<>();
        // List<Account> list = new Vector<>();
        CompareAccounts compare = new CompareAccounts();

        Account cc = new CurrentAccount(22, 11);
        Account cc2 = new CurrentAccount(22, 33);
        Account cc3 = new CurrentAccount(22, 11);

        list.add(cc);
        list.add(cc2);

        Account getAccount = list.get(0);
        System.out.println(getAccount.getNumber());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Account account : list) {
            System.out.println(account.getNumber());
        }

        boolean containsCc = list.contains(cc);
        if (containsCc){
            System.out.println("List contains cc");
        }

        if (compare.isEqual(cc, cc3)) {
            System.out.println("Same Account");
        } else {
            System.out.println("Not the same Account");
        }
    }
}
