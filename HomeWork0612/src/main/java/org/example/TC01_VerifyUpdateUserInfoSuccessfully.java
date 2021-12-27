package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TC01_VerifyUpdateUserInfoSuccessfully extends TestCaseBase {
    String[] USER_INFO = new String[]{"day là ten moi", "123456", "test@gmail.com", "+841234567", "HaNoi"};

    @Test
    public void Step01_OpenUrl() {
        OpenUrl(url);
    }

    @Test(dependsOnMethods = {"Step01_OpenUrl"})
    public void Step02_Login() throws InterruptedException {
        loginPageObjects.Login(webDriver, "test", "test");
    }

    @Test(dependsOnMethods = {"Step02_Login"})
    public void Step03_UpdateNameSuccessfully() {
        userInfoPageObjects.InputUpdatedUserInfo(webDriver, USER_INFO);
    }

    @Test(dependsOnMethods = {"Step03_UpdateNameSuccessfully"})
    public void Step04_VerifyUpdateUserInfoSuccessfully() {
        userInfoPageObjects.VerifyUpdateUserInfoSuccessfully(webDriver, USER_INFO);
    }

    @Test(dependsOnMethods = {"Step04_VerifyUpdateUserInfoSuccessfully"})
    public void Step05_PrintUserInfo() {
        System.out.println("Name: " + USER_INFO[0]);
        System.out.println("Credit Card: " + USER_INFO[1]);
        System.out.println("Email: " + USER_INFO[2]);
        System.out.println("Phone: " + USER_INFO[3]);
        System.out.println("Address: " + USER_INFO[4]);
    }
}
