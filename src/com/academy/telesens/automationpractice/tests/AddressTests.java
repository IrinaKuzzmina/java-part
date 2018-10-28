package com.academy.telesens.automationpractice.tests;

import com.academy.telesens.automationpractice.address.NewAddressData;
import com.academy.telesens.automationpractice.pages.LoginPage;
import com.academy.telesens.automationpractice.pages.MyAccountPage;
import com.academy.telesens.automationpractice.pages.MyAddressesPage;
import com.telesens.automationpractice.appmanager.model.AddressData;

import java.util.ArrayList;

public class AddressTests extends BaseTest {

    public void testUpdateAddress(NewAddressData address, String line, String updatedData) {
        AddressData updatedAddress;
        ArrayList<AddressData> listOfExistingAddresses;
        ArrayList<AddressData> listOfAddressesAfterUpdate;
        beforeTest();
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.followMyAddressesLink();
        MyAddressesPage myAddressesPage = new MyAddressesPage();
        listOfExistingAddresses = myAddressesPage.readExistingAddresses(address, line);
        if (myAddressesPage.compareAddressWithExistingAddresses(address, line) == true) {
            updatedAddress = myAddressesPage.updateAddress(address, line, updatedData);
        } else {
            myAddressesPage.addNewAddress(address, line);
            updatedAddress = myAddressesPage.updateAddress(address, line, updatedData);
        }
        listOfAddressesAfterUpdate = myAddressesPage.readExistingAddresses(address, line);

        assert myAddressesPage.compareAddressWithExistingAddresses((NewAddressData) updatedAddress, updatedData);

        for (int i = 0; i < listOfAddressesAfterUpdate.size(); ) {
            if (address.parseData(updatedData).equals(listOfAddressesAfterUpdate.get(i))) {
                i++;
            } else {
                assert listOfExistingAddresses.get(i).equals(listOfAddressesAfterUpdate.get(i));
            }



        }

    }
}




