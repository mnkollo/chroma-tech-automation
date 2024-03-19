package com.chromatech.automation;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; // Add import for Test annotation
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Ebay_Sanity {
   
    @Test
    public void empty_Search_test() throws InterruptedException{

        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        Thread.sleep(2000);
        String expectedURL = "https://www.ebay.com/n/all-categories?_from=R40&_trksid=p4432023.m570.l1313&_nkw=&_sacat=0";
        String expectedTitle = "Shop by Category | eBay";
        
        //Assert.assertTrue(driver.findElement(By.cssSelector("[id='gh-btn']")).isEnabled(),"Verify Search button is enabled");
        //Assert.assertFalse(driver.findElement(By.cssSelector("[id='gh-btn']")).isSelected(),"Verify Search button is not selected");

        Assert.assertNull(expectedTitle, "Verify Title of the page");
        Assert.assertNotNull(expectedURL, "Verify URL of the page");


        driver.findElement(By.cssSelector("[id='gh-btn']")).click();
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();

        System.out.println("The new URL is: " + newUrl);
        System.out.println("The new Title is: " + newTitle);

        Assert.assertEquals(newUrl,expectedURL, "Verify URL of the new page");
        Assert.assertEquals(newTitle,expectedTitle, "Verify Title of the new page");

        //Assert.assertNotEquals(newUrl, expectedURL);

        driver.quit();
    }

    @Test
    public void empty_Search_test_softassert() throws InterruptedException{

        SoftAssert sa = new SoftAssert();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        Thread.sleep(2000);
        String expectedURL = "https://www.ebay.com/n/all-categories?_from=R40&_trksid=p4432023.m570.l1313&_nkw=&_sacat=0";
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        
        sa.assertTrue(driver.findElement(By.cssSelector("[id='gh-btn']")).isEnabled(),"Verify Search button is enabled");

        
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println("The new URL is: " + newUrl);
        System.out.println("The new Title is: " + newTitle);

        //sa.assertEquals(newUrl," ", "Verify URL of the new page");
        sa.assertEquals(newTitle,expectedTitle, "Verify Title of the new page");

        WebElement searchTxtBox = driver.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input']"));
        searchTxtBox.sendKeys("Hello There");
        driver.findElement(By.cssSelector("[id='gh-btn']")).click();
        driver.quit();

        sa.assertAll();
    }
}
