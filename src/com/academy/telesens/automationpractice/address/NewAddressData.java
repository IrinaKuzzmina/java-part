package com.academy.telesens.automationpractice.address;

import com.telesens.automationpractice.appmanager.model.AddressData;

public class NewAddressData extends AddressData {

    public static AddressData parseData(String line){
        String[] splittedData = line.split(",");
        AddressData address =
                new AddressData()
                        .withFirstName(splittedData[0])
                        .withLastName(splittedData[1])
                        .withAddress(splittedData[2])
                        .withCity(splittedData[3])
                        .withState(splittedData[4])
                        .withZipCode(splittedData[5])
                        .withCountry(splittedData[6])
                        .withHomePhone(splittedData[7])
                        .withMobilePhone(splittedData[8])
                        .withAddressAlias(splittedData[9]);
        return address;
    }

    public String toString() {
        return "Name: " + getFirstName() + " Last Name: " + getLastName() + " Address: " + getAddress() + " City: " + getCity()
                + " State: " + getState() + " ZipCode " + getZipCode() + " Country " + getCountry() + " Home Phone "
                + getHomePhone() + " Mobile Phone " + getMobilePhone() + " Address Alias: ";
    }
}
