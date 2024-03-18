package com.chromatech.automation;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Hard_Assertions {

    @Test
    public  void hardAssert (){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Chroma Tech Academy";
        
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Verify Page Title");

        driver.quit();

    }
    
}
