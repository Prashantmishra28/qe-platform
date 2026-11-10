package com.qe.platform.driver;

import org.openqa.selenium.WebDriver;


public class DriverManager  {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static void initializeDriver(BrowserType type) {
        driverThreadLocal.set(DriverFactory.createDriver(type));
    }

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
        }
        driverThreadLocal.remove();
    }
//    private static WebDriver driver;
//
//    public static void initializeDriver(BrowserType type) { driver = DriverFactory.createDriver(type); }
//    public static WebDriver getDriver() { return driver; }
//    public static void quitDriver() { if (driver != null) driver.quit(); driver = null; }

}
