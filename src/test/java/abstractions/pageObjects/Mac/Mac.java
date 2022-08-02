package abstractions.pageObjects.Mac;

import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

public class Mac implements UtilsInterface, MacInterface {
    private static final String ChapterNavLocator = "//nav[@id='chapternav']";

    private static final String navMacbookAirLocator = ChapterNavLocator +
            "//li[contains(@class,'chapternav-item-macbook-air')]";
    private static final String navMacbookProLocator = ChapterNavLocator +
            "//li[contains(@class,'chapternav-item-macbook-pro')]";

    public void clickNavMBA(){
        clickMethods.click(Locators.XPath, navMacbookAirLocator);
    }

    public void clickNavMBP(){
        clickMethods.click(Locators.XPath, navMacbookProLocator);
    }

}
