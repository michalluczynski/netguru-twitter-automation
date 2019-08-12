package com.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy (xpath = "(//div/input)[1]")
    private WebElement loginField;
    @FindBy (xpath = "(//div/input)[2]")
    private WebElement passwordField;
    @FindBy (xpath = "//input[@type='submit']")
    private WebElement logInButton;

    private String login = "TestUse71653311";
    private String password = "TestUserPassword456123";



    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void logIntoTwitter(){
        loginField.clear();
        loginField.sendKeys(login);
        passwordField.clear();
        passwordField.sendKeys(password);
        logInButton.click();
    }
}
