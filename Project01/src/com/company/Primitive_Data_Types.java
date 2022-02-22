package com.company;

public class Primitive_Data_Types {

    public static void main(String[] args) {
        // PRIMITIVE TYPES
        int theInt = 251234567;
        double number = 100.01;
        String brand = "Hello World!";
        byte theByte = -128;
        short theShort = 32000;
        long theLong = 251234567890123L;
        float pi = 3.14762F;
        boolean isAdult = true;
        char nameInitial = 'A';
        // REFERENCE TYPES or NON PRIMITIVES
        String name1 = new String("Amigoscode");
        int Age = 20;
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.charAt(2));
        System.out.println(name1.contains("code"));
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " & b = " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

    }
    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }

}
