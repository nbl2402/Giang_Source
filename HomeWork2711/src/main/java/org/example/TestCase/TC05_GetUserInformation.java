package org.example.TestCase;

import org.testng.annotations.Test;

public class TC05_GetUserInformation extends TestCaseBase {
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
    public void PrintArray() {
//        String[] i = new String[5];
//        String name = userInfoPageObjects.GetName(webDriver);
//        String creditCard =userInfoPageObjects.GetCreditCard(webDriver);
//        String email = userInfoPageObjects.GetEmail(webDriver);
//        String phoneNumber = userInfoPageObjects.GetPhoneNumber(webDriver);
//        String address = userInfoPageObjects.GetAddress(webDriver);

//        i[0] = name ;
//        i[1] = creditCard;
//        i[2] = email;
//        i[3] = phoneNumber;
//        i[4] = address;

//        for(int t=0; t < i.length; t++) {
//            System.out.println(i[t]);
//        }
        userInfoPageObjects.GetUserInfo(webDriver);
    }



}
