package com.academy.telesens.automationpractice;

import com.academy.telesens.automationpractice.address.NewAddressData;
import com.academy.telesens.automationpractice.tests.AddressTests;
import com.academy.telesens.automationpractice.tests.CartTests;
import com.academy.telesens.automationpractice.model.EntityDress;

public class TestRunner {
    public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("firefox", "http://automationpractice.com");
        //cartTests.testAddDressToCart();
        //cartTests.testMoreThanOneItemToCart();


        AddressTests addressTests = new AddressTests();
        cartTests.init("firefox", "http://automationpractice.com");
        String line = "Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef";
        String updatedData = "Natalya,Ivanova,Pushkinskaya st. 39,Kiev,Alaska,61893,United States,+3809359013437,0932340967,addressUpdatesRef";
        NewAddressData addressData = new NewAddressData();

        addressTests.testUpdateAddress(addressData,line,updatedData );


        EntityDress entityDress1 = new EntityDress();
        entityDress1.setName("Printed Dress");
        entityDress1.setModel("demo_3");
        entityDress1.setSize("S");
        entityDress1.setColor("Orange");
        entityDress1.setPrice(26.00);

        EntityDress entityDress2 = new EntityDress();
        entityDress2.setName("Printed Dress");
        entityDress2.setModel("demo_3");
        entityDress2.setSize("S");
        entityDress2.setColor("Orange");
        entityDress2.setPrice(26.00);


        Object[][] testData = {
                {entityDress1, 2},
                {entityDress2, 2}
        };

        for (int i = 0; i < testData.length; i++) {
            cartTests.testAddDressToCart((EntityDress) testData[i][0], (int)testData[i][1]);
        }
    }
}
