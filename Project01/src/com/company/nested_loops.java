package com.company;

public class nested_loops {
    public static void main(String [] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 2; k < 5; k++) {
                    System.out.println("i= " + i + ",j= " + j + ",k= " + k);
                }
            }
        }

        int [][] numberGrid = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {0}
        };
        System.out.println(numberGrid[0][2]);

    }
}
