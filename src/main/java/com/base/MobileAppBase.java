package com.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class MobileAppBase {

    public static AndroidDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Redmi Note 7 Pro");
        caps.setCapability("udid", "a19a259a");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("appPackage", "com.consumermobileapp");
        caps.setCapability("appActivity", "com.consumermobileapp.MainActivity");
        caps.setCapability("automatorName","UiAutomator2");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1000);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
    }

}
