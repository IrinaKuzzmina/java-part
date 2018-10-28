package com.academy.telesens.automationpractice.pages;

public class CartPage {
    private int totalItemsAmount;
    private int totalSum;

    public CartPage(){

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
