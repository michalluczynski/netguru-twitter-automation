package com.twitter.tests;

import com.twitter.pages.HomePage;
import com.twitter.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeleteTweetTest1 extends BaseSeleniumTests{

    @Test
    public void deleteTweetFromPrimaryColumn(){
        driver.get("http://twitter.com");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.logIntoTwitter();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if (homePage.isCaretArrowButtonVisible() == true){
            System.out.println("Tweet deletable");
            homePage.deleteTweet();
        }else {
            System.out.println("No tweet available");
        }
    }
}
