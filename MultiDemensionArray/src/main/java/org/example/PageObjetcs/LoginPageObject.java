package org.example.PageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject {
    private String userNameTextBox = "//input[@name='uname']";
    private String passwordTextBox = "//input[@name='pass']";
    private String loginButton = "//input[@value='login']";

    private void InputUserName(WebDriver webDriver, String userName) {
        webDriver.findElement(By.xpath(userNameTextBox)).sendKeys(userName);
    }

    private void InputPassWord(WebDriver webDriver, String passWord) {
        webDriver.findElement(By.xpath(passwordTextBox)).sendKeys(passWord);
    }

    private void ClickLoginButton(WebDriver webDriver) {
        webDriver.findElement(By.xpath(loginButton)).click();
    }

    public void Login(WebDriver webDriver, String userName, String passWord) {
        InputUserName(webDriver, userName);
        InputPassWord(webDriver, passWord);
        ClickLoginButton(webDriver);
    }
}
