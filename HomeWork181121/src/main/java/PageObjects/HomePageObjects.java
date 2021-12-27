package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
    private String joinTodayButton = "//a[@ui-sref='signup.personal']";

    public void ClickJoinTodayButton(WebDriver webDriver) {
        webDriver.findElement(By.xpath(joinTodayButton)).click();
    }
}
