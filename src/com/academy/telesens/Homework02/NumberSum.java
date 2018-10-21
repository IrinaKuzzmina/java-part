package com.academy.telesens.Homework02;

public class NumberSum {
    public static void main(String[] args) {
        int n = 45;
        int sum = 0;
        int remain = 0;
        for (int i = 0; i < 2; i++) {
            remain = n % 10;
            sum += remain;
            n = n / 10;
        }
        System.out.println(sum);

    }
}
