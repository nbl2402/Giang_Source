package org.example.Testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.PageObjects.HomePageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ClickJoinTodayBtn {
    WebDriver webDriver;
    HomePageObjects homePageObjects = new HomePageObjects();

    @Test
    public void Step01() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://utest.com");
    }

    @Test(dependsOnMethods = {"Step01"})
    public void Step02() {
        homePageObjects.ClickJoinTodayBtn(webDriver);
    }
}
