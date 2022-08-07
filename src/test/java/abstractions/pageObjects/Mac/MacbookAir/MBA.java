package abstractions.pageObjects.Mac.MacbookAir;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

public class MBA implements MacInterface, UtilsInterface {

    private static final String selectorMainLocator = "//div[@id='compare-table-notebooks']";

    private static final String selectorMBAM1Locator = selectorMainLocator + "//div[@class='mba-m1 links']/a";
    private static final String selectorMBAM2Locator = selectorMainLocator + "//div[@class='mba-m2 links']/a";

    public static final String Name = "macbook air";

    public void buyMacbookAirM1(){
        clickMethods.click(Locators.XPath, selectorMBAM1Locator);
    }

    public void buyMacbookAirM2(){
        clickMethods.click(Locators.XPath, selectorMBAM2Locator);
    }


}
