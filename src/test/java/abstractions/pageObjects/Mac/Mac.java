package abstractions.pageObjects.Mac;

import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import java.util.Objects;

import static abstractions.utils.Constants.MAC_PRODUCT_FAMILY;

public class Mac implements UtilsInterface, MacInterface {
    private static final String ChapterNavLocator = "//nav[@id='chapternav']";

    public void selectMacFamilyByGiven(String MacFamily) throws MacFamilyNotMatchByGivenException {
        MacFamily = MacFamily.toLowerCase();
        boolean isEx = true;
        for (String mac_family : MAC_PRODUCT_FAMILY ) {
            if(Objects.equals(mac_family, MacFamily)){
                isEx = false;
                String FormattedMacFamily = MacFamily.replace(" ", "-");
                String ChapterNavLocatorWithProduct = ChapterNavLocator +
                        "//li[contains(@class,'chapternav-item-" + FormattedMacFamily + "')]";
                clickMethods.click(Locators.XPath, ChapterNavLocatorWithProduct);
                break;
            }
        }
        if (isEx) { throw new MacFamilyNotMatchByGivenException(MacFamily);
        }
    }
}
