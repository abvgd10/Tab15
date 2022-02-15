package com.company;

public class Dancer extends Person {

    public String groupName;

    public Dancer(String name, String designation,  String groupName) {
        super(name, designation, groupName);
        this.groupName = groupName;
    }


    public void dancing() {
        System.out.println("Бийлоо");

    }

    @Override
    public String toString() {
        return "Dancer " +
                "groupName='" + groupName + '\'' +
                " " + super.toString();
    }
}
