package pages;

import com.sun.source.tree.PackageTree;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By sliderField = By.cssSelector("input[type='range']");

    private By result = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSliderRange(double desiredValue){
        WebElement slider = driver.findElement(sliderField);
        slider.click();
        int numPresses = (int) (desiredValue * 2);

        Actions action = new Actions(driver);
        if(numPresses > 0){
            for(int i = 0; i < numPresses; i++){

                action.sendKeys(Keys.ARROW_RIGHT).perform();
                action.sendKeys(Keys.ARROW_LEFT).perform();

            }
            action.sendKeys(Keys.ARROW_RIGHT).perform();
        }

    }


    public String getResult(){
        return driver.findElement(result).getText();
    }
}
