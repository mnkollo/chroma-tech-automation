package com.chromatech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetCurrentUrl {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        String actualTitle = driver.getTitle();
        System.out.println("Title of page is: " + actualTitle);


        String actualURL = driver.getCurrentUrl();
        System.out.println("URL of page is: " + actualURL);
    }
}
