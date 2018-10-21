package com.academy.telesens.Homework05;

import java.util.regex.Pattern;

public class Task05 {
//Напишите программу, которая посчитает количество смайликов в заданном тексте.

    public static void main(String[] args) {
        String text = "Привет, :) это хорошее настроение, a :))) это отличное. Это ;--[ плохое, а это ;--[[[[[ очень плохое. А эти смайлы: :-)] :-() не существуют.";
        String[] array = text.split(" ");
        String regex = "(;|:){1}-*(\\)|\\(|\\[|\\])\\2*";
        int count = 0;
        for (String word : array) {
            boolean result = Pattern.matches(regex, word);
            if (result) {
                count++;
            }
        }
        System.out.println(count);
    }
}
