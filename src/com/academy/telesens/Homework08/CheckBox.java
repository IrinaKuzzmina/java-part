package com.academy.telesens.Homework08;

public class CheckBox extends Button {
    private String name = "CheckBox";
    private int width = 1;
    private int height = 1;
    boolean isChecked = false;

    @Override
    public String toString() {
        return "CheckBox{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", isChecked=" + isChecked +
                '}';
    }
}
