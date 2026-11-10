package com.qe.platform.tests;

import com.qe.platform.base.BaseTest;
import com.qe.platform.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstDriverTest extends BaseTest {
    @Test
    public void pageTitleIsCorrect() {
        WebDriver driver = DriverManager.getDriver();

        driver.get("https://career-ops.org/");
        String expectedTitle = "Open-source AI job search agent on GitHub · career-ops";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle, "Page title is incorrect");
    }
}
