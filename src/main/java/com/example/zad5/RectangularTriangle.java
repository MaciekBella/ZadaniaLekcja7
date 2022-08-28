package com.example.zad5;

public class RectangularTriangle {




    public static boolean getCheckRectangularTriangle(int sideA , int sideB , int sideC){
        double  sidesA = Math.pow(sideA,2);
        double  sidesB = Math.pow(sideB,2);
        double sidesC = Math.pow(sideC,2);
        if (sidesA +sidesB ==sidesC){
            System.out.println("Jest to trójkąt protokątny");
        }else{
            System.out.println("Nie jest to trójkąt protokątny");
        }

        return sidesA +sidesB ==sidesC;
    }
}
