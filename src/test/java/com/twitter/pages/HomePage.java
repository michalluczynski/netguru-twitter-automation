package com.twitter.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy (xpath = "//*[contains(@data-testid,\"AppTabBar_Home_Link\")]")
    private WebElement homeButton;
    @FindBy (xpath = "//*[contains(@data-testid,\"AppTabBar_Explore_Link\")]")
    private WebElement exploreLink;
    @FindBy (xpath = "//*[contains(@data-testid,\"AppTabBar_Notifications_Link\")]")
    private WebElement notificationLink;
    @FindBy (xpath = "//*[contains(@data-testid,\"AppTabBar_More_Menu\")]")
    private WebElement moreMenuLink;
    @FindBy (xpath = "//*[contains(@data-testid,\"SearchBox_Search_Input\")]")
    private WebElement searchBox;
    @FindBy (xpath = "(//a[contains(@href,'/explore')])[2]")
    private WebElement letsGoButton;
    @FindBy (xpath = "//a[contains(@aria-label,'Profile')]")
    private WebElement profileButton;
    @FindBy (xpath = "//*[contains(@data-testid,\"63029891-follow\")]")
    private WebElement followFirstResult;
    @FindBy (xpath = "//*[contains(@data-testid,\"63029891-unfollow\")]")
    private WebElement unfollowFirstResult;



    @FindBy (xpath = "//span[contains(text(),'Log out')]")
    private WebElement logOutMenuButton;
    @FindBy (xpath = "//*[contains(@data-testid,\"confirmationSheetConfirm\")]")
    private WebElement confirmationButton;
    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement caretArrowDeleteButton;
    @FindBy (xpath = "//*[contains(@data-testid,\"addButton\")]")
    private WebElement tweetToolbarAddButton;
    @FindBy (xpath = "//*[contains(@data-testid,\"tweet\")]")
    private WebElement tweetContent;

    @FindBy (xpath = "//*[contains(@data-testid,\"primaryColumn\")]")
    private WebElement primaryColumn;
    @FindBy (xpath = "//*[contains(@data-testid,\"tweetTextarea_0\")]")
    private WebElement tweetTextArea;
    @FindBy (xpath = "//*[contains(@data-testid,\"toolBar\")]")
    private WebElement tweetToolBar;
    @FindBy(xpath = "//*[contains(@data-testid,\'tweet\')]")
    private WebElement tweetField;
    @FindBy(xpath = "//*[contains(@data-testid,\"caret\")]")
    private WebElement caretArrow;

    @FindBy (xpath = "//*[contains(@data-testid,\"tweetButton\")]")
    private WebElement sendTweetButton;
    @FindBy (xpath = "//*[contains(@data-testid,\"tweetButtonInline\")]")
    private WebElement sendTweetButtonInline;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickHomeButton(){
        homeButton.isDisplayed ();
        homeButton.click();
    }

    public void openProfileSite(){
        profileButton.isDisplayed ();
        profileButton.click();
    }

    public void logOutFromTwitter(){
        moreMenuLink.click();
        logOutMenuButton.click();
        confirmationButton.click();
    }

    public void inputTweetContent(String tweetContent){
        tweetTextArea.isDisplayed();
        tweetTextArea.click();
        tweetTextArea.sendKeys(tweetContent);
    }

    public void sendTweet(){
        sendTweetButton.isDisplayed();
        sendTweetButton.click();
    }

    public void sendTweetAlt(){
        sendTweetButtonInline.isDisplayed();
        sendTweetButtonInline.click();
    }


    public void deleteTweet(){
        caretArrow.isDisplayed ( );
        caretArrow.click ( );
        caretArrowDeleteButton.isDisplayed ( );
        caretArrowDeleteButton.click ( );
        confirmationButton.isDisplayed ( );
        confirmationButton.click ( );
    }

    public void inputSearchBox(String searchInput){
        searchBox.isDisplayed();
        searchBox.sendKeys(searchInput);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void followPerson(){
        followFirstResult.isDisplayed ();
        followFirstResult.click ();
    }

    public void unFollowPerson(){
        unfollowFirstResult.isDisplayed ();
        unfollowFirstResult.click ();
        confirmationButton.isDisplayed ();
        confirmationButton.click ();
    }


    public boolean isCaretArrowButtonVisible() {
        try {
            if (caretArrow.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }

    public boolean isFollowed() {
        try {
            if (unfollowFirstResult.isEnabled()) {
                System.out.println ("Is followed" );
                return true;
            } else {
                System.out.println ("Isn't followed");
                return false;
            }
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        }
    }
}
