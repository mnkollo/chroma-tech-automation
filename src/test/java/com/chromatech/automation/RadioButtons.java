package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); 

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // by cssSelector
        //driver.findElement(By.cssSelector("[value=\"radio1\"]")).click();

        // by xpath
        driver.findElement(By.xpath("//input[@name='radioButton']")).click();

        // index
        //driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();

    }
    
}
