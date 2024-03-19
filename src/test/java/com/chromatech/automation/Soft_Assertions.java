package com.chromatech.automation;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {

    @Test
    public void hardAssert() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech School";

        String actualPageURL = driver.getCurrentUrl();
        String expectedPageURL = "https://chroma-tech-academy.mexil.it/static_page/something";

        WebElement actualInstructorJohnText = driver.findElement(By.xpath("(//*[contains(text(),'John')])[1]"));
        String expectedInstructorJohnText = "John";

        //Step 1: Create an object of the SoftAssert class
        SoftAssert softAssert = new SoftAssert(); // create an object of the SoftAssert class

        //Step 2: Use the object to call the assert methods

        //Verifying page title
        softAssert.assertEquals(actualPageTitle, expectedPageTitle, "-- VERIFY PAGE TITLE --");

        //Verifying URL
        softAssert.assertEquals(actualPageURL, expectedPageURL, "-- VERIFY PAGE URL --");

        //Verifying Instructor John text
        softAssert.assertEquals(actualInstructorJohnText.getText(), expectedInstructorJohnText, "-- VERIFY INSTRUCTOR JOHN TEXT --");

        softAssert.assertTrue(actualInstructorJohnText.getText().contains(expectedInstructorJohnText), "-- VERIFY INSTRUCTOR JOHN TEXT --");


        
        softAssert.assertAll(); // call the assertAll() method to mark the test as failed if any of the assertions fail

        driver.quit();  
    }
}
