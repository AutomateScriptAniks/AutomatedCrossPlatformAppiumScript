package generics;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class Gestures {

    private AppiumDriver driver;
    TouchAction action = new TouchAction(driver);

    public void clickElement(WebElement element)
    {
        element.click();
    }

    public void tapElement(WebElement element)
    {
        action.tap(element).perform();
    }

    public void enterTextInElement(WebElement element,String text)
    {
        element.sendKeys(text);
    }

    public void pressElement(WebElement element,int waitTime)
    {
        action.press(element).waitAction(waitTime).release();
    }

    public void swipeElement(WebElement element1,WebElement element2,int waitTime)
    {
        action.press(element1).waitAction(waitTime).moveTo(element2).release();
    }

    public void scrollElement(WebElement element)
    {

    }









}
