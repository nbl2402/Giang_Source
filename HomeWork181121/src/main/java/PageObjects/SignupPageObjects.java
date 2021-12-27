package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPageObjects {
    private String firstNameTextBox = "//input[@id='firstName']";
    private String lastNameTextBox = "//input[@id='lastName']";
    private String emailAddressTextBox = "//input[@id='email']";
    private String monthComboBox = "//select[@id='birthMonth']";
    private String dayComboBox = "//select[@id='birthDay']";
    private String yearComboBox = "//select[@id='birthYear']";
    private String nextLocationButton = "//a[@aria-label='Next step - define your location']";

    private void InputFirstName(WebDriver webDriver, String firstName) {
        webDriver.findElement(By.xpath(firstNameTextBox)).sendKeys(firstName);
    }

    private void InputLastName(WebDriver webDriver, String lastName) {
        webDriver.findElement(By.xpath(lastNameTextBox)).sendKeys(lastName);
    }

    private void InputEmailAddress(WebDriver webDriver, String emailAddress) {
        webDriver.findElement(By.xpath(emailAddressTextBox)).sendKeys(emailAddress);
    }

    public void InputUserInfo(WebDriver webDriver, String firstName, String lastName, String emailAddress) {
        InputFirstName(webDriver, firstName);
        InputLastName(webDriver, lastName);
        InputEmailAddress(webDriver, emailAddress);
    }

    private void SelectMonth(WebDriver webDriver, String monthValue) {
        Select month = new Select(webDriver.findElement(By.xpath(monthComboBox)));
        month.selectByVisibleText(monthValue);
    }

    private void SelectDay(WebDriver webDriver, String dayValue) {
        Select day = new Select(webDriver.findElement(By.xpath(dayComboBox)));
        day.selectByVisibleText(dayValue);
    }

    private void SelectYear(WebDriver webDriver, String yearValue) {
        Select year = new Select(webDriver.findElement(By.xpath(yearComboBox)));
        year.selectByVisibleText(yearValue);
    }

    public void SelectBirthDay(WebDriver webDriver, String month, String day, String year) {
        SelectMonth(webDriver, month);
        SelectDay(webDriver, day);
        SelectYear(webDriver, year);

    }

    public void ClickNextLocationButton(WebDriver webDriver) {
        webDriver.findElement(By.xpath(nextLocationButton)).click();
    }
}
