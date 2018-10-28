package com.academy.telesens.Homework08;

public class Button extends Component {

    private String name = "Button";
    private int width = 2;
    private int height = 1;

    @Override
    public void draw() {
        System.out.println("Button");
    }

    @Override
    public String toString() {
        return "Button{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
