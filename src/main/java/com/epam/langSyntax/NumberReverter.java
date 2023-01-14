package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int a = number/100;
        number = number-a*100;
        int b = number/10;
        int c = number%10;
        System.out.println(c+""+b+""+a);
    }

}
