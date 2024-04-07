package com.chromatech.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        WebElement alertTextBox = driver.findElement(By.cssSelector("[id='name']"));
        alertTextBox.sendKeys("Michael");

        WebElement alertButton = driver.findElement(By.cssSelector("fieldset [id='alertbtn']"));
        alertButton.click();
        Thread.sleep(2000);


        //clicking on button that opens alert with 'ok' button
        
        // Getting the text from the alert
        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println(alertText);  

        //alert.accept();  //Used to confirm a positive scenario  (so click on the ok button)
        alert.dismiss(); //Used to confirm a negative scenario (so click on the cancel button)

        driver.quit();
  }
    
}
