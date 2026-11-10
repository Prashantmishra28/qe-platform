package com.qe.platform.tests;

import com.qe.platform.base.BaseTest;
import com.qe.platform.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ParallelDriverTest extends BaseTest {
    private static final Map<Integer, String> driverToThread = new ConcurrentHashMap<>();

    private void checkIsolation() {
        WebDriver driver = DriverManager.getDriver();
        Assert.assertNotNull(driver, "No driver for this thread");   // catches the null case

        int id = System.identityHashCode(driver);
        String thread = Thread.currentThread().getName();
        String previous = driverToThread.putIfAbsent(id, thread);
        if (previous != null && !previous.equals(thread)) {
            Assert.fail("Driver instance " + id + " is being used by multiple threads: " + previous + " and " + thread);
        }
    }

    @Test
    public void test01() {
        checkIsolation();
        System.out.println("test01 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test02() {
        checkIsolation();
        System.out.println("test02 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test03() {
        checkIsolation();
        System.out.println("test03 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test04() {
        checkIsolation();
        System.out.println("test04 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test05() {
        checkIsolation();
        System.out.println("test05 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test06() {
        checkIsolation();
        System.out.println("test06 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test07() {
        checkIsolation();
        System.out.println("test07 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test08() {
        checkIsolation();
        System.out.println("test08 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test09() {
        checkIsolation();
        System.out.println("test09 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
    @Test
    public void test10() {
        checkIsolation();
        System.out.println("test10 | thread=" + Thread.currentThread().getName()
                + " | driver=" + System.identityHashCode(DriverManager.getDriver()));
    }
}
