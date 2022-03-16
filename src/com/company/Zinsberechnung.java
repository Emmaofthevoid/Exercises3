package com.company;

public class Zinsberechnung {
    public static void main(String[] args) {
        System.out.println(zinsBerechnungen(1000, 2.25));

    }
    public static double zinsBerechnungen (int kontostand, double zinsen) {
        return (zinsen/100)*kontostand;

    }
}
