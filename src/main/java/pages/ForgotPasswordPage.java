package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInputField = By.id("email");
    private By submitButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailInput(String emailInput){
        driver.findElement(emailInputField).sendKeys(emailInput);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }
}
