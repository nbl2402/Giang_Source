package Utest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testcase {
    @Test
    public void TC01_GotoLoginPage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String loginButton = "//div[contains(@class,'navbar-right')]//a[@href='/login?return_to=']";

        webDriver.get("https://utest.com/");
        webDriver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(3000);
        webDriver.quit();
   }
   @Test
    public void TC02_GotoWhyutest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

       String whyUtestBtn = "//a[(contains(@class,'routed-link') and @href='/why-utest')]";

       webDriver.get("https://utest.com/");
       webDriver.findElement(By.xpath(whyUtestBtn)).click();
       Thread.sleep(3000);
       webDriver.quit();
   }
}
