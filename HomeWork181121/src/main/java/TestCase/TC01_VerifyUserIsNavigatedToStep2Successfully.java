package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC01_VerifyUserIsNavigatedToStep2Successfully extends TestCaseBase {
    String FIRST_NAME = "Alex";
    String LAST_NAME = "Ho";
    String EMAIL_ADDRESS = "htqa@yobmail.com";
    String YEAR = "1993";
    String DAY = "21";
    String MONTH = "August";

    @Test
    public void Step01_OpenUrl() {
        webDriver.get("https://utest.com");
    }

    @Test(dependsOnMethods = {"Step01_OpenUrl"})
    public void Step02_ClickJoinTodayButton() {
        homePageObjects.ClickJoinTodayButton(webDriver);
    }

    @Test(dependsOnMethods = {"Step02_ClickJoinTodayButton"})
    public void Step03_InputUserInfo() {
        signupPageObjects.InputUserInfo(webDriver, FIRST_NAME, LAST_NAME, EMAIL_ADDRESS);
    }

    @Test(dependsOnMethods = {"Step03_InputUserInfo"})
    public void Step04_SelectBirthDay() throws InterruptedException {
        signupPageObjects.SelectBirthDay(webDriver, MONTH, DAY, YEAR);
        Wait();
    }

    @Test(dependsOnMethods = {"Step04_SelectBirthDay"})
    public void Step05_ClickNextLocationButton() throws InterruptedException {
        signupPageObjects.ClickNextLocationButton(webDriver);
        Wait();
    }

    @Test(dependsOnMethods = {"Step05_ClickNextLocationButton"})
    public void Step06_VerifyNavigatedToStep2Successfully() throws InterruptedException {
        addAddressPageObjects.AddAddressPage(webDriver);
        Wait();
    }
}
