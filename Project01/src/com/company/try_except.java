package com.company;

import java.util.Scanner;

public class try_except {
    public static void main(String [] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            double num = keyboardInput.nextDouble();
            System.out.println(num + " all OK");
        } catch(Exception e) {
            System.out.println("Invalid Input!");
        }


    }
}
