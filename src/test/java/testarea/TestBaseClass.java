package testarea;

import generics.SetCapabilities;
import generics.Waits;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;

import static java.util.concurrent.TimeUnit.SECONDS;


public abstract class TestBaseClass {

    protected AppiumDriver<?> driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        driver = new SetCapabilities(driver).setDesiredCapabilities(System.getProperty("mobile.platform"));
        new Waits(driver).setUniversalImplicitWait((long) 10, SECONDS);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
