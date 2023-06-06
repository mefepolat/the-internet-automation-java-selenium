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

    @Test
    public void testConfirm(){
        var alertPage = homePage.clickAlertsLink();
        alertPage.triggerConfirmButton();
        alertPage.cancelAlert();
        assertEquals(alertPage.getResultMessage(), "You clicked: Cancel", "Result message is incorrect");
    }

    @Test
    public void testConfirmAccept(){
        var alertPage = homePage.clickAlertsLink();
        alertPage.triggerConfirmButton();
        alertPage.acceptAlert();
        assertEquals(alertPage.getResultMessage(), "You clicked: Ok", "Result message is incorrect");
    }

    @Test
    public void testPrompt(){
        var alertPage = homePage.clickAlertsLink();
        String message = "a message";
        alertPage.triggerPromptButton();
        alertPage.setPromptMessage(message);
        alertPage.acceptAlert();
        assertEquals(alertPage.getResultMessage(), "You entered: a message", "Result message is incorrect!");
    }
}
