package com.chromatech.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_DropDown {

    public static void main (String args[]){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/#";
        driver.get(url);


         WebElement bootstrapDropdown = driver.findElement(By.cssSelector("button[class$='btn-outline-dark']"));
         bootstrapDropdown.click();

         //beginner way
        //  WebElement option1 = driver.findElement(By.xpath("(//label[@class='dropdown-item'])[1]"));
        //  option1.click();

        //intermediate way
        List<WebElement> dropDownOptions = driver.findElements(By.cssSelector("label[class='dropdown-item']"));   
                
        for (WebElement option : dropDownOptions){
            if (option.getText().equals("Option 3")){
                option.click();
                break;           //to break the loop after the option is found
            }
        }
    }
}
