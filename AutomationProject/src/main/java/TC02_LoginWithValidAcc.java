import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC02_LoginWithValidAcc {
    @Test
    public void TC02_LoginWithValidAcc () {
        //Step1: Launch Chrome browser with URL https://utest.com
        //Step2: Click on "Log In" link
        //Step3: Input "andrew.utest@mailinator.com" into Email Address textbox
        //Step4: Input "NightFury_2402" into Password textbox
        //Step5: Click on "Sign In" button

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String loginBtn = "//div[contains(@class,'navbar-right')]//a[@href='/login?return_to=']";
        String inputEmail = "//input[@id='username']";
        String inputPass = "//input[@id='password']";
        String signinBtn = "//button[@id='kc-login']";

        webDriver.get("https://utest.com");
        webDriver.findElement(By.xpath(loginBtn)).click();
        webDriver.findElement(By.xpath(inputEmail)).sendKeys("andrew.utest@mailinator.com");
        webDriver.findElement(By.xpath(inputPass)).sendKeys("NightFury_2402");
        webDriver.findElement(By.xpath(signinBtn)).click();
        webDriver.quit();


    }
}

