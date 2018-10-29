package com.academy.telesens.automationpractice.tests;

import com.academy.telesens.automationpractice.model.EntityDress;
import com.academy.telesens.automationpractice.pages.DressesPage;
import com.academy.telesens.automationpractice.pages.LoginPage;
import com.academy.telesens.automationpractice.pages.MyAccountPage;
import com.academy.telesens.automationpractice.pages.MyWishListsPage;

public class WishListTests extends BaseTest {
    public void myWishListCreationTest(String name, String line) {
        beforeTest();
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.clickMyWishListsButton();
        MyWishListsPage myWishListsPage = new MyWishListsPage();

        if (myWishListsPage.compareNameWithExistingWishLists(line) == true) {
            myWishListsPage.deleteWishList();
            myWishListsPage.enterNewFishListName(name);
            myWishListsPage.setWishListName(line);
            myWishListsPage.clickSaveButton();
        } else {
            myWishListsPage.enterNewFishListName(name);
            myWishListsPage.setWishListName(line);
            myWishListsPage.clickSaveButton();
        }
        assert myWishListsPage.compareNameWithExistingWishLists(line) == true;
    }


    public void myWishListDeleteTest(String line, String name) {
        beforeTest();
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.clickMyWishListsButton();
        MyWishListsPage myWishListsPage = new MyWishListsPage();
        if (myWishListsPage.compareNameWithExistingWishLists(line) == true) {
            myWishListsPage.deleteWishList();
        } else {
            myWishListsPage.enterNewFishListName(name);
            myWishListsPage.setWishListName(line);
            myWishListsPage.clickSaveButton();
            myWishListsPage.deleteWishList();
        }
        assert myWishListsPage.compareNameWithExistingWishLists(line) == false;
    }

    public void addModelToWishListTest(String line){
        beforeTest();
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.clickOnDresses();
        DressesPage dressesPage = new DressesPage();
        dressesPage.readCurrentEntityFromUI(line);
        dressesPage.clickAddToWishList();
        dressesPage.clickAddToWishList();
        myAccountPage.clickMyWishListsButton();
        MyWishListsPage myWishListsPage = new MyWishListsPage();
        myWishListsPage.clickOnViewLink();
        assert (myWishListsPage.readEntityFromWishList(line).equals(dressesPage.readCurrentEntityFromUI(line)));

    }

}
