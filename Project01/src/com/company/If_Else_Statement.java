package com.company;

import java.util.Arrays;

public class If_Else_Statement {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("OK");
        } else if (age >= 16 && age <= 18) {
            System.out.println("OK");
        } else {
            System.out.println("OK");
        }

        // Ternary
        int age2 = 18;
        String message = age2 >= 18 ?
                "I am an adult" :
                "I am not and adult";

        // Switch
        String gender = "Female";
        if (gender.equals("Female")) {
            System.out.println("OK");
        } else if (gender.equals("Male")) {
            System.out.println("OK");
        } else
            System.out.println("OK");

        switch (gender) {
            case "FEMALE":
                break;
            case "MALE":
                break;
            default:
        }

        // ARRAYS

        int [] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        System.out.println(Arrays.toString(numbers1));

        int[] numbers2 = {1,2,3,4,5,6,7,8,9,0};
        String [] names2 = {"Ali", "Mariam"};
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        System.out.println(names2.length);

        // Indexes

        int four = numbers2[4];
        int last = numbers2[numbers2.length-1];
        System.out.println(four);

        // i++ i-- i+=1 i+-1

        // Close Public Classes
        }}



