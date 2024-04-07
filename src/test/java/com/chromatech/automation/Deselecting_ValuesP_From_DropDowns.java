package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselecting_ValuesP_From_DropDowns {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); 

        String url = "https://mdbootstrap.com/docs/standard/extended/multiselect/";
        driver.get(url);

        //Initialize the dropdown with WebElement
        WebElement dropdown = driver.findElement(By.xpath("(//select)[1]"));

        //Creating object of select class and passing dropdown as an argumeent to select() constructor
        Select select = new Select(dropdown);

        // deselecting all the options  (only with multiselect dropdown that start with select tag name)
        select.deselectAll();

        // selecting option by visible text
        select.selectByVisibleText("Three");
        select.selectByVisibleText("Two");
        select.selectByVisibleText("Four");
        //Deselecting option by visible text
        // select.deselectByVisibleText("One");;
    }
}
