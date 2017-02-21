package ru.stqa.pft.adressbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreationTests() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test123", "123", "123"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
