package loginpage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {

    LoginPage loginPage;
    String LoginPageUrl = "https://my.cigna.com/web/public/guest";

@Test
public void loginToMyCignaTabClickTest()throws Exception{
    this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    this.loginPage.loginToMyCignaTab();
}
@Test
    public void loninTestNegative()throws Exception{
    this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    driver.get(LoginPageUrl);
    this.loginPage.enterIncorrectUserName("M_Mannan");
    this.loginPage.enterIncorrectPassword("abc123");
    this.loginPage.clickOnLoginButton();
}
@Test
    public void RegisterBtnClickTest(){
    this.loginPage = PageFactory.initElements(driver,LoginPage.class);
    driver.get(LoginPageUrl);
    this.loginPage.registerBtn.click();
}
@Test
    public void RegistrarseEnEspañolLinkClickTest(){
    this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    driver.get(LoginPageUrl);
    this.loginPage.RegistrarseEnEspañolLink.click();
}
@Test
    public void CignaAccessLinkClickTest(){
    this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    driver.get(LoginPageUrl);
    this.loginPage.cignaAccessLink.click();
}
@Test
    public void cignaEnvoySiteLinkClickTest(){
    this.loginPage = PageFactory.initElements(driver,LoginPage.class);
    driver.get(LoginPageUrl);
    this.loginPage.cignaAccessLink.click();
}



}