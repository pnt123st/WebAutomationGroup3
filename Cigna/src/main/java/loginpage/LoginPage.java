package loginpage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {

    private String LoginPageUrl = "https://my.cigna.com/web/public/guest";



    @FindBy(xpath = "//a[@class='btn btn-sm btn-primary' and @target='_blank']")
    private WebElement loginToMyCignaTab;

    @FindBy(id = "username")
    private WebElement userNameField;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passWordField;
    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement loginBtn;

    @FindBy(xpath="//*[@id=\"register\"]")
    WebElement registerBtn;

    @FindBy(xpath = "//*[@id=\"registerespanol\"]")
    WebElement RegistrarseEnEspañolLink;

    @FindBy(xpath = "//*[@id=\"c1543144077832\"]/footer/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/p/a/span")
    WebElement cignaAccessLink;

    @FindBy(xpath = "//*[@id=\"c1543144077832\"]/footer/div[1]/div/div/div[2]/div/div[1]/ul/li[1]/p/a/span")
    WebElement linkForCignaEnvoySite;











    public void loginToMyCignaTab() throws Exception{
        loginToMyCignaTab.click();
        sleepFor(1);
    }

    public void enterIncorrectUserName(String username) throws Exception{
        userNameField.sendKeys(username, Keys.ENTER);
        sleepFor(2);
    }
    public void enterIncorrectPassword(String password)throws Exception{
        this.passWordField.sendKeys(password,Keys.ENTER);
        sleepFor(1);
    }
    public void clickOnLoginButton()throws Exception{
        this.loginBtn.click();
        sleepFor(1);
    }
    public void clickOnRegisterBtn()throws Exception{
        this.registerBtn.click();
        sleepFor(1);
    }
    public void RegistrarseEnEspañolLink()throws Exception{
        this.RegistrarseEnEspañolLink.click();
        sleepFor(1);
    }
    public void cignaAccessLink() throws Exception{
        this.cignaAccessLink.click();
        sleepFor(1);
    }
    public void cignaEnvoySiteLink()throws Exception{
        this.cignaEnvoySiteLink();
        sleepFor(1);
    }



}
