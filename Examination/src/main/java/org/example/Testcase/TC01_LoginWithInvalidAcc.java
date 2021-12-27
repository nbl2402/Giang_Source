package org.example.Testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.PageObjects.HomePageObjects;
import org.example.PageObjects.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TC01_LoginWithInvalidAcc {
    WebDriver webDriver;
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    HomePageObjects homePageObjects = new HomePageObjects();

    @Test
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        homePageObjects.LaunchBrowser(webDriver);
    }

    @Test(dependsOnMethods = {"OpenBrowser"})
    public void ClickLoginLink() {
        homePageObjects.ClickLoginBtn(webDriver);
    }

    @Test(dependsOnMethods = {"ClickLoginLink"})
    public void InputEmail() {
        loginPageObjects.InputEmail(webDriver);
    }

    @Test(dependsOnMethods = {"InputEmail"})
    public void InputPass() {
        loginPageObjects.InputPass(webDriver);
    }

    @Test(dependsOnMethods = {"InputPass"})
    public void ClickSignInBtn(){
        loginPageObjects.ClickSignInBtn(webDriver);
    }

    @Test(dependsOnMethods = {"ClickSignInBtn"})
    public void VerifyWarningMsg(){
        String msg = "//span[@class='kc-feedback-text']";
        String ContentMsg = webDriver.findElement(By.xpath(msg)).getText();
        Assert.assertEquals(ContentMsg, "Invalid username or password.");
        webDriver.quit();
    }
}
