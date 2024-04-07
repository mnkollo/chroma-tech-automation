package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Additional_Select_Class_Methods {
    
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://mdbootstrap.com/docs/standard/extended/multiselect/";
        driver.get(url);

        //Initialize the dropdown with WebElement
        WebElement dropdown = driver.findElement(By.xpath("(//select)[1]"));

        //Creating object of select class and passing dropdown as an argumeent to select() constructor
        Select select = new Select(dropdown);

        // retrieving first selected option
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("First selected option is: " + firstSelectedOption.getText());

        //checking if the dropdown is a multi-select dropdown
        // boolean isMultiSelect = select.isMultiple();
        // System.out.println("Is the dropdown a multi-select dropdown? " + isMultiSelect);

        // getting all the options in the dropdown
        // List<WebElement> allOptions = select.getOptions();
        // for(WebElement option : allOptions) {
        //     System.out.println(option.getText());
        // }
    }
}
