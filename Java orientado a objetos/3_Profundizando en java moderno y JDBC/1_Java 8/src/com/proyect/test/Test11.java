package com.proyect.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test11 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDate worldCupDate = LocalDate.of(2022,11,20);
        System.out.println(ChronoUnit.DAYS.between(currentDate, worldCupDate));
       
    }
}


