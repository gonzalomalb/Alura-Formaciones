package com.javaLang.module;

public class Sample {
    private int number1;
    private int number2;

    public Sample(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        System.out.println("Creating new Sample");
    }

    @Override
    public String toString() {
        String sample = "Number1: " + this.number1 + " - Number2: " + this.number2;
        return sample;
    }

}
