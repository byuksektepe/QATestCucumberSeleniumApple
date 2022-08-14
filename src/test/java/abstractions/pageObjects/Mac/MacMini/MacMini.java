package abstractions.pageObjects.Mac.MacMini;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

public class MacMini implements MacInterface, UtilsInterface {

    public static final String Name = "mac mini";

    private static final String selectorMacMiniLocator =  "//div[@class='ac-ln-actions']" +
                                                         "//a[@class='ac-ln-button']";

    public void buyMacMini(){
        clickMethods.click(Locators.XPath, selectorMacMiniLocator);
    }

}
