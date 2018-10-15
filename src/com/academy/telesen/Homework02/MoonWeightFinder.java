package com.academy.telesen.Homework2;

import java.util.Scanner;

public class MoonWeightFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your weight");
        double earthWeight = scan.nextDouble();
        final double earthGravity = 9.81;
        final double moonGravity = earthGravity * 0.17;
        double moonWeight = earthWeight * moonGravity;
        System.out.printf("Your weight on the Moon would be %.2f",moonWeight);
    }
}
