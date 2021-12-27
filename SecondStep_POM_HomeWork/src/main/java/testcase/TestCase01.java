//package testcase;
//
//public class TestCase01 {
//    @Test
//    public void TC01_LoginWithInvalidAccount() {
//        //Step1: Launch Chrome browser with URL https://utest.com
//        //Step2: Click on "Log In" link
//        //Step3: Input value into Email Address textbox
//        //Step4: Input value into Password textbox
//        //Step5: Click on "Sign In" button
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        String loginBtn = "//div[contains(@class,'navbar-right')]//a[@href='/login?return_to=']";
//        String inputEmail = "//input[@id='username']";
//        String inputPass = "//input[@id='password']";
//        String signInBtn = "//button[@id='kc-login']";
//        String msg = "//span[@class='kc-feedback-text']";
//
//
//        webDriver.get("https://utest.com");
//        webDriver.findElement(By.xpath(loginBtn)).click();
//        webDriver.findElement(By.xpath(inputEmail)).sendKeys("tranthithugiang.hubt@gmail.com");
//        webDriver.findElement(By.xpath(inputPass)).sendKeys("123456");
//        webDriver.findElement(By.xpath(signInBtn)).click();
//        webDriver.findElement(By.xpath(msg)).getText();
//        String ContentMsg = webDriver.findElement(By.xpath(msg)).getText();
//        Assert.assertEquals(ContentMsg, "Invalid username or password.");
//        webDriver.quit();
//    }
//
//
//}
//}
