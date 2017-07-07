package generics;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public  class GenericBaseClass {

    protected DesiredCapabilities cap = new DesiredCapabilities();
    protected Gestures gestures = new Gestures();
    protected AppiumDriver driver;

    protected GenericBaseClass(AppiumDriver driver)
    {
        this.driver=driver;
    }





}
