package com.chromatech.automation;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; // Add the missing import statement
public class SeliniumTestNGDemo {
      
    @BeforeMethod
    public void setUp()
    {
        System.out.println("This is the setup method");
    }

    @Test

    public void sampleTestMethod()
    {
        System.out.println("This is the sample test method");
    }
}

