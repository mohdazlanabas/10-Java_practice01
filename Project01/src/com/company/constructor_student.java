package com.company;

public class constructor_student {
    String name;
    String major;
    double gpa;


    public constructor_student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public boolean isHonorRoll () {
        if(this.gpa >= 3.5) {
            return true;
        }
            return false;
    }

}
