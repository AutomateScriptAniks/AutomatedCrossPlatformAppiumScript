package testarea;
import org.testng.annotations.Test;
import pages.DemoApiPage;



public class HappyPathJourney extends TestBaseClass {


    @Test(enabled = false)
    public void verifyWifiFuntionality() {
        new DemoApiPage(driver).turnOnWifi();
    }

    @Test(enabled = false)
    public void verifyScrollingTillEndofPageFunctionality() {
        new DemoApiPage(driver).scrollTillWebView();
    }


}

