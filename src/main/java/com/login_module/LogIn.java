package com.login_module;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;


public class LogIn {

    public AndroidDriver driver;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='login_intro_button']")
    private AndroidElement signInBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='email']")
    private AndroidElement email;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='password']")
    private AndroidElement password;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='log_in_button']")
    private AndroidElement logInBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='otp_field']")
    private AndroidElement enterOtp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='skip_button']")
    private AndroidElement skip;

    public LogIn(AndroidDriver ldriver) {

        this.driver = ldriver;
        PageFactory.initElements(new AppiumFieldDecorator(ldriver), this);
    }


    public void login() throws InterruptedException {
        Thread.sleep(2000);
        email.sendKeys("rohit70@yopmail.com");
        password.sendKeys("User@123");
        logInBtn.click();
        Thread.sleep(5000);
        try {
            if (enterOtp.isDisplayed()) {
                Thread.sleep(2000);
                enterOtp.sendKeys("123456");
                Thread.sleep(5000);
            }
        } catch (NoSuchElementException e) {
            System.out.println("otp already submitted");
        }
        Thread.sleep(2000);
        skip.click();
    }
}