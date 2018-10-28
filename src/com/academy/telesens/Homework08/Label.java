package com.academy.telesens.Homework08;

public class Label extends Component {
    private String name = "Label";
    private int width = 1;
    private int height = 2;
    private String color = "Green";

    @Override
    public void draw() {
        System.out.println("Label");
    }

    @Override
    public void draw3D() {
        System.out.println("3D Label");
    }

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
