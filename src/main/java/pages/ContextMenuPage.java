package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;

    private By hotSpotArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHotSpot(){
        var button = driver.findElement(hotSpotArea);
        Actions action = new Actions(driver);
        action.contextClick(button).perform();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getAlertMessage(){
       return driver.switchTo().alert().getText();
    }
}
