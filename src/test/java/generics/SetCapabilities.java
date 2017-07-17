package generics;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import pages.PageBaseClass;
import utils.PropertyReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class SetCapabilities extends PageBaseClass {

    public SetCapabilities(AppiumDriver<?> driver) {
        super(driver);
    }

    public  AppiumDriver setDesiredCapabilities(String platform) throws MalformedURLException {

        String selectPlatform = platform.toLowerCase();
        if (selectPlatform.equals("android"))
        {
            getValuesForCapabilties(MobilePlatform.ANDROID
                    ,PropertyReader.readProperty("device.android.name")
                    ,PropertyReader.readProperty("path.android.newapp"));

            driver = new AndroidDriver(new URL(PropertyReader.readProperty("appium.url")), cap);
        }

        else if(selectPlatform.equals("ios"))
        {
            getValuesForCapabilties(MobilePlatform.IOS
                    ,PropertyReader.readProperty("device.ios.name")
                    ,PropertyReader.readProperty("path.ios.app"));

            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME
                                ,AutomationName.IOS_XCUI_TEST);

            driver = new IOSDriver(new URL(PropertyReader.readProperty("appium.url")), cap);
        }
        else
        {

        }
    return driver;
    }

    private void getValuesForCapabilties(String platform,String deviceName,String appLocation)
    {
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        cap.setCapability(MobileCapabilityType.APP, new File(appLocation).getAbsolutePath());
    }


}
