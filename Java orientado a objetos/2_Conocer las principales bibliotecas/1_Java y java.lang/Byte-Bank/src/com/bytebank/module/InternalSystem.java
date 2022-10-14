package com.bytebank.module;

public class InternalSystem {

    private int key = 12345;
    
    public boolean authenticate(Authenticator employee) {
        boolean canLogin = employee.login(key);
        if(canLogin) {
            System.out.println("Can login");
            return true;
        }
        else {
            System.out.println("Can't login");
            return false;
        }
    }
}
