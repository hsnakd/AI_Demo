package com.cydeo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation{
    /**
     * Crete an automation script by using Java Selenium and JUnit that can navigate to the Amazon website and search for Iphone and verify that iPhone is displayed and add comment and explaining
     */
    @Test
    public void testSearchIphone() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Verify iPhone is displayed
        Assert.assertTrue(driver.getPageSource().contains("Iphone"));

        // Add a comment explaining the test case
        System.out.println("Test case: Verify iPhone is displayed in the search results");

        // Close the browser
        driver.quit();
    }

}
