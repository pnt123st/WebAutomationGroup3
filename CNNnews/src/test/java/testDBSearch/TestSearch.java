package testDBSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchDBPages.SearchInCNN;

public class TestSearch extends CommonAPI {



    @Test
    public void testFromDBsearch() throws Exception{
        SearchInCNN searchCnn= PageFactory.initElements(driver,SearchInCNN.class);
        searchCnn.searchItemsAndSubmitButton();
    }







}
