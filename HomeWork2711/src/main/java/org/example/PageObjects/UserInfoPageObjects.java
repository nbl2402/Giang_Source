package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInfoPageObjects {
    private String nameTextBox = "//input[@name = 'urname']";
    private String creditCardNumberTextBox = "//input[@name = 'ucc']";
    private String emailTextBox = "//input[@name = 'uemail']";
    private String phoneTextBox = "//input[@name = 'uphone']";
    private String addressTextBox = "//textarea[@name = 'uaddress']";

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

    public void GetUserInfo(WebDriver webDriver) {
        String[] userInfo = new String[5];
        userInfo[0] = GetName(webDriver);
        userInfo[1] = GetCreditCard(webDriver);
        userInfo[2] = GetEmail(webDriver);
        userInfo[3] = GetPhoneNumber(webDriver);
        userInfo[4] = GetAddress(webDriver);

        for(String info : userInfo) {
            System.out.println(info);
        }

    }

}
