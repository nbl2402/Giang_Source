package org.example.examination;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.concurrent.TimeUnit;

public class TC01_VerifyUserRedirectToStep2Page {
    @Test
    public void TC01_VerifyUserRedirectToStep2Page() throws InterruptedException {
        String btnJoinToday = "//div[contains(@class,'navbar-right')]//a[@ui-sref='signup.personal']";
        String inputFirstname = "//input[@id='firstName']";
        String inputLastname = "//input[@id='lastName']";
        String inputEmail = "//input[@id='email']";
        String cbMonth = "//select[@id='birthMonth']";
        String cbDay = "//select[@id='birthDay']";
        String cbYear = "//select[@id='birthYear']";
        String btnNextLocation = "//a[@aria-label='Next step - define your location']";
        String firstName = "Giang";
        String lastName = "Tran";
        String email = "tranthithugiang.hubt@gmail.com";

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        webDriver.get("https://utest.com");
        webDriver.findElement(By.xpath(btnJoinToday)).click();
        webDriver.findElement(By.xpath(inputFirstname)).sendKeys(firstName);
        webDriver.findElement(By.xpath(inputLastname)).sendKeys(lastName);
        webDriver.findElement(By.xpath(inputEmail)).sendKeys(email);
        Select month = new Select(webDriver.findElement(By.xpath(cbMonth)));
        month.selectByVisibleText("August");
        Select day = new Select(webDriver.findElement(By.xpath(cbDay)));
        day.selectByVisibleText("21");
        Select year = new Select(webDriver.findElement(By.xpath(cbYear)));
        year.selectByVisibleText("1993");
//        Thread.sleep(1000);
        webDriver.findElement(By.xpath(btnNextLocation)).click();
        Thread.sleep(15000);
//        webDriver.quit();


    }

}
