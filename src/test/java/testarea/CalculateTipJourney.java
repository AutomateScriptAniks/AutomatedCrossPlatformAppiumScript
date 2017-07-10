package testarea;

import org.testng.annotations.Test;
import pages.CalculateTipPage;

import static org.testng.AssertJUnit.assertEquals;


public class CalculateTipJourney extends TestBaseClass {

    @Test
    public void verifyTipIsAsExpected()
    {
        new CalculateTipPage(driver).calculateTip();

        assertEquals("15.0%",new CalculateTipPage(driver).getTipPerc());
        assertEquals("$60.00",new CalculateTipPage(driver).getTipAmount());
        assertEquals("$460.00",new CalculateTipPage(driver).getTotalAmount());

    }





}
