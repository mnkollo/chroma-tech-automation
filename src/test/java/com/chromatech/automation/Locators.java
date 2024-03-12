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

        // Locating using id attribute
        WebElement userNameTextBox = driver.findElement(By.id("form-username"));
        userNameTextBox.sendKeys("general@teacher.com");

        // Locating using name attribute
        // WebElement passwordTextBox = driver.findElement(By.name("password"));
        // passwordTextBox.sendKeys("123456");

        // Locating using class name method
        WebElement passwordTextBox = driver.findElement(By.className("form-password"));
        passwordTextBox.sendKeys("123456");

    }
}
