package com.login_module;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public class LoginWithGoogle {

    public AndroidDriver driver;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='google_icon']")
    private AndroidElement googleSignInBtn;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='3']")
    private AndroidElement addEmail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    private AndroidElement email;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private AndroidElement Emailnext;

    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    private AndroidElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private AndroidElement passnext;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Test application']")
    private AndroidElement selectEmail;


    public LoginWithGoogle(AndroidDriver ldriver) {

        this.driver = ldriver;
        PageFactory.initElements(new AppiumFieldDecorator(ldriver), this);
    }


    public void googleLogin() throws InterruptedException {
        Thread.sleep(1000);
        googleSignInBtn.click();
        try {
            if (selectEmail.isDisplayed()) {
                selectEmail.click();
            } else {
                addEmail.click();
                email.sendKeys("applicationtest484");
                Emailnext.click();
                password.sendKeys("P@ssw0rd1@2");
                passnext.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("user already added");
        }
    }

}
