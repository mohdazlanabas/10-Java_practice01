package com.company;
import java.time.LocalDateTime;

public class scanner {
    public static void main(String[] args) {

        // Scanner Class
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("What is your name ?");
        String userName = scanner.nextLine();
        // scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        int year = LocalDateTime.now().minusYears(age).getYear();
        System.out.println(" You were born in " + year);

    }
}
