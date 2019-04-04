package cignahomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    String HomePageUrl = "https://www.cigna.com/";

    @FindBy(xpath = "//input[@placeholder='Search Cigma.com']")
    WebElement searchTab;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-primary' and @target='_blank']")
    private WebElement loginTab;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[2]/a")
    private WebElement contactUsTab;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[4]/a")
    private WebElement aboutUsTab;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-primary' and @target='_self']")
    private WebElement findADoctorDentistOrFacilityTab;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[1]/a")
    private WebElement cignaInternationaTab;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[3]/a")
    private WebElement healthCareProvidersTab;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[2]/a")
    private WebElement employersAndBrokersTab;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[1]/a")
    private WebElement individualsAndFamiliesTab;

    @FindBy(xpath = "//*[@id=\"1524743177700\"]/div/div/div[2]/div/p[2]/a/span")
    private WebElement shopMadicareSupplementPlansTab;

    @FindBy(xpath = "//*[@id=\"1524743177700\"]/div/div/div[2]/div/p[3]/a")
    private WebElement shopDentalPlansTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[1]/div[2]/a")
    private WebElement healthInsuranceTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[2]/div[2]/a/span")
    private WebElement medicareProductsTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[3]/div[2]")
    private WebElement medicareSupplementInsurance;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[4]/div[2]/a")
    private WebElement dentalInsuranceTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[5]/div[2]/a")
    private WebElement otherSupplementalInsurancrTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[1]/div/div/div[6]/div[2]/a")
    private WebElement internationalCoverageTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[3]/div/div/div[1]/div[2]/h4/a")
    private WebElement employeePlansAndPoliciesTab;

    @FindBy(xpath = "//*[@id=\"1524743178566\"]/div/div[3]/div/div/div[2]/div[2]/h4/a")
    private WebElement employerGroupSolutionsTab;

    @FindBy(xpath = "//*[@id=\"1524996545295\"]/div/div[2]/div/a")
    private WebElement learnMoreAboutTheConnectionLink;

    @FindBy(css = "#\\31 524743178596 > div > div.col-12.col-lg-9 > p > a")
    private WebElement disasterResourceCenterLink;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[1]/ul/li[3]/a/span")
    private WebElement fileAClaimTab;

    @FindBy(css = "#includes-content > div.bg-gray-01 > div > div > div:nth-child(1) > div > div.col-12.col-lg-6.mb-xl.mb-lg-0 > ul > li:nth-child(4) > a")
    private WebElement viewMyClaimsAndEOBsTab;

    @FindBy(css = "#includes-content > div.bg-gray-01 > div > div > div:nth-child(1) > div > div.col-12.col-lg-6.mb-xl.mb-lg-0 > ul > li:nth-child(5) > a")
    private WebElement checkCoverageUnderMyPlanTab;








    public void navigateToCignaHomePage() {
        this.driver.navigate().to(this.HomePageUrl);
    }
    public void inputTextInCignaSearchTab(){
    }

    public void navigateLoginTab() throws Exception {
        loginTab.click();
        sleepFor(1);
    }

    public void clickOnContactUsLink() {
        contactUsTab.click();
    }

    public void clickOnAboutUsLink() {
        aboutUsTab.click();
    }

    public void clickOnFindADoctorDentistOrFacility() {
        findADoctorDentistOrFacilityTab.click();
    }

    public void clickOnCignaInternationalLink() {
        cignaInternationaTab.click();
    }

    public void clickOnHealthCareProvidersLink() {
        healthCareProvidersTab.click();
    }

    public void clickOnEmployersAndBrokersLink() {
        employersAndBrokersTab.click();
    }

    public void clickOnIndividualsAndFamiliesTab()
    { individualsAndFamiliesTab.click(); }

    public void clickOnShopMedicareSupplementPlansTab(){shopMadicareSupplementPlansTab.click();}

    public void clickOnShopDentalPlansTab(){shopDentalPlansTab.click();}

    public void clickOnHealthInsuranceTab(){healthInsuranceTab.click();}

    public void clickonMedicareProductsTab(){medicareProductsTab.click();}

    public void medicareSupplementInsuranceTeaserContentTest(){medicareSupplementInsurance.click();}

    public void dentalInsuranceTab(){dentalInsuranceTab.click();}

    public void otherSupplementalInsuranceTabClickTest(){otherSupplementalInsurancrTab.click();}

    public void internationalCoverageTabClickTest(){internationalCoverageTab.click();}

    public void emploeePlansAndPoliciesTab(){employeePlansAndPoliciesTab.click();}

    public void employerGroupSolutionsTabClickTest(){employerGroupSolutionsTab.click();}

    public void learnMoreAboutTheConnectionLinkClickTest(){learnMoreAboutTheConnectionLink.click();}

    public void disasterResourceCenterLinkTest(){disasterResourceCenterLink.click();}

    public void fileAClaimTabClick()throws Exception{
        fileAClaimTab.click();
        sleepFor(1);
    }
    public void viewMyClaimsAndEOBsTabClick()throws Exception{
        viewMyClaimsAndEOBsTab.click();
        sleepFor(1);
    }








}










