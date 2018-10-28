package com.academy.telesens.automationpractice.tests;

public class BaseTest {
    protected String browser;
    protected  String baseUrl;

    public void init(String browser, String baseUrl) {
        this.browser = browser;
        this.baseUrl = baseUrl;
    }

    public void beforeTest() {
        System.out.println("Start 'testAddDressToCart'");
        System.out.println(String.format("Open browser '%s'", browser));
        System.out.println(String.format("Go to '%s'", baseUrl));
    }

}
