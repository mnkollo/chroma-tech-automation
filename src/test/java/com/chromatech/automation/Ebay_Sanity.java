package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; // Add import for Test annotation
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
        driver.findElement(By.cssSelector("[id='gh-btn']")).click();

        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();

        System.out.println("The new URL is: " + newUrl);
        System.out.println("The new Title is: " + newTitle);

        Assert.assertEquals(newUrl,expectedURL, "Verify URL of the new page");
        Assert.assertEquals(newTitle,expectedTitle, "Verify Title of the new page");
        driver.quit();
    }
}
