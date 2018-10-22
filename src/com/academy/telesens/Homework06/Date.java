package com.academy.telesens.Homework06;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;


public class Date {
    private String day = "01";
    private String month = "01";
    private String year = "2000";

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        if (checkDay(day) == true) {
            this.day = day;
        } else {
            System.out.println("You tried to set unreal day");
        }
    }

    public boolean checkDay(String day) {
        String regex = "^(0?[1-9])$|^([1-2]\\d)$|^([3][01])$";
        boolean result;
        if (result = Pattern.matches(regex, day)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        if (checkMonth(month) == true) {
            this.month = month;
        } else {
            System.out.println("You tried to set unreal month");
        }
    }

    public boolean checkMonth(String month) {
        String regex = "^(0?[1-9])$|^(1[0-2])$";
        boolean result;
        if (result = Pattern.matches(regex, month)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (checkYear(year) == true) {
            this.year = year;
        } else {
            System.out.println("You tried to set unreal year");
        }
    }

    public boolean checkYear(String year) {
        String regex = "^[1-9]\\d?\\d?\\d?$";
        boolean result;
        if (result = Pattern.matches(regex, year)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void setDate(String day, String month, String year) {
        if (checkDate(day, month, year) == true) {
            setDay(day);
            setMonth(month);
            setYear(year);
        } else {
            System.out.println("You've entered wrong date");
        }
    }

    public boolean checkDate(String day, String month, String year) {
        boolean result;
        if (checkDay(day) == true && checkMonth(month) == true && checkYear(year) == true) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void findDifferenceBetweenDates(Date date1, Date date2) {
        int day1 = Integer.parseInt(date1.getDay());
        int month1 = Integer.parseInt(date1.getMonth());
        int year1 = Integer.parseInt(date1.getYear());

        int day2 = Integer.parseInt(date2.getDay());
        int month2 = Integer.parseInt(date2.getMonth());
        int year2 = Integer.parseInt(date2.getYear());

        LocalDate firstDate = LocalDate.of(year1,month1,day1);
        LocalDate secondDate = LocalDate.of(year2,month2,day2);
        Period period = Period.between(firstDate, secondDate);
        long periodInDays= ChronoUnit.DAYS.between(firstDate, secondDate);

        System.out.println("\nThe difference is " + period.getYears() + " years, " + period.getMonths() +
                " months, and " + period.getDays() +
                " days. (" + periodInDays + " days total)");
    }

    public void print(){
            System.out.printf("\nYear: %s, month: %s, day: %s", year, month, day);
        }
    }



