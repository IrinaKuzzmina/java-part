package com.academy.telesens.HomeWork09;


import static com.academy.telesens.HomeWork09.TimeFormat.TIME_FORMAT_12;
import static com.academy.telesens.HomeWork09.TimeFormat.TIME_FORMAT_24;

public class TimeTest {
    public static void main(String[] args) {
        TimeImpl time = new TimeImpl();
        time.setTime(13,23,21);
       System.out.println(time.getTime(TIME_FORMAT_24));
       System.out.println(time.getTime(TIME_FORMAT_12));
    }
}
