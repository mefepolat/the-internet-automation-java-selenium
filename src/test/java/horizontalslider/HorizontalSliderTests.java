package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void setHorizontalSlideRange(){
        var horizontalSliderPage = homePage.clickHorizontalSliderLink();
        double sliderRange = 3;
        horizontalSliderPage.setSliderRange(sliderRange);
        assertEquals(horizontalSliderPage.getResult(), String.valueOf(sliderRange), "Result and adjusted range do not match.");
    }
}
