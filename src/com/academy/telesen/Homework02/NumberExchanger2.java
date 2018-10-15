package com.academy.telesen.Homework2;

public class NumberExchanger2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a = %d and b = %d", a, b);
    }
}
