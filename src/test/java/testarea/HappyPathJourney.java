package testarea;
import org.testng.annotations.Test;
import pages.DemoApiPage;



public class HappyPathJourney extends TestBaseClass {


    @Test
    public void verifyWifiFuntionality() {
        new DemoApiPage(driver).turnOnWifi();
    }

    @Test
    public void verifyScrollingTillEndofPageFunctionality() {
        new DemoApiPage(driver).scrollTillWebView();
    }


}

