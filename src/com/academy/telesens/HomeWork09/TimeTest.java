package com.academy.telesens.HomeWork09;


import static com.academy.telesens.HomeWork09.TimeFormat.TIME_FORMAT_12;
import static com.academy.telesens.HomeWork09.TimeFormat.TIME_FORMAT_24;

public class TimeTest {
    public static void main(String[] args) {
        TimeImpl time = new TimeImpl();
        time.setTime(13, 23, 21);
        System.out.println(time.getTime(TIME_FORMAT_24));
        System.out.println(time.getTime(TIME_FORMAT_12));

        Time timeSimple = new TimeImpl();
        timeSimple.setTime(12, 14, 33);
        System.out.println(timeSimple.getTime(TIME_FORMAT_24));
        System.out.println(timeSimple.getTime(TIME_FORMAT_12));

        Time timeSeconds = new TimeImplSeconds();
        timeSeconds.setTime(14, 17, 30);
        System.out.println(timeSeconds.getTime(TIME_FORMAT_24));
        System.out.println(timeSeconds.getTime(TIME_FORMAT_12));


    }
}
