package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("D:\\Projects\\testdriver_java\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getResultMessage(), "chromedriver.exe", "Incorrect file name or file");
    }
}
