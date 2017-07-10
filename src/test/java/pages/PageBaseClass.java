package pages;

import generics.Gestures;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class PageBaseClass {

    protected final DesiredCapabilities cap;
    protected AppiumDriver driver;
    protected final Gestures gestures;

    protected PageBaseClass(AppiumDriver<?> driver)
    {
        this.driver=driver;
        this.gestures= new Gestures(driver);
        this.cap = new DesiredCapabilities();
    }

}
