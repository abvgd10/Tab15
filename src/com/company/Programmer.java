package com.company;

public class Programmer extends Person {

    public String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation, companyName);
        this.companyName = companyName;
    }

    public String  coding() {
        System.out.println("Код жазуу");
    return " ";
    }

    @Override
    public String toString() {
        return "Programmer " +
                "companyName='" + companyName + '\'' +
                "  " + super.toString();
    }
}
