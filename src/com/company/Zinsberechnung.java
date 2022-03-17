package com.company;

public class Zinsberechnung {
    public static void main(String[] args) {
        System.out.println(zinsBerechnungen(1000, 2.25));
        System.out.println(zinsBerechnungen(2000,4.56));
    }
    public static double zinsBerechnungen (int kontostand, double zinsen) {
        return (zinsen/100)*kontostand;

    }
}
