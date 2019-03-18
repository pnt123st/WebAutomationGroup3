package testamazon;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestAmazon extends CommonAPI {

    @Test
    public void getTitle(){
        String st = driver.getTitle();
        System.out.println(st);;
    }
}
