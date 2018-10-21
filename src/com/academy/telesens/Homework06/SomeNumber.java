package com.academy.telesens.Homework06;

public class SomeNumber {
    private int n;

    public SomeNumber() {
    }

    public SomeNumber(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void print() {
        System.out.println("Число: " + n);
    }

    public boolean isPositive() {
        boolean result;

        if (n < 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "n = " + getN();
    }
}
