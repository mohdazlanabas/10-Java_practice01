package com.company;

import java.util.Arrays;

public class array_strings {

    public static void main(String[] args) {
        // Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'A');

    }
    public static int countOccurrences(
            char[] letters, char searchLetter) {
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);

        int count =0;
        for(char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }

}
