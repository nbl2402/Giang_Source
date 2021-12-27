package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_InputUserInfoName extends TestCaseBase {
    @DataProvider()
    public Object[] dbName() {
        Object[] userInfoName = new String[] {"Giang", "Long"};
        return userInfoName;
    }

    @Test()
    public void Step01_OpenUrl() {
        OpenUrl(url);
    }

    @Test(dependsOnMethods = {"Step01_OpenUrl"})
    public void Step02_Login() {
        loginPageObjects.Login(webDriver, "test", "test");
    }

    @Test(dependsOnMethods = {"Step02_Login"}, dataProvider = "dbName")
    public void Step03_InputUserInfoName(String name) {
        userInfoPageObjects.InputUpdatedName(webDriver, name);
    }


}
