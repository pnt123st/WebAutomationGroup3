package cnnBusiness;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CnnBusinessPage extends CommonAPI {

    @FindBy(css = "#menu")
    WebElement selectingMenu;

    @FindBy(xpath = "//div[@id='nav']/div[2]/div[2]/a[4]")
    WebElement clickOnBusiness;

    @FindBy(xpath = "//a[@class='nav-menu-links__link' and text()='Markets']")
    WebElement marketInBuseness;

    @FindBy(css = "button:nth-child(2)>svg>path")
    WebElement tredeScrolling;

    @FindBy(id = "downshift-0-input")
    WebElement inputSearchInBusiness;
    /**
     * pass sendkeys nike and move back
     */

    @FindBy(xpath = "//img[@class='media__image']")
    WebElement testImage;  //use boolean to test the image isDispalyed or not


    @FindBy(xpath = "//div[@id='4630']/div[1]/img")
    WebElement testImage2;



    public void gotoMenu() {
        selectingMenu.click();

    }
    public void getBusinessPage(){
        clickOnBusiness.click();
    }

    public void seeMarketaGlance(){
        marketInBuseness.click();
        driver.navigate().back();
    }


    public void image1(){
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
    }
    public void image2(){
        boolean img2 = testImage2.isDisplayed();
        Assert.assertTrue(img2);
    }


    public void seeNikeTrade(String locator) throws Exception{
        inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
        Thread.sleep(2000);
    }




}
