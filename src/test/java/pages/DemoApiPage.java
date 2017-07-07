package pages;

import generics.GenericBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoApiPage extends GenericBaseClass {

    public DemoApiPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    private By preferenceElement = By.xpath("//android.widget.TextView[@text='Preference']");
    private By preferenceDependenciesElement = By.xpath("//android.widget.TextView[@text='3. Preference dependencies']");
    private By wifiCheckboxElement = By.id("android:id/checkbox");
    private By wifiNameElement = By.xpath("(//android.widget.RelativeLayout)[2]");
    private By wifiSettingElement = By.className("android.widget.EditText");
    private By wifiOkElement = By.id("android:id/button1");
    private MobileBy views = new MobileBy.ByAndroidUIAutomator("text(\"Views\")");
    private MobileBy WebView = new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

    @FindBy(xpath="//android.widget.TextView[@text='Preference']")
    WebElement preferenceElementPF;

    private WebElement findPreference()
    {
        return preferenceElementPF;
    }
    private WebElement findPreferenceDependency()
    {
        return driver.findElement(preferenceDependenciesElement);
    }
    private WebElement findWifiCheckBox()
    {
        return driver.findElement(wifiCheckboxElement);
    }
    private WebElement findWifiNameElement()
    {
        return driver.findElement(wifiNameElement);
    }
    private WebElement findWifiSetting()
    {
        return driver.findElement(wifiSettingElement);
    }
    private WebElement findWifiOk()
    {
        return driver.findElement(wifiOkElement);
    }
    private WebElement findViews()
    {
        return driver.findElement(views);
    }
    private WebElement findwebViewElementAfterScroll()
    {
        return driver.findElement(WebView);
    }


    public void turnOnWifi()
    {
        gestures.clickElement(findPreference());
        gestures.clickElement(findPreferenceDependency());
        gestures.clickElement(findWifiCheckBox());
        gestures.clickElement(findWifiNameElement());
        gestures.enterTextInElement(findWifiSetting(),"Anik");
        gestures.clickElement(findWifiOk());
    }
    public void scrollTillWebView()
    {
       gestures.clickElement(findViews());
       gestures.scrollElement(findwebViewElementAfterScroll());
    }
}
