package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Abdunuur","programmer",
                                                             "Peaksoft");
        System.out.println(programmer);
        programmer.coding();

        Dancer dancer = new Dancer("Abdunuur","dancer","Java 5");
        System.out.println(dancer);
        dancer.dancing();

        Singer singer = new Singer("Abdunuur","singer","Java 5");
        System.out.println(singer);
        singer.singing();
        singer.playgitar();
    }

}
