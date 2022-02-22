package com.company;

import java.util.ArrayList;
import java.util.List;

public class array_lists {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(5);
        grades.add(10);
        grades.add(1,7);

        System.out.println(grades.get(1));

    }
}
