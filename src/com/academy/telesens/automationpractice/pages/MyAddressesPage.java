package com.academy.telesens.automationpractice.pages;

import com.academy.telesens.automationpractice.address.NewAddressData;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.telesens.automationpractice.appmanager.model.AddressData;

import java.util.ArrayList;

public class MyAddressesPage {



    public ArrayList<AddressData> readExistingAddresses(NewAddressData addressData, String line) {
        ArrayList<AddressData> listOfExistingAddresses = new ArrayList<>();
        listOfExistingAddresses.add(addressData.parseData(line));
        return listOfExistingAddresses;
    }

    public boolean compareAddressWithExistingAddresses(NewAddressData addressData,String line) {
        boolean resut = false;
        for (int i = 0; i < readExistingAddresses(addressData,line).size(); i++) {
            if (addressData.parseData(line).equals(readExistingAddresses(addressData,line).get(i))) {
                resut = true;
            } else {
                resut = false;
            }
        }
        return resut;
    }

    public void addNewAddress(NewAddressData addressData,String line){
        clickOnAddNewAddressButton();
        addressData.parseData(line);
        clickOnSaveButton();

    }

    public AddressData updateAddress(NewAddressData addressData,String line, String updatedData) {
        AddressData updatedAddressData = new NewAddressData();
        for (int i = 0; i < readExistingAddresses(addressData,line).size(); i++) {
            if (addressData.parseData(line).equals(readExistingAddresses(addressData,line).get(i))) {
                clickOnUpdateButton();
                updatedAddressData =  new NewAddressData().parseData(updatedData);
                clickOnSaveButton();
            }
        }  return updatedAddressData;
    }


     public void clickOnAddNewAddressButton (){
         System.out.println("Click on the 'Add a new address' button");
     }

    public void clickOnSaveButton(){
        System.out.println("Click on the 'Save' button");
    }

    public void clickOnUpdateButton(){
        System.out.println("Click on the 'Update' button");
    }
}

