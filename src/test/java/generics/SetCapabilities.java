package generics;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import utils.PropertyReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class SetCapabilities extends GenericBaseClass {

    public SetCapabilities(AppiumDriver driver) {
        super(driver);
    }

    public  AppiumDriver setDesiredCapabilities(String platform) throws MalformedURLException {

        String selectPlatform = platform.toLowerCase();
        if (selectPlatform.equals("android")) {
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, PropertyReader.readProperty("device.android.name"));
            cap.setCapability(MobileCapabilityType.APP, new File(PropertyReader.readProperty("path.android.app")).getAbsolutePath());
            driver = new AndroidDriver(new URL(PropertyReader.readProperty("appium.url")), cap);
        }

        else if(selectPlatform.equals("ios"))
        {
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,PropertyReader.readProperty("device.ios.name"));
            cap.setCapability(MobileCapabilityType.APP, new File(PropertyReader.readProperty("path.ios.app")).getAbsolutePath());
            driver = new AndroidDriver(new URL(PropertyReader.readProperty("appium.url")), cap);
        }
        else
        {

        }
    return driver;
    }


}
