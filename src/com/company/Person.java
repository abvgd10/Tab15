package com.company;

public class Person {
    public String name;
    public String designation;


    public void learm() {
        System.out.println("Учиться");
    }
    public void walk() {
        System.out.println("Ходит");
    }
    public void eat() {
        System.out.println("Есть");
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ' ';
    }

    public Person(String name, String designation, String companyName) {
        this.name = name;
        this.designation = designation;

    }

}
