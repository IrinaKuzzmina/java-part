package com.academy.telesens.Homework06;


public class TestCurrency {

    public static void main(String[] args) {
        Currency currency0 = testDefaultConstructor();
        currency0.print();

        Currency currency1 = testConstructorWithArguments();
        currency1.print();

        Currency currency2 = testConstructorCopy(currency1);
        currency2.print();

        TestCurrency testObject = new TestCurrency();

        testObject.testAdd(currency1);
        testObject.testAddOfCoppied(currency1,currency2);
        testObject.testSubstract(currency1);
        testObject.testSubstractOfCoppied(currency1,currency2);
        testObject.testDivide(currency1);
        testObject.testMultiply(currency1);
        testObject.testIsEqual(currency1,currency2);

}

    public boolean testAdd(Currency currency) {
        if (currency.add(20.01, "$") == 30.23 || currency.add(20.01, "eur") == 0) {
            System.out.println("Test of \"Add\" passed");
            return true;
        } else {
            System.out.println("Test of \"Add\" faild");
            return false;
        }
    }

    public boolean testAddOfCoppied(Currency currency, Currency currency1) {
        if (currency.add(currency1) == 20.44) {
            System.out.println("Test of \"Add of coopied\" passed");
            return true;
        } else {
            System.out.println("Test of \"Add of coopied\" faild");
            return false;
        }
    }

    public boolean testSubstract(Currency currency) {
        if (currency.substract(20.01, "$") == -9.79 || currency.substract(20.01, "eur") == 0) {
            System.out.println("Test of \"Substract\" passed");
            return true;
        } else {
            System.out.println("Test of \"Substract\" faild");
            return false;
        }
    }

    public boolean testSubstractOfCoppied(Currency currency, Currency currency1) {
        if (currency.substract(currency1) == 0) {
            System.out.println("Test of \"Substract of coopied\" passed");
            return true;
        } else {
            System.out.println("Test of \"Substract of coopied\" faild");
            return false;
        }
    }

    public boolean testDivide(Currency currency) {
        if (currency.divide(2) == 5.11) {
            System.out.println("Test of \"Divide\" passed");
            return true;
        } else {
            System.out.println("Test of \"Divide\" faild");
            return false;
        }
    }
    public boolean testMultiply(Currency currency) {
        if (currency.multiply(2) == 20.44) {
            System.out.println("Test of \"Mupltiply\" passed");
            return true;
        } else {
            System.out.println("Test of \"Mupltiply\" faild");
            return false;
        }
    }

    public void testIsEqual(Currency currency, Currency currency1){
        if( currency.isEqual(currency1)){
            System.out.println("They are equal. Test \"IsEqual\" passed.\n");
        }else{
            System.out.println("Test \"IsEqual\" failed.\n");
        }

    }

 public static Currency testDefaultConstructor(){
     Currency currency0 = new Currency();
     return currency0;
 }
    public static  Currency testConstructorWithArguments(){
        Currency currency1 = new Currency(10.22, "$");
        return currency1;
    }

    public static Currency testConstructorCopy(Currency currency){
        Currency currency2 = new Currency(currency);
        return currency2;
    }
}




