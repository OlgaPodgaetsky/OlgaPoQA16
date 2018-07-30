package com.tr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        goToGroupsPage();
        if(!isGroupPresent()){
            createGroup();
        }
        int before = getGroupsCount();
        selectGroup();
        initGroupModification();
        fillGroupForm(new GroupData()
                .setGroupFooter("modifyedTestGroupFooter1")
                .setGroupHeader("modifyedTestGroupHeader1")
                .setGroupName("modifyedTestGroupName1"));
        confirmGroupModification();
        returnToGroupsPage();
        int after = getGroupsCount();

        Assert.assertEquals(after, before);

    }

}
