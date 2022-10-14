package com.proyect.test;

import java.util.ArrayList;
import java.util.List;

import com.proyect.module.Class;
import com.proyect.module.ClassChild;

public class Test5 {
    public static void main(String[] args) {
        
        Class object1 = new Class("History", 1);
        object1.addClass(new ClassChild("Ancient"));
        object1.addClass(new ClassChild("Modern"));
        object1.addClass(new ClassChild("Pre-Ancient"));

        ArrayList<Class> list = new ArrayList<>();
        list.add(object1);
        System.out.println(list);

        List<ClassChild> listChild = object1.getClassList();
        System.out.println(listChild); 
    }
}
