package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {

    private WebDriver driver;
    private By logoutButton = By.className("button secondary radius");

    private By statusAlert = By.id("flash");

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
       return driver.findElement(statusAlert).getText();
    }

    public LoginPage clickLogout(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
