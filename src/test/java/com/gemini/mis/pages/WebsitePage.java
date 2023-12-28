package com.gemini.mis.pages;

import com.epam.healenium.SelfHealingDriver;
import com.gemini.mis.selectors.WebsiteLocators;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebsitePage {

//    LeaveImplementation implementation;

    WebDriver driver2;

    @Step("Set Up Browser")
    public void setUpBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--illegal-access=warn");
        WebDriver driver = new EdgeDriver(options);
        driver2 = SelfHealingDriver.create(driver);
    }

    @Step("Launch MIS Beta site")
    public void launchSite() {
        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
// Start Edge Session

        driver2.get("https://makeyourmemebyayush.netlify.app/");
        driver2.manage().window().maximize();
//        implementation.launchSite();
    }

    @Step("Click on Gmail")
    public void navigate() {
        driver2.findElement(WebsiteLocators.button).click();

    }


    public void clickMeme() throws InterruptedException  {
        Thread.sleep(5000);
        driver2.findElement(WebsiteLocators.memeImage).click();
    }

    public void enterTextBottom(String text) {
        driver2.findElement(WebsiteLocators.bottomText).sendKeys(text);
    }

    public void enterTextTop(String text) {
        driver2.findElement(WebsiteLocators.topText).sendKeys(text);
    }

    public void selectFont(String font) {
        driver2.findElement(WebsiteLocators.fontType).click();
        driver2.findElement(WebsiteLocators.selectFont(font)).click();
    }

    public void clicKSubmit() {
        driver2.findElement(WebsiteLocators.submit).click();
    }

    public void selectFontSize(int size) {
        driver2.findElement(WebsiteLocators.fontSize).sendKeys(String.valueOf(size));

    }
}
