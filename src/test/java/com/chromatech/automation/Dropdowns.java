package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); 

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        //Initialize the dropdown with WebElement
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        //Creating object of select class and passing the dropdown as an argument to Select() Constructor
       Select select = new Select(dropdown);

        //Selecting the value from dropdown using visible text
        select.selectByVisibleText("Option1");

        //Selecting the value from dropdown using index
        select.selectByIndex(2);

        //Selecting the value from dropdown using value attribute
        select.selectByValue("option3");
    }
    
}
