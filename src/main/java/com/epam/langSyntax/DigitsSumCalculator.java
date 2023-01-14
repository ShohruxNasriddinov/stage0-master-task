package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int a = number/1000;
        number = number - a*1000;
        int b = number/100;
        number=number-b*100;
        int c = number/10;
        int d = number%10;
        System.out.println(a+b+c+d);
    }

}
