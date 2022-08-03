package abstractions.pageObjects.Mac;

import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import java.util.Objects;

import static abstractions.utils.Constants.MAC_PRODUCT_FAMILY;

public class Mac implements UtilsInterface, MacInterface {
    private static final String ChapterNavLocator = "//nav[@id='chapternav']";

    private static final String navMacbookAirLocator = ChapterNavLocator +
            "//li[contains(@class,'chapternav-item-macbook-air')]";
    private static final String navMacbookProLocator = ChapterNavLocator +
            "//li[contains(@class,'chapternav-item-macbook-pro')]";

    public void selectMacFamilyByGiven(String MacFamily){
        MacFamily = MacFamily.toLowerCase();
        for (String mac_family : MAC_PRODUCT_FAMILY ) {
            if(Objects.equals(mac_family, MacFamily)){

            }
        }
    }
}
