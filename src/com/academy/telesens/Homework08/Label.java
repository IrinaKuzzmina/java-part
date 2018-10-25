package com.academy.telesens.Homework08;

public class Label extends Component {
    private String name = "Label";
    private int width = 1;
    private int height = 2;
    private String color = "Green";

    @Override
    public String toString() {
        return "Label{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
