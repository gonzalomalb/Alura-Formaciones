package com.proyect.module;

public class SaveReference {

    Object[] refs = new Object[10];
    int index = 0;

    public void addRef(Object ojb) {
        refs[index] = ojb;
        index ++;
    }

    public Object getRef(int index) {
        return refs[index];
    }
}
