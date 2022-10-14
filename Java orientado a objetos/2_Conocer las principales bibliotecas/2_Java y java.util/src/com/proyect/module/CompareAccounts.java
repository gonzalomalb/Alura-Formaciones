package com.proyect.module;

import com.bytebank.module.Account;

public class CompareAccounts {
    
    public boolean isEqual(Account account, Account account2) {
        return account.getBranch() == account2.getBranch() && 
            account.getNumber() == account2.getNumber(); 
    }

    /* This is the override you should implement in the main class
    @Override
    public boolean equals(Object obj) {
    Account acc = (Account) obj;
    return this.branch == acc.getBranch() && 
        this.number == acc.getNumber();
    }
    */
    
}
