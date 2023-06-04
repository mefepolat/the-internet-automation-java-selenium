package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAlert(){
        var alertPage = homePage.clickAlertsLink();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        assertEquals(alertPage.getResultMessage(), "You successfully clicked an alert", "Result message is incorrect");
    }
}
