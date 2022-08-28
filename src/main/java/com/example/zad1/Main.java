package com.example.zad1;

public class Main {
    public static void main(String[] args) {

        PlaceInCinemaHall placeInCinemaHall = new PlaceInCinemaHall();
        placeInCinemaHall.getNumberPlace();
        placeInCinemaHall.getRowNumber();
        System.out.println(placeInCinemaHall.Place("Zajęte"));

    }
}