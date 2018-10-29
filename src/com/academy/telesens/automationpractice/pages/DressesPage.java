package com.academy.telesens.automationpractice.pages;

import com.academy.telesens.automationpractice.model.EntityDress;

public class DressesPage {
    public void clickAddToWishList() {
        System.out.println("Click on the 'Add to Wishlist'");
    }

    public EntityDress readCurrentEntityFromUI(String line) {
        String[] parcedData = line.split(",");
        EntityDress entityDress = new EntityDress();
        entityDress.setModel(parcedData[0]);
        entityDress.setName(parcedData[1]);
        entityDress.setSize(parcedData[2]);
        entityDress.setColor(parcedData[3]);
        return entityDress;
    }

    public void clickOnViewCustomerAccount() {
        System.out.println("Click on the 'View my customer account'");
    }
}
