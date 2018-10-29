package com.academy.telesens.automationpractice.pages;

import com.academy.telesens.automationpractice.model.EntityDress;

public class MyWishListsPage {
    String wishListName;

    public void enterNewFishListName(String name) {
        System.out.println("Enter new wishlist name " + name);
    }

    public void clickSaveButton() {
        System.out.println("Click on the 'Save' button");
    }

    public String getWishListName() {
        return wishListName;
    }

    public String setWishListName(String line) {
        String[] namesFromFile = parceWishListNames(line);
        for (int i = 0; i < namesFromFile.length; i++) {
            this.wishListName = namesFromFile[i];
        }
        return wishListName;
    }

    public String[] parceWishListNames(String line) {
        String[] namesFromFile = line.split(",");
        return namesFromFile;
    }

    public String[] readExistingWishListNames(String line) {
        String[] existingWishLists = new String[line.length()];
        String[] namesFromFile = parceWishListNames(line);
        for (int i = 0; i < namesFromFile.length; i++) {
            existingWishLists[i] = setWishListName(existingWishLists[i]);
        }
        return existingWishLists;
    }

    public boolean compareNameWithExistingWishLists(String line) {
        String[] namesFromFile = parceWishListNames(line);
        String[] existingWishLists = readExistingWishListNames(line);
        boolean result = false;
        for (int i = 0; i < namesFromFile.length; i++) {
            for (int j = 0; j < existingWishLists.length; j++) {
                if (namesFromFile[i].equals(existingWishLists[j])) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public void deleteWishList() {
        clickOnDeleteButton();

    }

    public void clickOnDeleteButton() {
        System.out.println("Click on the 'Delete' button");
    }

    public EntityDress readEntityFromWishList(String line){
        DressesPage dressesPage = new DressesPage();
        EntityDress entityInWishList = dressesPage.readCurrentEntityFromUI(line);
        return entityInWishList;
    }
    public void clickOnViewLink(){
        System.out.println("Follow 'View' link");
    }
}
