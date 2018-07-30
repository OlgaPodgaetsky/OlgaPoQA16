package com.tr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupDeletionTest extends TestBase {
    @Test
    public void deletionLastGroupTest(){
        goToGroupsPage();
        if(!isGroupPresent()){
            createGroup();
        }
        int before = getGroupsCount();
        selectGroupByIndex(before-1); //last group
        groupDeletion();
        returnToGroupsPage();
        int after = getGroupsCount();

        Assert.assertEquals(after, before-1);
    }

    @Test
    public void delitionFirstGroupTest(){
        goToGroupsPage();
        if(!isGroupPresent()){
            createGroup();
        }
        int before = getGroupsCount();
        selectGroup();               //first group
        groupDeletion();
        returnToGroupsPage();
        int after = getGroupsCount();

        Assert.assertEquals(after, before-1);
    }
}
