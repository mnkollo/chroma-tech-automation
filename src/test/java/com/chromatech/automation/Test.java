package com.chromatech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Using Chrome Browser
        WebDriver chromeDriver = new ChromeDriver();                 //instantiate the ChromeDriver class to launch the Chrome browser
        //chromeDriver.get("https://chroma.mexil.it/site/login");          //driver.get() is the method most used to open a URL
        //chromeDriver.navigate().to("https://chroma.mexil.it/site/login");

        // //Using firefox Browser
        // WebDriver firefoxDriver = new FirefoxDriver();
        // firefoxDriver.get("https://chroma.mexil.it/site/login");

        // //Using Edge Browser
        // WebDriver edgeDriver = new EdgeDriver();
        // edgeDriver.get("https://chroma.mexil.it/site/login");
    }
}
