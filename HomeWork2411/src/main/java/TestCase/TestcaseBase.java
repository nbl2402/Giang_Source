package TestCase;

import PageObjects.LoginPageObjects;
import PageObjects.UserInfoPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestcaseBase {
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    UserInfoPageObjects userInfoPageObjects = new UserInfoPageObjects();

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

    public void OpenUrl(String url) {
        webDriver.get(url);
    }

    public void Wait(int seconds) throws InterruptedException {//Tối kị dùng Wait cứng
        Thread.sleep(seconds*1000);
    }
}
