package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddAddressPageObjects {
    private String addAddressPage = "//span[text()='Add your address']";
    private String expectedText = "Add your address";

    public void AddAddressPage(WebDriver webDriver) {
        String addAddressText = webDriver.findElement(By.xpath(addAddressPage)).getText();
        Assert.assertEquals(addAddressText, expectedText);
    }
}
