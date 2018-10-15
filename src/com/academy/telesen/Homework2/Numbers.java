package com.academy.telesen.Homework2;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter three numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) {
            System.out.printf("The biggest number is %d.", a);
        } else if (b > a && b > c) {
            System.out.printf("The biggest number is %d.", b);
        } else {
            System.out.printf("The biggest number is %d.", c);
        }
        if (a < b && a < c) {
            System.out.printf(" The smallest number is %d.", a);
        } else if (b < a && b < c) {
            System.out.printf(" The smallest number is %d.", b);
        } else {
            System.out.printf(" The smallest number is %d.", c);
        }
        double aver = (double) (a + b + c) / 3;
        System.out.printf(" The average of entered numbers is %.2f.", aver);
    }


}
