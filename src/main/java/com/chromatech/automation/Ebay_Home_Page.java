package com.chromatech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Home_Page {
    
    WebDriver driver;  // Declare the driver

    public Ebay_Home_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id='gh-btn']") public WebElement searchBtn;


    // ******* Methods *******

    public void clickSearchBtn() {
        searchBtn.click();
    }
}
