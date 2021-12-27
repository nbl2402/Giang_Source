package org.example.Testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.PageObjects.HomePageObjects;
import org.example.PageObjects.LoginPageObjects;
import org.example.PageObjects.SignUpPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestCaseBase {
    HomePageObjects homePageObjects = new HomePageObjects();
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    SignUpPageObjects signUpPageObjects = new SignUpPageObjects();

    WebDriver webDriver;

    @BeforeTest
    public void Init() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown() {
        webDriver.quit();
    }

}
