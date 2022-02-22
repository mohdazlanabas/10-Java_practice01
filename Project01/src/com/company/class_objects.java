package com.company;

public class class_objects {
    public static void main(String[] args) {

        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);
        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
    }

    // CLASSES
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens (
                String brand,
                String focalLength,
                boolean isPrime
        ) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;

        }
    }
}
