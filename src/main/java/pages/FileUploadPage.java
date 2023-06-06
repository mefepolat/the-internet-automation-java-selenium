package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    private By inputField = By.id("file-upload");

    private By uploadButton = By.id("file-submit");

    private By resultMessage = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getResultMessage(){
       return driver.findElement(resultMessage).getText();
    }
}
