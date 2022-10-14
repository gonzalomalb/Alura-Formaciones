package com.bytebank.module;

public class CurrentAccount extends Account {
    
    public CurrentAccount(int branch, int number) {
        super(branch, number);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public boolean withdraw(double value) {
        double commission = 0.2;
        return super.withdraw(value + commission);
    }
 
}
