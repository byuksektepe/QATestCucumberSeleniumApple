package abstractions.utils.pageObjects.Mac.MacbookPro;

import abstractions.utils.UtilsInterface;
import abstractions.utils.Locators;

public class MBP implements UtilsInterface {

    private static final String selectorMainLocator = "//div[@id='compare-table-notebooks']";

    private static final String selectorMBP13Locator = selectorMainLocator + "//div[@class='mbp13 links']/a";
    private static final String selectorMBP14Locator = selectorMainLocator + "//div[@class='mbp14 links']/a";
    private static final String selectorMBP16Locator = selectorMainLocator + "//div[@class='mbp16 links']/a";

    /** Model Names **/
    public static final String O13 = "13 inch";
    public static final String O14 = "14 inch";
    public static final String O16 = "16 inch";

    public void selectMacbookPro13(){
        navigateMethods.scrollToElement(Locators.XPath, selectorMBP13Locator);
        clickMethods.click(Locators.XPath, selectorMBP13Locator);
    }

    public void selectMacbookPro14(){
        navigateMethods.scrollToElement(Locators.XPath, selectorMBP14Locator);
        clickMethods.click(Locators.XPath, selectorMBP14Locator);
    }

    public void selectMacbookPro16(){
        navigateMethods.scrollToElement(Locators.XPath, selectorMBP16Locator);
        clickMethods.click(Locators.XPath, selectorMBP16Locator);
    }
}
