import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC03_SignUpNewAcc {
    @Test
    public void TC03_SignUpNewAccount() {
        //Step1: Launch Chrome browser with URL https://utest.com
        //Step2: CLick on "Join Today" button
        //Step3: Input value into First name textbox
        //Step4: Input value into Last name textbox
        //Step5: Input value into Email address textbox
        //Step6: Click on "Next: Location" button

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String joinTodayBtn = "//div[contains(@class,'navbar-right')]//a[@ui-sref='signup.personal']";
        String inputFistName = "//input[@id='firstName']";
        String inputLastName = "//input[@id='lastName']";
        String inputEmail = "//input[@id='email']";
        String nextLocationBtn = "//a[@aria-label='Next step - define your location']";

        webDriver.get("https://utest.com");
        webDriver.findElement(By.xpath(joinTodayBtn)).click();
        webDriver.findElement(By.xpath(inputFistName)).sendKeys("Giang");
        webDriver.findElement(By.xpath(inputLastName)).sendKeys("Tran");
        webDriver.findElement(By.xpath(inputEmail)).sendKeys("tranthithugiang.hubt@gmail.com");
        webDriver.findElement(By.xpath(nextLocationBtn)).click();
        webDriver.quit();


    }
}
