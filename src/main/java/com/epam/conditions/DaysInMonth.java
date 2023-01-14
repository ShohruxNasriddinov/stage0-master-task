package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year<0){
            System.out.println("invalid date");

        }else {
            int a = year / 100;
            int b = a % 4;
            if (b == 0 && year % 4 == 0 && month == 2) {
                System.out.println("29");
            } else {
                switch (month) {
                    case 12, 10, 8, 7, 5, 3, 1 -> System.out.println("31");
                    case 4, 6, 9, 11 -> System.out.println("30");
                    case 2 -> System.out.println("28");
                    default -> System.out.println("invalid date");
                }
            }
        }
    }

}
