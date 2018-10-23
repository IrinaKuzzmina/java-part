package com.academy.telesens.automationpractice.model;

public class Cart {
    private int totalItemsAmount;
    private int totalSum;

    public Cart(){

    }
    public int getTotalItemsAmount() {
        return totalItemsAmount;
    }

    public void setTotalItemsAmount(int totalItemsAmount) {
        this.totalItemsAmount = totalItemsAmount;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

}
