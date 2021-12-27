package pageObject;

import org.openqa.selenium.By;

public class SignInPageObject {
    public static By inputEmail = By.xpath("//input[@id='username']");
    public static By inputPass = By.xpath("//input[@id='password']");
    public static By signInBtn = By.xpath("//button[@id='kc-login']");
}
