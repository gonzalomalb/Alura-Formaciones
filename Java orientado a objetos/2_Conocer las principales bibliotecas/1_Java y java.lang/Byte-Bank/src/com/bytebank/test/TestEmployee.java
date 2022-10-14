package com.bytebank.test;

import com.bytebank.module.*;

public class TestEmployee {
    public static void main(String[] args) {

        Employee diego = new Accountant();
        diego.setName("Diego");
        diego.setId("23232323");
        diego.setSalary(2000);
        diego.setType(0);

        System.out.println(diego.getSalary());
        System.out.println(diego.getBono());

    }
}
