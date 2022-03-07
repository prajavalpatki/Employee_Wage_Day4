package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int RATE_PER_HRS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random()* 10) % 3;
        int x = (int) empCheck;
        switch (x) {
            case IS_PART_TIME :
                empHrs = 4;
                break;
            case IS_FULL_TIME :
                empHrs = 8;
                break;
            default :
                empHrs = 0;
        }
        empWage = empHrs * RATE_PER_HRS;
        System.out.println("Employe Hours is " +empHrs+ " so Employee Wage = "+empWage);
    }
}
