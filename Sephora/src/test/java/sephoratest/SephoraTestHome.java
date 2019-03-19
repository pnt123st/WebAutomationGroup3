package sephoratest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sephorahome.SephoraHomePage;

public class SephoraTestHome extends CommonAPI {

    SephoraHomePage sephoraHomePage;
    String homepageUrl = "https://www.sephora.com/";

    @BeforeClass
    public void initialize() {
        driver.navigate().to(this.homepageUrl);
        this.sephoraHomePage = PageFactory.initElements(driver, SephoraHomePage.class);
    }

//    @Test
//    public void closePopUp(){
//        this.sephoraHomePage.clickNoThanks();
//    }

    @Test

    public void signin(){
        sephoraHomePage.signin();
    }

    @Test

    public void clickMyAccount(){
        sephoraHomePage.clickMyAccount();
    }
}
