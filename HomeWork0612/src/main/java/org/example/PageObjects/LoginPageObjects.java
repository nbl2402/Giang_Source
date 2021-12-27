package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {
    private String usernameTextBox = "//input[@name = 'uname']";
    private String passwordTextBox = "//input[@name = 'pass']";
    private String logInButton = "//input[@value='login']";

    private void InputUserName(WebDriver webDriver, String userName) {
        webDriver.findElement(By.xpath(usernameTextBox)).sendKeys(userName);
    }

    private void InputPassWord(WebDriver webDriver, String passWord) {
        webDriver.findElement(By.xpath(passwordTextBox)).sendKeys(passWord);
    }

    public void ClickLoginButton(WebDriver webDriver) {
        webDriver.findElement(By.xpath(logInButton)).click();
    }

    public void Login(WebDriver webDriver, String userName, String passWord) {
        InputUserName(webDriver, userName);
        InputPassWord(webDriver, passWord);
        ClickLoginButton(webDriver);
    }
}
