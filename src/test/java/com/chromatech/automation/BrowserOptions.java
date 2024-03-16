package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOptions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String url = "https://chroma.mexil.it/site/login";


        driver.manage().window().maximize();   // this is called method chaining, we expect 
        driver.manage().deleteAllCookies();   

        driver.get(url);

        // Locating using id locator/method
        WebElement userNameTextBox = driver.findElement(By.id("form-username"));
        userNameTextBox.sendKeys("general@teacher.com");

        // Locating using relative xpath locator/method
        driver.findElement(By.xpath("//*[@class='form-password form-control']")).sendKeys("123456");

        
        WebElement bootstrapDropdown = driver.findElement(By.cssSelector("button[class$='btn-outline-dark']"));
        bootstrapDropdown.click();
    } 
}
