package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.clickHotSpot();
        String message = contextMenuPage.getAlertMessage();
        contextMenuPage.acceptAlert();
        assertEquals(message, "You selected a context menu", "Alert message is incorrect");
    }
}
