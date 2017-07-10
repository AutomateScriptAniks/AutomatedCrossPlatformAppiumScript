package testarea;

import generics.SetCapabilities;
import generics.Waits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;
import utils.PropertyReader;

import java.net.MalformedURLException;


public abstract class TestBaseClass {

    protected AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = new SetCapabilities(driver).setDesiredCapabilities(PropertyReader.readProperty("test.platform"));
        new Waits(driver).setUniversalImplicitWait();
    }

}
