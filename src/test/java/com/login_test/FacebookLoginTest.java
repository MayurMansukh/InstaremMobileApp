package com.login_test;


import com.base.MobileAppBase;
import com.login_module.LoginWithFacebook;
import org.testng.annotations.Test;

public class FacebookLoginTest extends MobileAppBase {

    @Test
    public void loginTest() throws InterruptedException {
        LoginWithFacebook logIn = new LoginWithFacebook(driver);
        logIn.facebookLogin();
    }
}
