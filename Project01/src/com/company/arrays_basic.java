package com.company;

import java.util.Arrays;

public class arrays_basic {
    public static void main(String [] args) {

        String [] friends = {"Jim", "Karen", "Kevin"};
        System.out.println(friends);
        System.out.println(friends.length);
        System.out.println(Arrays.toString(friends));

        String [] friends2 = new String[3];
        friends2 [0] = "Lisa";
        friends2 [1] = "Alex";
        friends2 [2] = "Mike";
        System.out.println(friends2);
        System.out.println(Arrays.toString(friends2));
        }
    }
