package com.twitter.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public abstract class BaseSeleniumTests {

    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        String driverPath = "C:\\Users\\micha\\IdeaProjects\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
