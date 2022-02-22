package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array_dynamic_entry {
    public static void main(String[] Args) {

//    int[] grades = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] grades = new int[size];

        for (int i = 0; i < size; i++) {
            int x = input.nextInt();
            grades[i] = x;
        }
        System.out.println(Arrays.toString(grades));

    }
}
