package com.academy.telesens.Homework08;

public class Component implements VisualComponent {

    private String name = "Component";
    private int width = 2;
    private int height = 2;

    @Override
    public void draw() {
        System.out.println("Component");
    }

    @Override
    public void draw3D() {
        System.out.println("3D Component");

    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
