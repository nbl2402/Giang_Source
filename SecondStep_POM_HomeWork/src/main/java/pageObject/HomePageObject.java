package pageObject;

import org.openqa.selenium.By;

public class HomePageObject {
    public static By btnLogin = By.xpath("//div[contains(@class,'navbar-right')]//a[@href='/login?return_to=']");

}
