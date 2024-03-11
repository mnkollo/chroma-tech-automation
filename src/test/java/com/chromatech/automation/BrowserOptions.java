package com.chromatech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOptions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String url = "https://chroma.mexil.it/site/login";


        driver.manage().window().maximize();   // this is called method chaining, we expect 
        driver.manage().deleteAllCookies();   

        driver.get(url);
    } 
}
