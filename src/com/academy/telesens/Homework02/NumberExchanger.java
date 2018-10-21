package com.academy.telesens.Homework02;

public class NumberExchanger {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int c = a;
        a = b;
        b = c;

        System.out.printf("a = %d and b = %d", a, b);

    }


}
