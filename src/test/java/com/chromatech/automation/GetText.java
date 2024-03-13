package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        WebElement signInButtonText = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));

        String btnText = signInButtonText.getText();
        System.out.println("Text of button is: " + btnText);

        WebElement forgotPasswordButtonText = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));

        String forgotPasswordLink = forgotPasswordButtonText.getText();
        System.out.println("Text of button is: " + forgotPasswordLink) ;


    }
    
}
