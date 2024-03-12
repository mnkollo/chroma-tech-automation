package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);

        // Locating using id locator/method
        WebElement userNameTextBox = driver.findElement(By.id("form-username"));
        userNameTextBox.sendKeys("general@teacher.com");

        // Locating using name locator/method
        // WebElement passwordTextBox = driver.findElement(By.name("password"));
        // passwordTextBox.sendKeys("123456");

        // Locating using class name locator/method
        // WebElement passwordTextBox = driver.findElement(By.className("form-password"));                   // Compound class names are not allowed
        // passwordTextBox.sendKeys("123456");

        // Locating using tagName locator/method
        //driver.findElement(By.tagName("input")).sendKeys("123456");

        // Locating using linkText locator/method
        // driver.findElement(By.linkText("Forgot Password?")).click();                                      // must enter the entire text of the link

        // Locating using partialLinkText locator/method
        //(driver.findElement(By.partialLinkText("Forgot Pass"))).click();                     // you can enter a part of the text of the link, or entire text and it will work

        // Locating using cssSelector locator/method #attributeValueOfID
        // driver.findElement(By.cssSelector("#form-password")).sendKeys("123456");

        // Locating using cssSelector locator/method [attribute='value']
        // driver.findElement(By.cssSelector("[class='form-password form-control']")).sendKeys("123456");

        // // Locating using full/absolute xpath locator/method
        // driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("123456");                 //not recommended

        // Locating using relative xpath locator/method
        driver.findElement(By.xpath("//*[@class='form-password form-control']")).sendKeys("123456");

        // Locating using relative xpath Text locator/method
        driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();;

    }
}
