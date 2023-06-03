package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;


import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
    LoginPage loginPage = homePage.clickFormAuthentication();
    loginPage.setUsername("tomsmith");
    loginPage.setPasswordField("SuperSecretPassword!");
    SecurePage securePage = loginPage.clickLogin();
    assertTrue(securePage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect!");
    }
}
