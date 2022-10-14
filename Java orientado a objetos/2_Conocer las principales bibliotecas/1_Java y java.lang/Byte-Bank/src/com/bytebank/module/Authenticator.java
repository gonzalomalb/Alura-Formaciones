package com.bytebank.module;

public interface Authenticator {

    public void setKey(int key);

    public int getKey();

    public boolean login(int key);

}
