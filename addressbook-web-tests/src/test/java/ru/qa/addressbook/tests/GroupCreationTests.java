package ru.qa.addressbook.tests;


import org.testng.annotations.Test;
import ru.qa.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage("groups");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test3", "test31", "test32"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().gotoGroupPage("group page");
        app.getGroupHelper().returnToGroupPage();
    }

}
