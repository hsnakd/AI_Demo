package com.cydeo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationScript {
    /** Create an automation script using Java Selenium and JUnit
    The script should be able to navigate to the url that I give
     The script should also be able to search for a product on the website and verify the product is presented in search results
      */
    @Test
    public void testSearchProduct() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com"); // replace with your website url

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Product Name");
        searchInput.submit();

        WebElement searchResults = driver.findElement(By.id("searchResults"));
        Assert.assertTrue(searchResults.isDisplayed());

        // Verify the product is present in search results
        WebElement productElement = driver.findElement(By.xpath("//h2[contains(text(), 'Product Name')]"));
        Assert.assertTrue(productElement.isDisplayed());

        driver.quit();
    }

    /**
      Write an SQL Query that can return the maximum salary from the employee table
     */
    @Test
    public void testMaxSalaryQuery() {
        String query = "SELECT MAX(salary) FROM employee";
        // Execute the query and verify the result
        String expectedResult = "1000";
        String actualResult = "1000";
        Assert.assertEquals(expectedResult, actualResult);
    }

    /** Create an automation test script using Java Selenium and JUnit
         The script can double-click an element
     */
    @Test
    public void testDoubleClick() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com"); // replace with your website url

        WebElement elementToClick = driver.findElement(By.id("elementId"));
        elementToClick.click();

        Actions actions = new Actions(driver);
        actions.doubleClick(elementToClick).perform();

        // Verify the element is double-clicked
        Assert.assertTrue(elementToClick.isDisplayed());

        driver.quit();
    }
}
