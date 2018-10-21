package com.academy.telesens.Homework02;

import java.util.Scanner;

public class NumberSum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number");
        long n = scan.nextLong();
        int sum = 0;
        long remain = 1;
        int numbersAmount = 0;

        while (remain > 0) {
            remain = n % 10;
            sum += remain;
            n = n / 10;
            if (remain == 0) {
                break;
            } else {
                numbersAmount++;
            }
        }
        System.out.println("Sum is " + sum + ". Numbers amount is " + numbersAmount + ".");
    }
}
