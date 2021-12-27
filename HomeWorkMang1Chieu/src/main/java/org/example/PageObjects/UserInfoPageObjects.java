package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserInfoPageObjects {
    private String nameTextBox = "//input[@name = 'urname']";
    private String creditCardNumberTextBox = "//input[@name = 'ucc']";
    private String emailTextBox = "//input[@name = 'uemail']";
    private String phoneTextBox = "//input[@name = 'uphone']";
    private String addressTextBox = "//textarea[@name = 'uaddress']";
    private String updateButton = "//input[@name = 'update']";

    private void ClickButtonUpdate(WebDriver webDriver) {
        webDriver.findElement(By.xpath(updateButton)).click();
    }

    public void InputUpdatedName(WebDriver webDriver, String name) {
        WebElement element = webDriver.findElement(By.xpath(nameTextBox));
        element.clear();
        element.sendKeys(name);
    }

    private void InputUpdatedCardNumber(WebDriver webDriver, String cardNuber) {
        WebElement element = webDriver.findElement(By.xpath(creditCardNumberTextBox));
        element.clear();
        element.sendKeys(cardNuber);
    }

    private void InputUpdatedEmail(WebDriver webDriver, String email) {
        WebElement element = webDriver.findElement(By.xpath(emailTextBox));
        element.clear();
        element.sendKeys(email);
    }

    private void InputUpdatedPhone(WebDriver webDriver, String phone) {
        WebElement element = webDriver.findElement(By.xpath(phoneTextBox));
        element.clear();
        element.sendKeys(phone);
    }

    private void InputUpdatedAddress(WebDriver webDriver, String address) {
        WebElement element = webDriver.findElement(By.xpath(addressTextBox));
        element.clear();
        element.sendKeys(address);
    }

    public void InputUpdatedUserInfo(WebDriver webDriver, String[] userInfo) {
        InputUpdatedName(webDriver, userInfo[0]);
        InputUpdatedCardNumber(webDriver, userInfo[1]);
        InputUpdatedEmail(webDriver, userInfo[2]);
        InputUpdatedPhone(webDriver, userInfo[3]);
        InputUpdatedAddress(webDriver, userInfo[4]);
        ClickButtonUpdate(webDriver);
    }

    private String GetName(WebDriver webDriver) {
        String returnedName = webDriver.findElement(By.xpath(nameTextBox)).getAttribute("value");
        return returnedName;
    }

    private String GetCreditCard(WebDriver webDriver) {
        String returnedCreditCard = webDriver.findElement(By.xpath(creditCardNumberTextBox)).getAttribute("value");
        return returnedCreditCard;
    }

    private String GetEmail(WebDriver webDriver) {
        String returnedEmail = webDriver.findElement(By.xpath(emailTextBox)).getAttribute("value");
        return returnedEmail;
    }

    private String GetPhoneNumber(WebDriver webDriver) {
        String returnedPhoneNumber = webDriver.findElement(By.xpath(phoneTextBox)).getAttribute("value");
        return returnedPhoneNumber;
    }

    private String GetAddress(WebDriver webDriver) {
        String returnedAddress = webDriver.findElement(By.xpath(addressTextBox)).getAttribute("value");
        return returnedAddress;
    }

    public String[] GetUserInfo(WebDriver webDriver) {
        String[] getUserInfo = new String[5];
        getUserInfo[0] = GetName(webDriver);
        getUserInfo[1] = GetCreditCard(webDriver);
        getUserInfo[2] = GetEmail(webDriver);
        getUserInfo[3] = GetPhoneNumber(webDriver);
        getUserInfo[4] = GetAddress(webDriver);

        return getUserInfo;
    }

    public void VerifyUpdateUserInfoSuccessfully(WebDriver webDriver, String[] expectedUserInfo) {
        GetUserInfo(webDriver);
        String[] actualUserInfo = GetUserInfo(webDriver);
        Assert.assertEquals(expectedUserInfo, actualUserInfo );
    }
}
