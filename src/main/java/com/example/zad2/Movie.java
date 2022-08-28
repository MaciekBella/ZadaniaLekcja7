package com.example.zad2;

public class Movie {

   private String titleOfMovie;
  private   String fullNameDirector;
   private int movieTime;
   private int yearOfProductionMovie;


    public String Movie(){
        this.titleOfMovie = "Kapitan Ameryka: Pierwsze starcie";
        this.fullNameDirector = "Joe Johnston";
        this.movieTime = 124;
        this.yearOfProductionMovie = 2011;
        String information = "Tytuł: " + titleOfMovie + "\n" + "Imię i nazwisko reżysera: " + fullNameDirector + "\n"
        + "Czas trwania seansu: "+ movieTime +" min"+"\n" + "Rok produkcji: " + yearOfProductionMovie;
        return information ;

    }


}

