package org.automation.qa.Login;

import org.testng.annotations.Test;

public class LoginPage_HomeWork {

    @Test
    public void TC01_LoginWithInvalidAccount() {
        //Step1: Launch Chrome browser with URL https://utest.com
        //Step2: Click on "Log In" link
        //Step3: Input value into Email Address textbox
        //Step4: Input value into Password textbox
        //Step5: Click on "Sign In" button
    }

    @Test
    public void TC02_LoginWithValidAccount() {
        //Step1: Launch Chrome browser with URL https://utest.com
        //Step2: Click on "Log In" link
        //Step3: Input "andrew.utest@mailinator.com" into Email Address textbox
        //Step4: Input "NightFury_2402" into Password textbox
        //Step5: Click on "Sign In" button

    }

    @Test
    public void TC03_SignUpNewAccount() {
        //Step1: Launch Chrome browser with URL https://utest.com
        //Step2: CLick on "Join Today" button
        //Step3: Input value into First name textbox
        //Step4: Input value into Last name textbox
        //Step5: Input value into Email address textbox
        //Step6: Click on "Next: Location" button
    }
}
