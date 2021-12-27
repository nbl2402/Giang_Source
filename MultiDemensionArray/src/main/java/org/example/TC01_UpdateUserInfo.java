package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_UpdateUserInfo extends TestCaseBase {

    @DataProvider(name = "UserInfo")
    public Object[][] dbUserInfo() {
        Object[][] userInfo = new Object[][]{
                {"Long", "2402", "long.nguyen@mailinator.com", "123123", "HCM"},
                {"Giang", "2108", "giang.tran@mailinator.com", "456456", "HN"},
                {"QA", "1704", "qa.automation@mailinator.com", "123456", "VN"}
        };
        return userInfo;
    }

    @Test()
    public void Step01_OpenUrl() {
        OpenUrl();
    }

    @Test(dependsOnMethods = {"Step01_OpenUrl"})
    public void Step02_Login() {
        loginPageObject.Login(webDriver, "test", "test");
    }

    @Test(dataProvider = "UserInfo", dependsOnMethods = {"Step02_Login"})
    public void Step03_UpdateUserInfo(String name, String cardNumber, String email, String phone, String address) {
        userInfoPageObject.InputUserInfo(webDriver, name, cardNumber, email, phone, address);
        userInfoPageObject.VerifyUpdateUserInfoSuccessfully(webDriver, name, cardNumber, email, phone, address);
    }

}
