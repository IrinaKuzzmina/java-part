package com.academy.telesen.Homework2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the number");
        double x = scan.nextDouble();
         x -= (x * 0.05);
        System.out.println(x);
    }
}
