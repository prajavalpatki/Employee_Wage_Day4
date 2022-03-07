package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        int isFullTime = 1;
        int wagePerHrs = 20;
        int empWage = 0;
        int empHrs = 0;
        double empCheck = Math.floor(Math.random()* 10) % 2;
        if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * wagePerHrs;
        System.out.println("Emp Wage:" +empWage);

    }
}
