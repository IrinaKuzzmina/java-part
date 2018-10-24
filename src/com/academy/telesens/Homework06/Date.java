package com.academy.telesens.Homework06;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Objects;
import java.util.regex.Pattern;


public class Date //extends java.util.Date
{
    private String day = "01";
    private String month = "01";
    private String year = "1997";


    public Date() {

    }

    public Date(String day, String month, String year) {
        if (checkDate(day, month, year) == true) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("You've entered wrong date");
        }
    }

    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public String getMyDay() {

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

    public String getMyMonth() {

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

    public String getMyYear() {

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
        int day1 = Integer.parseInt(date1.getMyDay());
        int month1 = Integer.parseInt(date1.getMyMonth());
        int year1 = Integer.parseInt(date1.getMyYear());

        int day2 = Integer.parseInt(date2.getMyDay());
        int month2 = Integer.parseInt(date2.getMyMonth());
        int year2 = Integer.parseInt(date2.getMyYear());

        LocalDate firstDate = LocalDate.of(year1, month1, day1);
        LocalDate secondDate = LocalDate.of(year2, month2, day2);
        Period period = Period.between(firstDate, secondDate);
        long periodInDays = ChronoUnit.DAYS.between(firstDate, secondDate);

        System.out.println("\nThe difference is " + period.getYears() + " years, " + period.getMonths() +
                " months, and " + period.getDays() +
                " days. (" + periodInDays + " days total)");
    }

    public void print() {
        System.out.println(String.format("Year: %s, month: %s, day: %s", year, month, day));
        System.out.println();
    }

    public void printWithArguments(String year, String month, String day) {
        System.out.println(String.format("Year: %s, month: %s, day: %s", year, month, day));
        System.out.println();
    }

    public void getDayOfWeek() {
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(getMyYear()), Integer.parseInt(getMyMonth()) - 1,
                Integer.parseInt(getMyDay()));
        int weekDayNumber = c.get(Calendar.DAY_OF_WEEK);
        switch (weekDayNumber) {
            case 1:
                System.out.println("\nMonday");
                break;
            case 2:
                System.out.println("\nTuesday");
                break;
            case 3:
                System.out.println("\nWednesday");
                break;
            case 4:
                System.out.println("\nThursday");
                break;
            case 5:
                System.out.println("\nFriday");
                break;
            case 6:
                System.out.println("\nSaturday");
                break;
        }
    }

    public int getWeekOfYear() {
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(getMyYear()), Integer.parseInt(getMyMonth()) - 1,
                Integer.parseInt(getMyDay()));
        int weekNumber = c.get(Calendar.WEEK_OF_YEAR);
        return weekNumber;

    }

    public void nextDay() {
        int nextDay;
        if ((Integer.parseInt(getMyDay()) + 1) <= 31) {
            nextDay = Integer.parseInt(getMyDay()) + 1;
        } else {
            nextDay = 1;
        }
        System.out.println("Tomorrow the date will be:");
        this.printWithArguments(this.year, this.month, Integer.toString(nextDay));
    }

    public void nextMonth() {
        int nextMonth;
        if ((Integer.parseInt(getMyMonth()) + 1) <= 12) {
            nextMonth = Integer.parseInt(getMyMonth()) + 1;
        } else {
            nextMonth = 1;
        }
        System.out.println("In a month the date will be:");
        this.printWithArguments(this.year, Integer.toString(nextMonth), this.day);
    }

    public void nextYear() {
        int nextYear = Integer.parseInt(getMyYear()) + 1;
        System.out.println("In a year the date will be:");
        this.printWithArguments(Integer.toString(nextYear), this.month, this.day);

    }

    public void addDays(int days) {
        int newDay;
        if ((Integer.parseInt(getMyDay()) + days) <= 31) {
            newDay = Integer.parseInt(getMyDay()) + days;
            this.day = Integer.toString(newDay);
        } else {
            int newMonth;
            int monthDifference = (Integer.parseInt(getMyDay()) + days) / 31;
            newMonth = Integer.parseInt(getMyMonth()) + monthDifference;
            if (newMonth > 12) {
                int newYear = Integer.parseInt(getMyYear()) + (newMonth / 12);
                this.year = Integer.toString(newYear);
                newMonth = newMonth % 12;
                this.month = Integer.toString(newMonth);
            }
            newDay = (Integer.parseInt(getMyDay()) + days) % 31;
        }
        this.day = Integer.toString(newDay);
        System.out.println(String.format("In %d days the date will be:", days));
        this.print();
    }

    @Override
    public String toString() {
        return "Date{" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return Objects.equals(day, date.day) &&
                Objects.equals(month, date.month) &&
                Objects.equals(year, date.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}





