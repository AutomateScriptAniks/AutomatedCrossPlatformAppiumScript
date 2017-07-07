package generics;

import io.appium.java_client.AppiumDriver;
import java.util.concurrent.TimeUnit;

public class Waits extends GenericBaseClass {

    public Waits(AppiumDriver driver) {
        super(driver);
    }

    public void setUniversalImplicitWait()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
