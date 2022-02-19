package com.login_module;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public class LoginWithFacebook {
    public AndroidDriver driver;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='facebook_icon']")
    private AndroidElement facebookSignInBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    private AndroidElement email;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
    private AndroidElement password;

    @AndroidFindBy(xpath = "//*[contains(@text,'Log In')]")
    private AndroidElement click_LogIn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    private AndroidElement click_Continue;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='otp_field']")
    private AndroidElement enterOtp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='skip_button']")
    private AndroidElement skip;

    public LoginWithFacebook(AndroidDriver ldriver) {

        this.driver = ldriver;
        PageFactory.initElements(new AppiumFieldDecorator(ldriver), this);
    }


    public void facebookLogin() throws InterruptedException {
        Thread.sleep(1000);
        facebookSignInBtn.click();
        try {
            if (email.isDisplayed()) {
                email.sendKeys("applicationtest484@gmail.com");
                password.sendKeys("User@123");
                click_LogIn.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("user already logged in");
        }
        Thread.sleep(1000);
        click_Continue.click();
    }
}
