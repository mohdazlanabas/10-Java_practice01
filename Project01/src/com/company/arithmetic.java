package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class arithmetic {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDte = LocalDate.now();
        LocalDateTime localDateTIme = LocalDateTime.now();

        // Arithmetic Operations
        int ten = 10;
        int two = 2;
        int addition = 10 + 2;
        System.out.println(addition);
        // + - * / %
        // Math Methods
        Math.abs(-10);
        // max, min, pow, sqrt, PI
        System.out.println((int)Math.pow(5,2));
        // Comparison Operators
        // > < == != >= <= && ||
        int Age1 = 18;
        int Age2 = 20;
        boolean isCompare = Age1 > Age2;
        System.out.println(isCompare);

        boolean isAdult = false;
        boolean isStudent = true;
        System.out.println(isAdult || isStudent);
        System.out.println(10 > 8 || 2 <= 2 && isAdult);
        String name = "Muhammad";

        }

    }

