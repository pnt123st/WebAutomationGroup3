package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(css = ".search__button.cnn-icon")
    WebElement searchTab;

    @FindBy(id = "search-input-field")
    WebElement searchInput;
//
//    @FindBy(id = "search_query_top")
//    WebElement searchBox;
//
//    @FindBy(name = "submit_search")
//    WebElement searchButton;
//
//    @FindBy(xpath = "//a[@title='Women']")
//    WebElement womenTab;




    public void clickOnSearch(){
        searchTab.click();
    }
    public void SearchWithtext(String searchItem){
        searchInput.sendKeys(searchItem, Keys.ENTER);
    }
}
