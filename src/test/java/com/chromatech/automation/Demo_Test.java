package com.chromatech.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class Demo_Test {

    @BeforeTest    // Add BeforeTest annotation
    public void beforeTestSetup() {
        System.out.println("Before Test Settings Done");
    }
    @AfterTest
    public void afterTestTearDown() {
        System.out.println("After Test Settings Done");
    }
    @BeforeClass
    public void beforeClassSetUp() {
        System.out.println("Before CLass Settings Done");
    }
    @AfterClass
    public void afterClassTearDown() {
        System.out.println("After Class Settings Done");
    }
    @BeforeMethod
    public void setup() {
        System.out.println("Before Method Settings Done");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After Method Settings Done");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 Executed");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 Executed");
    }
    @Test
    public void test3(){
        System.out.println("Test 3 Executed");
    }
}
