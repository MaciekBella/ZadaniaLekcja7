package com.example.zad3;

public class Main {
    public static void main(String[] args) {

        TicketSeller ticketSeller = new TicketSeller();
        ticketSeller.calculateMonthlySalary();
        ticketSeller.getExperienceInWork();
        System.out.println(ticketSeller.TicketSeller("Grzegorz Kowalski",2015));
        System.out.println();
        Manager manager = new Manager();
        manager.calculateMonthlySalary();
        manager.getExperienceInWork();
        System.out.println(manager.Manager("Jacek Ślepy",2003,500));



    }
}
