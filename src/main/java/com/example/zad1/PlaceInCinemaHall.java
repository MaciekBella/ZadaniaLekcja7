package com.example.zad1;

public class PlaceInCinemaHall {


    private int numberPlace;
    private int rowNumber;
    private String freeOrOccupiedPlace;

    public String Place(String freeOrOccupiedPlace) {

        String information = "Numer miejsca: " + numberPlace + "\n" + "Rząd: " + rowNumber
                + "\n" + "Miejsce jest: " + freeOrOccupiedPlace;
        return information;
    }

    public final int getNumberPlace() {
      this.numberPlace = 15;
        return numberPlace;
    }

    public final int getRowNumber() {
        this.rowNumber = 3;
        return rowNumber;
    }





}





