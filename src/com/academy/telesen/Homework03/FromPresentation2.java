package com.academy.telesen.Homework3;

/*Создать массив целых чисел из 10 элементов
 Наполнить случайными значениями от 18 до 60
 Отсортировать массив
 Вывести массив на консоль*/

import java.util.Arrays;
import java.util.Random;

public class FromPresentation2 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            int max = 60;
            int min = 18;
            randomArray[i] = random.nextInt(max - min) + min;
        }
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
    }
}
