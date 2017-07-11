package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;



public class CalculateTipPage extends PageBaseClass {

    public CalculateTipPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSFindBy(className = "XCUIElementTypeTextField")
    @AndroidFindBy(id = "org.traeg.fastip:id/totalAmtTextView")
    MobileElement textBillAmountElement;

    @iOSFindBy(accessibility = "Calculate Tip")
    @AndroidFindBy(id="org.traeg.fastip:id/calcTipButton")
    MobileElement calculateTripElement;

    @AndroidFindBy(id="org.traeg.fastip:id/tipPctTextView")
    MobileElement tipPercentageText;

    @iOSFindBy(accessibility = "$60.00")
    @AndroidFindBy(id="org.traeg.fastip:id/tipAmtTextView")
    MobileElement tipAmountText;

    @iOSFindBy(accessibility = "$460.00")
    @AndroidFindBy(id="org.traeg.fastip:id/totalAmtTextView")
    MobileElement totalAmountText;

    public String getTipPerc()
    {
        return tipPercentageText.getText();
    }

    public String getTipAmount()
    {
        return tipAmountText.getText();
    }

    public String getTotalAmount()
    {
        return totalAmountText.getText();
    }

    public void calculateTip()
    {
        gestures.enterTextInElement(textBillAmountElement,"400");
        gestures.clickElement(calculateTripElement);
    }


}
