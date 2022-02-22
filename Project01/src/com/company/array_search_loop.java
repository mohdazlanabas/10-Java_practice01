package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array_search_loop {
    public static void main(String[] args) {
        int[] grades = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        for (int i = 0; i < grades.length; i++) {
            if(grades[i] == 3) {
                System.out.println("FOUND! Found at index " + i);
            }
        }

    }
}
