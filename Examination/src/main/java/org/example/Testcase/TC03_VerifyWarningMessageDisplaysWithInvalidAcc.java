package org.example.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_VerifyWarningMessageDisplaysWithInvalidAcc extends TestCaseBase {
    String EMAIL_VALUE = "Giang";
    String PASS_VALUE = "2108";

    @Test
    public void Step01_OpenBrowser() {
        webDriver.get("https://utest.com");
    }

    @Test(dependsOnMethods = {"Step01_OpenBrowser"})//@Test(priority=1)
    public void Step02_ClickLoginLink() {
        homePageObjects.ClickLoginBtn(webDriver);
    }

    @Test(dependsOnMethods = {"Step02_ClickLoginLink"})
    public void Step03_InputEmail() {
        loginPageObjects.InputEmail(webDriver, EMAIL_VALUE);
    }

    @Test(dependsOnMethods = {"Step03_InputEmail"})
    public void Step04_InputPass() {
        loginPageObjects.InputPass(webDriver, PASS_VALUE);
    }

    @Test(dependsOnMethods = {"Step04_InputPass"})
    public void Step05_ClickSignInBtn() {
        loginPageObjects.ClickSignInBtn(webDriver);
    }

    @Test(dependsOnMethods = {"Step05_ClickSignInBtn"})
    public void Step06_VerifyWarningMsg() {
        loginPageObjects.VerifyWarningMsg(webDriver);
    }
}