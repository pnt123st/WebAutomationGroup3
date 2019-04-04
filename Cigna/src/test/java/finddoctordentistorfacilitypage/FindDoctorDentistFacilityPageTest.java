package finddoctordentistorfacilitypage;

import base.CommonAPI;
import finddoctordentistfacilityPage.FindDDFTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindDoctorDentistFacilityPageTest extends CommonAPI {

FindDDFTest findtest;
String url = "https://www.cigna.com/";

@BeforeMethod
public void initializing(){
    driver.get(url);
    findtest= PageFactory.initElements(driver,FindDDFTest.class);
}
@Test
public void clickOnFindADoctorDentistOrFacilityTest(){
findtest.FindDDFLinkClick();
    }
}
