package com.bridgelabz;

public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int RATE_PER_HRS = 20;
    public static final int MAX_NUM_OF_DAYS = 20;
    public static final int MAX_NUM_OF_HRS = 100;
    public static void main(String[] args) {
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        while( totalEmpHrs < MAX_NUM_OF_HRS && totalWorkingDays < MAX_NUM_OF_DAYS ) {
            totalWorkingDays++;
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
            totalEmpHrs += empHrs;
            System.out.println(" Day - " +totalWorkingDays+ " Emp Hrs - " +empHrs);
        }
        totalEmpWage = totalEmpHrs * RATE_PER_HRS;
        System.out.println("Employee Wage = "+totalEmpWage);
    }
}
