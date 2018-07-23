package com.tr;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    @Test
    public void test1() {
        goToGroupsPage();
        selectGroup();
        groupDeletion();
        returnToTheGroupsPage();
    }
}
