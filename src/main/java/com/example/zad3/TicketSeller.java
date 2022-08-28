package com.example.zad3;

public class TicketSeller extends BaseEmployee {


    private String fullName;
    private int salary;
    private int yearOfEmployment;

    public String TicketSeller(String fullName, int yearOfEmployment) {
        this.fullName = fullName;
        this.yearOfEmployment = yearOfEmployment;
        String information ="Ticket Seller"+ "\n" + fullName + "\n" + "Working: " + getExperienceInWork()
                + " years" + "\n" + "Salary: " +calculateMonthlySalary();
        return information ;
    }

    public  int getSalary() {
        this.salary = 3000;
        return salary;
    }



    public int getExperienceInWork() {
        return 2022 - yearOfEmployment;


    }


    public String getFullName() {
        return fullName;
    }

    @Override
    public int calculateMonthlySalary() {
        this.salary = 3000;
        return salary;
    }
}




