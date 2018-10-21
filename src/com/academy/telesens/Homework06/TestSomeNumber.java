package com.academy.telesens.Homework06;

public class TestSomeNumber {

    public static void main(String[] args) {
        SomeNumber number = new SomeNumber();
        SomeNumber number1 = new SomeNumber(-10);
        number.setN(-1);
        number1.setN(0);
        //System.out.println(number);
        //System.out.println(number1);
        number.print();
        number1.print();
        System.out.println(number.isPositive());
        System.out.println(number1.isPositive());
    }
}

