package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class CignaHomePageTest extends CommonAPI {

    HomePage homePage;

    @Test
    public void homePageNavigationTest() throws Exception{
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        this.homePage.navigateToCignaHomePage();
        Thread.sleep(3000);
    }

    @Test
    public void homePageTitleTest()throws Exception{

    }
    @Test
    public void logInToMyCignaTabClick() throws Exception{
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        this.homePage.navigateLoginTab();
        Thread.sleep(4000);
    }
    @Test
    public void contactUsLinkClickTest() throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnContactUsLink();
        Thread.sleep(3000);
    }
    @Test
    public void aboutUsLinkClickTest() throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnContactUsLink();
        Thread.sleep(3000);
    }
    @Test
    public void findADoctorDentistOrFacilityLinkClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnFindADoctorDentistOrFacility();
        Thread.sleep(3000);
    }
    @Test
    public void cignaInternationalLinkClickTest() throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnCignaInternationalLink();
        Thread.sleep(3000);
    }
    @Test
    public void healthCareProvidersLinkClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnHealthCareProvidersLink();
        Thread.sleep(3000);
    }
    @Test
    public void employersAndProvidersLinkClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnEmployersAndBrokersLink();
        Thread.sleep(3000);
    }
    @Test
    public void individualsAndFamiliesTabLinkClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        this.homePage.clickOnIndividualsAndFamiliesTab();
        Thread.sleep(3000);
    }
    @Test
    public void shopMedicareSupplimentPlansTabClick()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnShopMedicareSupplementPlansTab();
        Thread.sleep(3000);
    }
    @Test
    public void shopDentalPlansTabClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnShopDentalPlansTab();
        Thread.sleep(3000);
    }
    @Test
    public void healthInsuranceTabClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickOnHealthInsuranceTab();
        Thread.sleep(3000);
    }
    @Test
    public void medicareProductsTabClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.clickonMedicareProductsTab();
        Thread.sleep(3000);
    }
    @Test
    public void medicareSupplementInsuranceTeaserContentClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.medicareSupplementInsuranceTeaserContentTest();
        Thread.sleep(4000);
    }
    @Test
    public void dentalInsuranceTabClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.dentalInsuranceTab();
        Thread.sleep(4000);
    }
    @Test
    public void otherSupplementalInsuranceTabClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.otherSupplementalInsuranceTabClickTest();
        Thread.sleep(4000);
    }
    @Test
    public void internationalCoverageTabClickTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.internationalCoverageTabClickTest();
        Thread.sleep(3000);
    }
    @Test
    public void employeePlansAndPoliciesTabClick()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.emploeePlansAndPoliciesTab();
        Thread.sleep(3000);
    }
    @Test
    public void employerGroupSolutionsTabTest()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.employerGroupSolutionsTabClickTest();
        Thread.sleep(3000);
    }
    @Test
    public void learnMoreAboutTheConnectionTabClick()throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.learnMoreAboutTheConnectionLinkClickTest();
        Thread.sleep(3000);
    }
    @Test
    public void disasterResourceCenterLinkTest() throws Exception{
        this.homePage = PageFactory.initElements(driver, HomePage.class);
        this.homePage.disasterResourceCenterLinkTest();
        Thread.sleep(3500);
    }
    @Test
    public void fileAClaimTabClickTest() throws Exception{
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        this.homePage.fileAClaimTabClick();
    }
    @Test
    public void viewMyClaimsAndEOBsTabClick()throws Exception{
        this.homePage = PageFactory.initElements(driver,HomePage.class);
        this.homePage.viewMyClaimsAndEOBsTabClick();
    }



}

