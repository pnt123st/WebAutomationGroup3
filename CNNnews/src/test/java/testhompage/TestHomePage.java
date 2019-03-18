package testhompage;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    String homepageUrl = "https://www.cnn.com/";
    HomePage homePage;


    @BeforeClass
    public void initialize() {
        this.driver.navigate().to(this.homepageUrl);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
    }

    @Test
    public void clickOnSerchTab(){
        homePage.clickOnSearch();
    }
    @Test
    public void searchWithsearchIteems(){
        homePage.SearchWithtext("christchurch");
    }


}
