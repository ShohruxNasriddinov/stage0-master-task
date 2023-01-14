package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s;
        if (numberOfPaws==1) {
            s = "This animal is mostly "+color+". It has 1 paw and a fur.";
        } else if (hasFur) {
            s = "This animal is mostly " + color + ". It has "+numberOfPaws+" paws and a fur.";
        } else {
            s = "This animal is mostly " + color + ". It has "+numberOfPaws+" paws and no fur.";
        }
        return s;
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
