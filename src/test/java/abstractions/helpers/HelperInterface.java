package abstractions.helpers;

import abstractions.pageObjects.Mac.BuyMac.BuyMac;
import abstractions.pageObjects.Mac.BuyMac.CustomizeMac;
import abstractions.pageObjects.Mac.Mac;
import abstractions.utils.DriverManager;
import abstractions.utils.DriverWaits;


public interface HelperInterface {
    DriverManager dM = new DriverManager();
    DriverWaits dW = new DriverWaits(dM);

    Mac mac = new Mac();
    BuyMac buyMac = new BuyMac();
    CustomizeMac customizeMac = new CustomizeMac();

}
