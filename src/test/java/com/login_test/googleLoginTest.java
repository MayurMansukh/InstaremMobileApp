package com.login_test;


import com.base.MobileAppBase;
import com.login_module.LoginWithGoogle;
import org.testng.annotations.Test;

public class googleLoginTest extends MobileAppBase {

    @Test
    public void loginTest() throws InterruptedException {
        LoginWithGoogle logIn = new LoginWithGoogle(driver);
        logIn.googleLogin();
    }
}
