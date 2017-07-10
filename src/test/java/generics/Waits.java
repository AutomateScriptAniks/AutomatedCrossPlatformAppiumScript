package generics;

import io.appium.java_client.AppiumDriver;
import pages.PageBaseClass;

import java.util.concurrent.TimeUnit;

public class Waits extends PageBaseClass {

    public Waits(AppiumDriver<?> driver) {
        super(driver);
    }

    public void setUniversalImplicitWait(Long duration, TimeUnit unit)
    {
        driver.manage().timeouts().implicitlyWait(duration, unit);
    }
}
