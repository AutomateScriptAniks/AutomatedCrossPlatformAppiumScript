package generics;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract  class GenericBaseClass {

    protected final DesiredCapabilities cap = new DesiredCapabilities();
    protected final Gestures gestures;
    protected AppiumDriver driver;

    protected GenericBaseClass(AppiumDriver driver)
    {
        this.driver=driver;
        gestures = new Gestures(driver);
    }


}
