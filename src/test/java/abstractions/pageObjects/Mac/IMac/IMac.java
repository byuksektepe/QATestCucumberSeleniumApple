package abstractions.pageObjects.Mac.IMac;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

public class IMac implements MacInterface, UtilsInterface {

    public static final String Name = "imac 24";

    private static final String selectorIMAC24Locator =  "//div[@class='ac-ln-actions']" +
                                                        "//a[@class='ac-ln-button']";

    public void buyIMac24(){
        clickMethods.click(Locators.XPath, selectorIMAC24Locator);
    }
}
