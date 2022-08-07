package abstractions.pageObjects.Mac.BuyMac;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;
import org.openqa.selenium.By;

public class CustomizeMac implements MacInterface, UtilsInterface {

    private static final String ConfigurationHardwareLocator = "//div[@data-autom='productSummary']";
    public String getCustomizedMacHardware(){
        dW.waitForElementVisible(By.xpath(ConfigurationHardwareLocator));
        return assertionMethods.getElementText(Locators.XPath, ConfigurationHardwareLocator)+"accessorykit";
    }
}
