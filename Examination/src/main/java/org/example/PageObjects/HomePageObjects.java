package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
    //    String browser = "https://utest.com";
    private String joinTodayBtn = "//a[@ui-sref='signup.personal']";
    private String loginBtn = "//div[contains(@class,'navbar-right')]//a[@href='/login?return_to=']";


    //    public void LaunchBrowser(WebDriver webDriver){webDriver.get(browser);}
    public void ClickJoinTodayBtn(WebDriver webDriver) {
        webDriver.findElement(By.xpath(joinTodayBtn)).click();
    }

    public void ClickLoginBtn(WebDriver webDriver) {
        webDriver.findElement(By.xpath(loginBtn)).click();
    }


}
