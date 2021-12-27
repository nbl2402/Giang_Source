package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageObjects {
    String inputFistName = "//input[@id='firstName']";
    String inputLastName = "//input[@id='lastName']";
    String inputEmail = "//input[@id='email']";
    String nextLocationBtn = "//a[@aria-label='Next step - define your location']";
    String firstName = "Giang";
    String lastName = "Tran";
    String email = "giangttt2@yobmail.com";

    public void InputFirstName(WebDriver webDriver) {
        webDriver.findElement(By.xpath(inputFistName)).sendKeys("");
    }

    public void InputLastName(WebDriver webDriver) {
        webDriver.findElement(By.xpath(inputLastName)).sendKeys("");
    }

    public void InputEmail(WebDriver webDriver) {
        webDriver.findElement(By.xpath(inputEmail)).sendKeys("");
    }

    public void ClickNextLocationBtn(WebDriver webDriver) {
        webDriver.findElement(By.xpath(nextLocationBtn)).click();
    }


}
