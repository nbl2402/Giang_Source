package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePageObject;
import pageObject.SignInPageObject;

import java.util.concurrent.TimeUnit;

public class TC01 {
    WebDriver webDriver;
    String EMAIL = "tranthithugiang.hubt@gmail.com";
    String PASSWORD = "123456";

    @BeforeTest
    public void BeforeTest() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Step1() {
        //Step1: Launch Chrome browser with URL https://utest.com
        webDriver.get("https://utest.com");
    }

    @Test(dependsOnMethods = {"Step1"})
    public void Step2() {
        //Step2: Click on "Log In" link
        webDriver.findElement(HomePageObject.btnLogin).click();
    }

    @Test(dependsOnMethods = {"Step2"})
    public void Step3() {
        //Step3: Input value into Email Address textbox
        webDriver.findElement(SignInPageObject.inputEmail).sendKeys(EMAIL);
    }

    @Test(dependsOnMethods = {"Step3"})
    public void Step4() {
        //Step4: Input value into Password textbox
        webDriver.findElement(SignInPageObject.inputPass).sendKeys(PASSWORD);
    }

    @Test(dependsOnMethods = {"Step4"})
    public void Step5() {
        //Step5: Click on "Sign In" button
        webDriver.findElement(SignInPageObject.signInBtn).click();
    }

    @Test(dependsOnMethods = {"Step5"})
    public void Step6() {
        //VP: Verify error warning displays correctly
        String errorMessage = "//span[@class='kc-feedback-text']";
    }

    @AfterTest
    public void AfterTest() {
        webDriver.close();
        webDriver.quit();
    }
}
