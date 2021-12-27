package org.example.Testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.PageObjects.HomePageObjects;
import org.example.PageObjects.SignUpPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC02_Signup {
    WebDriver webDriver;
    HomePageObjects homePageObjects = new HomePageObjects();
    SignUpPageObjects signUpPageObjects = new SignUpPageObjects();

    @Test
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        homePageObjects.LaunchBrowser(webDriver);
    }

    @Test(dependsOnMethods = {"OpenBrowser"})
    public void ClickJoinTodayBtn() {
        homePageObjects.ClickJoinTodayBtn(webDriver);
    }

    @Test(dependsOnMethods = {"ClickJoinTodayBtn"})
    public void InputFirstName(){
        signUpPageObjects.InputFirstName(webDriver);
    }

    @Test(dependsOnMethods = {"InputFirstName"})
    public void InputLastName(){
        signUpPageObjects.InputLastName(webDriver);
    }

    @Test(dependsOnMethods = {"InputLastName"})
    public void InputEmail(){
        signUpPageObjects.InputEmail(webDriver);
    }

    @Test(dependsOnMethods = {"InputEmail"})
    public void ClickNextLocationBtn(){
        signUpPageObjects.ClickNextLocationBtn(webDriver);
    }
}
