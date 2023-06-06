package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;

    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");

    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");

    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    private By resultMessage = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }

    public void triggerConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void setPromptMessage(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }


    public String getResultMessage() {
        return driver.findElement(resultMessage).getText();
    }
}
