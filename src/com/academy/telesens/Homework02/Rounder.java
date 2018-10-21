package com.academy.telesens.Homework02;

import java.util.Scanner;

public class Rounder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number in the format 1,1");
        double a = scan.nextDouble();
        int rough = (int) a;
        double remain = a % rough;
        if (remain >= 0.5) {
            System.out.println(rough + 1);
        } else {
            System.out.print(rough);
        }

    }


}
