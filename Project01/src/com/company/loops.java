package com.company;

public class loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Reverse Order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println("Enhanced Loop");

        for (int number : numbers) {
            System.out.println(numbers[number]);
        }

        String[] names = {"Anna", "Ali", "Bob", "Mary"};
        for (String name : names) {
            System.out.println(name);
            break;
        }

        for (String name : names) {
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }

        int count1 = 0;
        int count2 = 21;
        while (count1 <= 20) {
            System.out.println("count " + count1);
            count1++;
        }
        do {
            System.out.println(count2);
            count2++;
        }
        while (count2 <= 20);

        // Methods

        String brand = "Samsung";
        boolean startsWithS = brand.startsWith("S");
        boolean endssWithS = brand.endsWith("g");
        System.out.println(startsWithS);


}} // Close Public Main Void
