package abstractions.pageObjects.Mac.BuyMac;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;
import org.openqa.selenium.By;

import static abstractions.utils.Constants.Global.MAIN_URL;

public class CustomizeMac implements MacInterface, UtilsInterface {

    private static final String ConfigurationHeaderLocator = "//h1[@data-autom='Mac-configuration-maintitle']";
    public String getCustomizedMacTitle(){
        dW.waitForElementVisible(By.xpath(ConfigurationHeaderLocator));
        return assertionMethods.getElementText(Locators.XPath, ConfigurationHeaderLocator);
    }
}
