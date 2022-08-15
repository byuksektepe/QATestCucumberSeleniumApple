package abstractions.pageObjects.Mac;

import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import java.util.Objects;

import static abstractions.utils.Constants.ProductFamily.MAC_PRODUCT_FAMILY;

public class Mac implements UtilsInterface, MacInterface {
    private static final String ChapterNavLocator = "//nav[@id='chapternav']";

    /**
     * ! Only _MAC !
     * Method to Select Mac Family By Given MacFamily
     * Given Mac Family must be equal pre-defined MAC_PRODUCT_FAMILY
     * @param MacFamily : String : @Constants.ProductFamily -> MAC_PRODUCT_FAMILY
     * @throws MacFamilyNotMatchByGivenException : Fail
     */
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
