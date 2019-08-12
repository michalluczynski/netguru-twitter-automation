package com.twitter.tests;

import com.twitter.pages.HomePage;
import com.twitter.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class LoginTest extends BaseSeleniumTests{

    @Test
    public void twitterLoginTest(){
        driver.get("http://twitter.com");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.logIntoTwitter();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        homePage.clickHomeButton();
        String expected = "https://twitter.com/home";
        Assert.assertEquals(driver.getCurrentUrl(),expected);
        homePage.logOutFromTwitter();
    }
}
