package testcnnBusiness;

import base.CommonAPI;
import cnnBusiness.CnnBusinessPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCnnBusinessPage extends CommonAPI {


    String businessUrl = "https://www.cnn.com/";
    CnnBusinessPage cnnBusinessPage;

    @BeforeClass
    public void initialized(){
        driver.get(businessUrl);
        cnnBusinessPage = PageFactory.initElements(driver,CnnBusinessPage.class);

    }

    @Test(priority = 1)
    public void menubtn() {
        cnnBusinessPage.gotoMenu();
        driver.navigate().to(businessUrl);

    }
    @Test(priority = 2)
    public void pageBusiness(){
        cnnBusinessPage.getBusinessPage();
    }

    @Test(priority = 3)
    public void glaceAtMarket(){
        cnnBusinessPage.seeMarketaGlance();
    }
    @Test(priority = 4)
    public void imageTesting1(){
        cnnBusinessPage.image1();
    }
//    @Test
//    public void imageTesting(){
//        cnnBusinessPage.image2();
//    }
    @Test(priority = 5)
    public void nikeTraging() throws Exception {
        cnnBusinessPage.seeNikeTrade("Nike");
        driver.navigate().back();
    }


}
