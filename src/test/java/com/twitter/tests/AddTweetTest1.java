package com.twitter.tests;

import com.twitter.pages.HomePage;
import com.twitter.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddTweetTest1 extends BaseSeleniumTests{
    @Test
    public void sendTweetPrimary(){
        driver.get("http://twitter.com");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.logIntoTwitter();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.inputTweetContent("test tweet");
        homePage.sendTweetAlt();
    }
}
