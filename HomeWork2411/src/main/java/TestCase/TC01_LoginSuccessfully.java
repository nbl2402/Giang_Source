package TestCase;

import org.testng.annotations.Test;

public class TC01_LoginSuccessfully extends TestcaseBase {

    @Test
    public void Step01_OpenUrl() {
        OpenUrl(url);
    }

    @Test(dependsOnMethods = {"Step01_OpenUrl"})
    public void Step02_InputUserInfo() throws InterruptedException {
        loginPageObjects.InputUserInfo(webDriver, "test", "test");
    }

    @Test(dependsOnMethods = {"Step02_InputUserInfo"})
    public void Step03_ClickLoginButton() throws InterruptedException {
        loginPageObjects.ClickLoginButton(webDriver);

    }

    @Test(dependsOnMethods = {"Step03_ClickLoginButton"})
    public void Step04_VerifyNavigatedToUserInfoPage() throws InterruptedException {
        userInfoPageObjects.VerifyUserInfoPage(webDriver, "Name:");
    }

}
