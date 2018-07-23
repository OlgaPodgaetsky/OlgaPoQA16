package com.tr;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        goToGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupsForm(new GroupData()
                .withHeader("")
                .withFooter("")
                .withName(""));
        submitGroupModification();
        returnToTheGroupsPage();


    }

}
