package com.academy.telesens.Homework06;


public class Currency {
    private double value = 0;
    private String name = "$";

    public Currency() {
    }

    public Currency(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public Currency(Currency currency) {
        this.value = currency.value;
        this.name = currency.name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("%.2f %s\n", value, name);
    }

    public boolean isEqual(Currency currency) {
        boolean result;
        if (this.value == currency.value && this.name.equals(currency.name)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public double add(double value, String name) {
        double sum = 0;
        if (!this.name.equals(name)) {
            System.out.printf("Error: currency names are different %s - %s.\n", this.name, name);
        } else {
            sum = this.value + value;
            System.out.printf("Sum is %.2f.\n", sum);
        }
        return sum;
    }

    public double add(Currency currency) {
        double sum = 0;
        sum = this.value + currency.value;
        System.out.printf("Sum is %.2f.\n", sum);
        return sum;
    }

    public double substract(double value, String name) {
        double substract = 0;
        if (!this.name.equals(name)) {
            System.out.printf("Error: currency names are different %s - %s.\n", this.name, name);
        } else {
            substract = this.value - value;
            System.out.printf("Substract is %.2f.\n", substract);
        }
        return substract;
    }

    public double substract(Currency currency) {
        double substract = 0;
        substract = this.value - currency.value;
        System.out.printf("Substract is %.2f.\n", substract);
        return substract;
    }

    public double divide(double factor) {
        double divide = 0;
        divide = this.value / factor;
        System.out.printf("Divide is %.2f.\n", divide);
        return divide;
    }

    public double multiply(double factor) {
        double multiply = 0;
        multiply = this.value * factor;
        System.out.printf("Multiply is %.2f.\n", multiply);
        return multiply;
    }
}


