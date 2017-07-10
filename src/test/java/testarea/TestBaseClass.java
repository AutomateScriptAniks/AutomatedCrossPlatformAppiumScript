package testarea;

import generics.SetCapabilities;
import generics.Waits;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.DemoApiPage;
import utils.PropertyReader;
import java.net.MalformedURLException;

import static java.util.concurrent.TimeUnit.SECONDS;


public abstract class TestBaseClass {

    protected AppiumDriver<?> driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = new SetCapabilities(driver).setDesiredCapabilities(PropertyReader.readProperty("test.platform"));
        new Waits(driver).setUniversalImplicitWait((long) 10, SECONDS);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
