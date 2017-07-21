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
            getValuesForGenericCapabilties(MobilePlatform.ANDROID
                    ,PropertyReader.readProperty("device.android.name")
                    ,PropertyReader.readProperty("path.android.newapp"));

            driver = new AndroidDriver(new URL(PropertyReader.readProperty("appium.url")), cap);
        }

        else if(selectPlatform.equals("ios"))
        {
            getValuesForGenericCapabilties(MobilePlatform.IOS
                    ,PropertyReader.readProperty("device.ios.name")
                    ,PropertyReader.readProperty("path.ios.app"));

            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.3");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME
                                ,AutomationName.IOS_XCUI_TEST);

            //cap.setCapability(MobileCapabilityType.UDID,"196e776b70cd289b3ce6c2d3043e1e45d1ce7c83");
            //cap.setCapability("bundleId","io.appium.WebDrivergentRunner");

            driver = new IOSDriver(new URL(PropertyReader.readProperty("appium.url")), cap);
        }
        else
        {

        }
    return driver;
    }

    private void getValuesForGenericCapabilties(String platform,String deviceName,String appLocation)
    {
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        cap.setCapability(MobileCapabilityType.APP, new File(appLocation).getAbsolutePath());
    }


}
