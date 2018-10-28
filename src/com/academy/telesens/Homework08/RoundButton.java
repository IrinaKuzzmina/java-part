package com.academy.telesens.Homework08;

public class RoundButton extends Button {
    private String name = "RoundButton";
    private int radius = 2;

    @Override
    public void draw() {
        System.out.println("RoundButton");
    }

    @Override
    public String toString() {
        return "RoundButton{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
