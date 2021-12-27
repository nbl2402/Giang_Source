package TestCase;

import PageObjects.AddAddressPageObjects;
import PageObjects.HomePageObjects;
import PageObjects.SignupPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestCaseBase {
    AddAddressPageObjects addAddressPageObjects = new AddAddressPageObjects();
    HomePageObjects homePageObjects = new HomePageObjects();
    SignupPageObjects signupPageObjects = new SignupPageObjects();

    WebDriver webDriver;

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

    public void Wait() throws InterruptedException {
        Thread.sleep(10000);
    }
}
