package sephorahome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SephoraHomePage {

    @FindBy(xpath = "//a[contains(text(),'No, thanks')]")
    WebElement noThanks;

    @FindBy(xpath = "//*[@id=\'account_menu_trigger\']/div[1]/div/div/button[1]")
    WebElement signin;

    @FindBy(linkText = "My Account")
    WebElement myAccount;




    public void clickNoThanks(){
        noThanks.click();
    }

    public void signin(){
        signin.click();
    }

    public void clickMyAccount(){
        myAccount.click();
    }
}
