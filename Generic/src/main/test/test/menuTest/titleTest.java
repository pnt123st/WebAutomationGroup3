package menuTest;

import base.CommonAPI;
import org.testng.annotations.Test;

public class titleTest extends CommonAPI {



    @Test
    public void titlesee(){
       String str= driver.getTitle();
        System.out.println(str);
    }
}
