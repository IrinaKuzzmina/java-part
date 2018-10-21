package com.academy.telesens.Homework05;

//Проверить, число на соответствие формату: цифрые группами по три могут быть разделены запятой, пробелом или символом подчеркивания.

import java.util.regex.Pattern;

public class Task04 {
    public static void main(String[] args) {
        String regex = "^[1-9]{0,3}((,|_|\\s|-)?)\\d{0,3}\\1\\d{3}";
        String[] stringArray = {"8,205,500", "8 205 500", "8_205_500", "8-205-500", "1,5826,000", "1-826,000", "15826"};

        for (int i = 0; i < stringArray.length; i++) {
            boolean result = Pattern.matches(regex, stringArray[i]);
            if (result) {
                System.out.println(stringArray[i]);
            }
        }

    }
}
