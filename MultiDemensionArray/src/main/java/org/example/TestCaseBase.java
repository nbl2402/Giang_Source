package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.PageObjetcs.LoginPageObject;
import org.example.PageObjetcs.UserInfoPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestCaseBase {
    LoginPageObject loginPageObject = new LoginPageObject();
    UserInfoPageObject userInfoPageObject = new UserInfoPageObject();

    WebDriver webDriver;
    String url = "http://testphp.vulnweb.com/login.php";

    @BeforeTest
    public void Init() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void TearDown() {
        webDriver.quit();
    }

    public void OpenUrl() {
        webDriver.get(url);
    }

}
