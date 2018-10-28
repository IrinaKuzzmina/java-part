package com.academy.telesens.automationpractice.address;
import com.telesens.automationpractice.appmanager.model.AddressData;
import static com.academy.telesens.automationpractice.address.NewAddressData.parseData;

public class ParseAddressDemo {
    static String rawLine =
            "Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef";

    public static void main(String[] args) {
        NewAddressData newAddressData = new NewAddressData();
        System.out.println(parseData(rawLine).toString());


    }
}


