package com.academy.telesens.Homework02;

import java.util.Scanner;

public class SquareFinder {
    public static void main(String[] args) {
        System.out.println("Please, enter the number to find the square");
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int square = a*a;
        System.out.printf("The square of %d is %d ", a, square);
    }
}
