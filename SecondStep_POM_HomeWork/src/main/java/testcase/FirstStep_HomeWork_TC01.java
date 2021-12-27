package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstStep_HomeWork_TC01 {
    WebDriver webDriver;
    String EMAIL = "long.nguyen@mailinator.com";
    String PASSWORD = "123123";

    @BeforeTest
    public void BeforeTest() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    public void Step1() {
        //Step1: Launch Chrome browser with URL https://utest.com
        webDriver.get("https://utest.com");
    }

    @Test(dependsOnMethods = {"Step1"})
    public void Step2() {
        //Step2: Click on "Log In" link
        String loginLink = "//a[@class='unauthenticated-nav-bar__link']";
        webDriver.findElement(By.xpath(loginLink)).click();
    }

    @Test(dependsOnMethods = {"Step2"})
    public void Step3() {
        //Step3: Input value into Email Address textbox
        String usernameTextBox = "//input[@id='username']";
        webDriver.findElement(By.xpath(usernameTextBox)).sendKeys(EMAIL);
    }

    @Test(dependsOnMethods = {"Step3"})
    public void Step4() {
        //Step4: Input value into Password textbox
        String passwordTextBox = "//input[@id='password']";
        webDriver.findElement(By.xpath(passwordTextBox)).sendKeys(PASSWORD);
    }

    @Test(dependsOnMethods = {"Step4"})
    public void Step5() {
        //Step5: Click on "Sign In" button
        String signInButton = "//button[@id='kc-login']";
        webDriver.findElement(By.xpath(signInButton)).click();
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
