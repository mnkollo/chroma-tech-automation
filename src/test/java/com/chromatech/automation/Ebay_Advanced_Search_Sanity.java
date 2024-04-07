package com.chromatech.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; // Add import for Test annotation
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class Ebay_Advanced_Search_Sanity {
    WebDriver driver;{    // Add WebDriver driver; to the class level, Declare the driver

    }; 

    @BeforeClass
    public void setUpClass() {
        System.out.println("Before CLass Settings Done");
        System.out.println("Execution Starts: EBayHome_Sanity");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After Class Settngs Done");
        System.out.println("Execution Ends: EBayHome_Sanity");
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();        // Add this line to initialize the driver,
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void empty_advanced_search_test() throws InterruptedException {

        String expectedURL = "https://www.ebay.com/n/all-categories";
        String expectedTitle = "Shop by Category | eBay";
        WebElement searchButton = driver.findElement(By.xpath("(//*[@class='btn btn--primary'])[1]"));

        Assert.assertTrue(searchButton.isEnabled(), "-----Verify search buton enabled------");
        searchButton.click();
        Thread.sleep(2000);

        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println("The new URL is: " + newUrl);
        System.out.println("The new Title is: " + newTitle);

        Assert.assertEquals(newUrl, expectedURL, "Verify URL of the new page");
        Assert.assertEquals(newTitle, expectedTitle, "Verify Title of the new page");

    }

    
}
