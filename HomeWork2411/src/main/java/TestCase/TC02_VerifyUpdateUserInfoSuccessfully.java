package TestCase;

import org.testng.annotations.Test;

public class TC02_VerifyUpdateUserInfoSuccessfully extends TestcaseBase {
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
    public void Step04_UpdateUserInfo() {
        userInfoPageObjects.InputNameTextBox(webDriver, "anhonggggggg");
    }

    @Test(dependsOnMethods = {"Step04_UpdateUserInfo"})
    public void Step05_ClickUpdateButtonSuccessfully() {
        userInfoPageObjects.ClickUpdateButton(webDriver);
    }

    @Test(dependsOnMethods = {"Step05_ClickUpdateButtonSuccessfully"})
    public void Step06_ReloadPage() {
        userInfoPageObjects.ClickYourProfileLink(webDriver);
    }

    @Test(dependsOnMethods = {"Step06_ReloadPage"})
    public void Step07_VerifyUpdateUserInfoSuccessfully() {
        userInfoPageObjects.CompareNameAfterUpdated(webDriver, "anhonggggggg");
    }

}
