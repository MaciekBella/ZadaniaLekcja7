package com.example.zad3;

public class Manager extends BaseEmployee {


    private String fullName;
    private int salary;
    private int yearOfEmployment;
    private int bonus;


    public String Manager(String fullName, int yearOfEmployment, int bonus) {
        this.fullName = fullName;
        this.yearOfEmployment = yearOfEmployment;
        this.bonus = bonus;
        String infromation = "Manager" + "\n" + fullName + "\n" + "Working: " +
                getExperienceInWork() + " years" + "\n" + "Salary: " + calculateMonthlySalary();

        return infromation ;
    }

    public final int getSalary() {
        this.salary = 5000;
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperienceInWork() {

        return 2022 - yearOfEmployment;
    }

    @Override
    public int calculateMonthlySalary() {
        this.salary = 5000;
        this.bonus = bonus;
        return salary + bonus;
    }
}


