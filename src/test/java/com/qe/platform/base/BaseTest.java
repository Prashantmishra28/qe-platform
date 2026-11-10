package com.qe.platform.base;

import com.qe.platform.driver.BrowserType;
import com.qe.platform.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        DriverManager.initializeDriver(BrowserType.CHROME);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
