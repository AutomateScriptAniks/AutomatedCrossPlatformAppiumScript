package testarea;


import generics.SetCapabilities;

import generics.Waits;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DemoApiPage;

import java.net.MalformedURLException;


public class HappyPathJourney extends TestBaseClass {

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = new SetCapabilities(driver).setDesiredCapabilities("android");
        new Waits(driver).setUniversalImplicitWait();
    }

    @Test
    public void verifyWifiFuntionality() {
        new DemoApiPage(driver).turnOnWifi();
    }

    @Test
    public void verifyScrollingTillEndofPageFunctionality() {
        new DemoApiPage(driver).scrollTillWebView();
    }


}

