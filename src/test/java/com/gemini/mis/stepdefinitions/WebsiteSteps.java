package com.gemini.mis.stepdefinitions;

import com.gemini.mis.pages.WebsitePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class WebsiteSteps {
    @Steps
    WebsitePage leaveManagementTab;

    @Given("^User is logged into Website$")
    public void userIsLoggedIn()
    {
        leaveManagementTab.launchSite();

    }
    @Then("User clicks on Image button")
    public void userClicksOnGmailButton() {
       leaveManagementTab.navigate();
    }

    @Given("^Set up browser$")
    public void setUpBrowser() {
        leaveManagementTab.setUpBrowser();
    }


    @Then("User click")
    public void userClick() {
        leaveManagementTab.navigate();
    }

    @And("User clicks on the meme")
    public void clickMeme() throws InterruptedException {

       leaveManagementTab.clickMeme();
    }

//    @And("^User enters the (.+) as (.+)$")
//    public void enterText(String input, String text){
//        leaveManagementTab.enterText(input, text);
//    }

    @And("^User enters the topText as (.+)$")
    public void enterTextTop(String text){
        leaveManagementTab.enterTextTop(text);
    }

    @And("^User enters the bottomText as (.+)$")
    public void enterTextBottom(String text){
        leaveManagementTab.enterTextBottom(text);
    }


    @And("^User select the font as (.+)$")
    public void selectFont(String font){
        leaveManagementTab.selectFont(font);
    }

    @And("^User sets font size as (.+)$")
    public void setFontSize(int size){
       leaveManagementTab.selectFontSize(size);
    }

    @And("^User clicks on submit$")
    public void submit(){
        leaveManagementTab.clicKSubmit();
    }

}

