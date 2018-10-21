package com.academy.telesens.Homework05;

import java.util.regex.Pattern;

public class Task01 {
    //Написать и протестировать регулярное выражение, которое проверяет, что строка начинается с заглавной буквы и заканчивается точкой.
    public static void main(String[] args) {
        String regex = "[A-ZА-Я].*[\\.]";
        String[] stringArray = {"В лесу родилась елочка,", "в лесу она росла.", "Зимой и летом стройная", "Зеленая была."};

        for (int i = 0; i < stringArray.length; i++) {
            boolean result = Pattern.matches(regex, stringArray[i]);
            if (result) {
                System.out.println(stringArray[i]);
            }
        }

    }
}
