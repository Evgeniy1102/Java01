package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreationTests() {
        app.getNavigationHelper().gotoGroupPage();
<<<<<<< HEAD
        app.getGroupHelper().createGroup(new GroupData("test123", null, null));
=======
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test123", "123", "123"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
>>>>>>> parent of 49406e4... Значения по умолчанию
    }

}
