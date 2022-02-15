package com.company;

public class Singer extends Person {

    public String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation, bandName);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer " +
                "bandName='" + bandName + '\'' +
                " " + super.toString();
    }

    public void singing() {
        System.out.println("Ырдоо");

    }
    public void playgitar() {
        System.out.println("Гитарада ойноо");

    }
}
