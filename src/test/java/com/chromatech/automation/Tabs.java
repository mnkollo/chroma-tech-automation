package com.chromatech.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

    public static void main(String args[]) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // print the name of the main window
        String mainWindowHandle = driver.getWindowHandle();
        // System.out.println("Main window handle: " + mainWindowHandle);


        WebElement openTabButton = driver.findElement(By.cssSelector("[id='opentab']"));
        openTabButton.click();

        // most effective way to switch to new tab
        Set<String> allWindows = driver.getWindowHandles();
        for (String nextWindow : allWindows) {
            driver.switchTo().window(nextWindow);
        }

        // Clicking on courses link
        WebElement coursesLink = driver.findElement(By.linkText("Purchase Courses"));
        coursesLink.click();

        //switching to the main window using the main window handle
        driver.switchTo().window(mainWindowHandle);

        //Clicking on bootstrap dropdown
        WebElement bootstrapDropdown = driver.findElement(By.cssSelector("[class='btn btn-sm dropdown-toggle btn-outline-dark']"));
        bootstrapDropdown.click();
    }

}
