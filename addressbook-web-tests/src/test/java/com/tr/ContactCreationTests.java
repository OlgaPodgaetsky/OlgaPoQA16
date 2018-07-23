package com.tr;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm(new ContactData("hkhk", "sadsad", ""));
        createContact();

    }


}
