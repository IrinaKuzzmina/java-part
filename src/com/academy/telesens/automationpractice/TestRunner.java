package com.academy.telesens.automationpractice;

public class TestRunner {
    public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("firefox", "http://automationpractice.com");
        cartTests.testAddDressToCart();
        cartTests.testMoreThanOneItemToCart();
    }
}
