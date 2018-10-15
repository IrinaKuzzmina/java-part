package com.academy.telesen.Homework3;

import java.util.Scanner;

public class Task9 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int length[] = enterArrayLength();
        double[][] array = enterArrayElements(length);
        printArray(length, array);
        findMax(length, array);
        findMin(length, array);


    }

    public static int[] enterArrayLength() {
        System.out.println("Please enter two numbers to set the length of array:");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int[] length = new int[2];
        length[0] = number1;
        length[1] = number2;
        return length;
    }

    public static double[][] enterArrayElements(int[] length) {
        double[][] array = new double[length[0]][length[1]];
        for (int i = 0; i < length[0]; i++) {
            for (int j = 0; j < length[1]; j++) {
                double element = scan.nextDouble();
                array[i][j] = element;
            }
        }
        return array;

    }

    public static void printArray(int[] length, double array[][]) {
        for (int i = 0; i < length[0]; i++) {
            System.out.println();
            for (int j = 0; j < length[1]; j++) {
                System.out.print((double) (Math.round(array[i][j] * 100)) / 100 + " ");
            }

        }
    }

    public static void findMax(int[] length, double array[][]) {
        double max = 0;
        int row = 0;
        for (int i = 0; i < length[0]; i++) {
            for (int j = 0; j < length[1]; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i + 1;
                }
            }
        }
        System.out.println("The max number is " + (double) Math.round(max) * 100 / 100 + ". The max number is in the row number " + row);
    }

    public static void findMin(int[] length, double array[][]) {
        double min = array[0][0];
        int row = 0;
        for (int i = 0; i < length[0]; i++) {
            for (int j = 0; j < length[1]; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    row = i + 1;
                }
            }
        }
        System.out.println("The min number is " + (double) Math.round(min) * 100 / 100 + ". The min number is in the row number " + row);
    }
}
