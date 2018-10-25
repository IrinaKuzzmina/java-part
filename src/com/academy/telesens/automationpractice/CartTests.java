package com.academy.telesens.automationpractice;

import com.academy.telesens.automationpractice.model.Cart;
import com.academy.telesens.automationpractice.model.EntityDress;

import java.util.Scanner;

public class CartTests {
    private String browser;
    private String baseUrl;

    public void init(String browser, String baseUrl) {
        this.browser = browser;
        this.baseUrl = baseUrl;
    }

/*    public void testAddDressToCart() {
        beforeTest();
        System.out.println("Click more");
        EntityDress entityAdded = readCurrentEntityFromUI();

        System.out.println(String.format("Add entity '%s' to cart", entityAdded));
        System.out.println("Go to cart");

        EntityDress entityFromCart = readEntityFromCart();
        System.out.println(String.format("Read entity '%s' from cart", entityFromCart));


        System.out.println("Assert equals added entity and read entity");
        assert entityAdded.equals(entityFromCart);
        System.out.println("Finish 'testAddDressToCart'");
    }*/

//    public void testMoreThanOneItemToCart() {
//        beforeTest();
//        System.out.println("Click more");
//        System.out.println("Please, enter the number of items you want to add to the card. NOW THE NUMBER MUST BE 3");
//        Scanner scanner = new Scanner(System.in);
//        int entitiesNumber = scanner.nextInt();
//        double sum = 0;
//        EntityDress[] addedEntities = new EntityDress[entitiesNumber];
//        for (int x = 0; x < entitiesNumber; x++) {
//            System.out.println("Click \"+ button\"");
//            addedEntities[x] = readCurrentEntityFromUI();
//            sum += addedEntities[x].getPrice();
//            System.out.println(String.format("Add entity '%s' added to cart. The number of the currently added entity is '%d'.", addedEntities[x], x + 1));
//        }
//        System.out.println("Go to cart");
//        EntityDress entityFromCart = readEntityFromCart();
//        System.out.println(String.format("Read entity '%s' from cart", entityFromCart));
//
//        System.out.println("Assert equals added entity and read entity");
//        assert addedEntities[0].equals(entityFromCart);
//
//        System.out.println("Assert equalty of the amount of added items with amount of items in the cart");
//        Cart newCart = new Cart();
//        assert addedEntities.length == readItemsNumberInCart();
//        System.out.println(String.format("The amount of added items is '%d' and the amount of items in the cart is '%d'", addedEntities.length, readItemsNumberInCart()));
//
//        System.out.println("Assert equalty of the sum of added items with sum of items in the cart");
//        assert sum == readTotalSumInCart();
//        System.out.println(String.format("The total sum of added items is '%.2f' and total sum of items in the cart is '%.2f'", sum, readTotalSumInCart()));
//
//        System.out.println("Finish 'testAddDressMoreThanOneToCart'");
//    }

     /*public void testAddDifferentItemsToCart() {
            beforeTest();
            System.out.println("Click more");
            System.out.println("Please, enter the number of items you want to add to the card");
            Scanner scanner = new Scanner(System.in);
            int entitiesNumber = scanner.nextInt();

            List<EntityDress> addedEntities = new ArrayList<>();
            for (int x = 0; x < entitiesNumber; x++) {
                System.out.println("Click \"+ button\"");
                addedEntities.add(readCurrentEntityFromUI());
                System.out.println(String.format("Add entity '%s' in the amount of '%d' to cart", addedEntities.get(addedEntities.size() - 1), addedEntities.size()));
            }
            System.out.println("Go to cart");

            List<EntityDress> entitiesInCart = new ArrayList<>();
            Iterator it = entitiesInCart.iterator();
            while (it.hasNext()) {
                entitiesInCart.add(readEntityFromCart());
                System.out.println(String.format("Read entity '%s' from cart.", entitiesInCart.get(0)));
            }
            System.out.println("Assert equals added entity and read entity");

            int numberOfItem = 0;
            while (it.hasNext()) {
                assert entitiesInCart.get(numberOfItem).equals(addedEntities.get(numberOfItem));
                numberOfItem++;
            }
            System.out.println("Assert that number of added entities equals number of read entities");
            assert entitiesInCart.size() == addedEntities.size();
            System.out.println("Finish 'testAddDressMoreThanOneToCart'");
        }*/

    public void testAddDressToCart(EntityDress addedDress, int amount) {
        beforeTest();
        System.out.println("Find and Click more by " + addedDress);
//        EntityDress entityAdded = readCurrentEntityFromUI();

        System.out.println(String.format("Add entity '%s', amount: %d to cart",
                addedDress, amount));
        System.out.println("Go to cart");

        EntityDress entityFromCart = readEntityFromCart();
        int  amountFromCart = readAmountFromCart();
        double totalFromCart = readTotalFromCart();
        double total = amountFromCart*addedDress.getPrice();
        System.out.println(String.format("Read entity '%s' from cart", entityFromCart));


        System.out.println("Assert equals added entity and read entity");
        assert addedDress.equals(entityFromCart);
        assert amount == amountFromCart;
        assert total == totalFromCart;
        System.out.println("Finish 'testAddDressToCart'");
    }

    private double readTotalFromCart() {
        return 156.0;
    }

    private int readAmountFromCart() {
        return 2;
    }



    private EntityDress readEntityFromCart() {
        EntityDress entityFromCart = new EntityDress();
        entityFromCart.setName("Printed Dress");
        entityFromCart.setModel("demo_3");
        entityFromCart.setSize("S");
        entityFromCart.setColor("Orange");
        entityFromCart.setPrice(26.00);
        return entityFromCart;
    }

    private EntityDress readCurrentEntityFromUI() {
        EntityDress entityAdded = new EntityDress();
        entityAdded.setName("Printed Dress");
        entityAdded.setModel("demo_3");
        entityAdded.setSize("S");
        entityAdded.setColor("Orange");
        entityAdded.setPrice(26.00);
        return entityAdded;
    }

    public void beforeTest() {
        System.out.println("Start 'testAddDressToCart'");
        System.out.println(String.format("Open browser '%s'", browser));
        System.out.println(String.format("Go to '%s'", baseUrl));
        System.out.println("Go to 'Dresses' category");
    }

    public int readItemsNumberInCart() {
        Cart newCart = new Cart();
        newCart.setTotalItemsAmount(3);
        int itemsNumberInCart = newCart.getTotalItemsAmount();
        return itemsNumberInCart;
    }

    public double readTotalSumInCart() {
        Cart newCart = new Cart();
        newCart.setTotalSum(78);
        double totalSumInCart = newCart.getTotalSum();
        return totalSumInCart;
    }
}
