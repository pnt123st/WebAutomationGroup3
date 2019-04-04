package individualsandfamiliespage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualsAndFamiliesPageTest extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[1]/a")
    WebElement IndividualsAndFamilies;


    public void IndvAFamLinkClick(){
        IndividualsAndFamilies.click();
        System.out.println(driver.getTitle());
        //Assert.assertEquals("",driver.getTitle());
    }


}
