package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 8, 7 -> System.out.println("Summer");
            case 10, 9, 11 -> System.out.println("autumn");
            default -> System.out.println("Wrong month number");
        }
    }

}
