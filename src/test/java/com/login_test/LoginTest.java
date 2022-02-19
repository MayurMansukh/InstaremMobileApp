package com.login_test;

import com.base.MobileAppBase;
import com.login_module.LogIn;
import org.testng.annotations.Test;

public class LoginTest extends MobileAppBase {

    @Test
    public void loginTest() throws InterruptedException {
        LogIn logIn = new LogIn(driver);
        logIn.login();
    }
}
