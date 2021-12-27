package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserInfoPageObjects {
    private String logoutLink = "//a[@href = 'logout.php']";
    private String nameLabel = "//td[contains(text(),'Name')]";
    private String addressLabel = "//td[contains(text(),'Address')]";
    private String nameTextBox = "//input[@name = 'urname']";
    private String updateButton ="//input[@name = 'update']";
    private String yourProfileLink = "//a[contains(@href,'userinfo')]";


    public void VerifyUserInfoPage(WebDriver webDriver, String expectedText) {
        String name = webDriver.findElement(By.xpath(nameLabel)).getText();
        Assert.assertEquals(name, expectedText);
    }

    public void InputNameTextBox(WebDriver webDriver, String name) {
        webDriver.findElement(By.xpath(nameTextBox)).clear();
        webDriver.findElement(By.xpath(nameTextBox)).sendKeys(name);
    }

    public void ClickUpdateButton(WebDriver webDriver) {
        webDriver.findElement(By.xpath(updateButton)).click();
    }

    public void CompareNameAfterUpdated(WebDriver webDriver, String updatedName) {
        String name = webDriver.findElement(By.xpath(nameTextBox)).getAttribute("value");
        Assert.assertEquals(name, updatedName);
    }

    public void ClickYourProfileLink(WebDriver webDriver) {
        webDriver.findElement(By.xpath(yourProfileLink)).click();
    }
}
