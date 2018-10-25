package com.academy.telesens.Homework06;

public class DateTime extends Date {
    private String hours = "12";
    private String minutes = "12";
    private String seconds = "12";

    public DateTime() {

    }

    public DateTime(String hours, String minutes, String seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public DateTime(DateTime dateTime) {
        this.hours = dateTime.hours;
        this.minutes = dateTime.minutes;
        this.seconds = dateTime.seconds;
    }

    public int getHours() {
        return Integer.parseInt(hours);
    }

    public void setHours(String hours) {
        if (checkHour(Integer.parseInt(hours)) == true) {
            this.hours = hours;
        } else {
            System.out.println("You've entered wrong hour");
        }
    }

    public int getMinutes() {
        return Integer.parseInt(minutes);
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return Integer.parseInt(seconds);
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public boolean checkHour(int hours) {
        boolean result = true;
        hours = this.getHours();
        if (hours <= 24) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "hours='" + hours + '\'' +
                ", minutes='" + minutes + '\'' +
                ", seconds='" + seconds + '\'' +
                '}';
    }
}
