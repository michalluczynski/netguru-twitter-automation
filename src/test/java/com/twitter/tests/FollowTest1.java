package com.twitter.tests;

import com.twitter.pages.HomePage;
import com.twitter.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FollowTest1 extends BaseSeleniumTests{

    @Test
    public void followFromSearchBoxTest(){
        driver.get("http://twitter.com");
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.logIntoTwitter();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.inputSearchBox("Niebezpiecznik");
        if (homePage.isFollowed () == true){
            System.out.println("Currently followed");
            homePage.unFollowPerson ();
            homePage.followPerson ();
        }else {
            System.out.println ("Can be followed");
            homePage.followPerson ();
        }
    }
}
