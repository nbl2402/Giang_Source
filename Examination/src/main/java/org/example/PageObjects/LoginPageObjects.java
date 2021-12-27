package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageObjects {
    private String inputEmail = "//input[@id='username']"; //nên đặt tên biến là emailAddressTextBox
    private String inputPass = "//input[@id='password']";
    private String signInBtn = "//button[@id='kc-login']";
    private String msg = "//span[@class='kc-feedback-text']";
    private String expectedWarningMsg = "Invalid username or password.";
    private String getExpectedWarningMsg1 = "giangmeomeo";

//    private String emailValue = "tranthithugiang@gmail.com";
//    private String passValue = "123456";

//InputEmailAddress
    public void InputEmail(WebDriver webDriver, String emailValue) {
        webDriver.findElement(By.xpath(inputEmail)).sendKeys(emailValue);
    }

    public void InputEmail(WebDriver webDriver) {
    }

    public void InputPass(WebDriver webDriver, String passValue) {
        webDriver.findElement(By.xpath(inputPass)).sendKeys(passValue);
    }

    public void InputPass(WebDriver webDriver) {

    }

    public void ClickSignInBtn(WebDriver webDriver) {
        webDriver.findElement(By.xpath(signInBtn)).click();
    }

    public void VerifyWarningMsg(WebDriver webDriver){
        String contentMsg = webDriver.findElement(By.xpath(msg)).getText();
        Assert.assertEquals(contentMsg, "Invalid username or password.");
    }

    public void VerifyWarningMsg(WebDriver webDriver, String expectedWarningMsg){
        String contentMsg = webDriver.findElement(By.xpath(msg)).getText();
        Assert.assertEquals(contentMsg, expectedWarningMsg);
    }
}
