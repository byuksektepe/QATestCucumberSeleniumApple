package abstractions.helpers;

import abstractions.pageObjects.Mac.BuyMac.buyMac;
import abstractions.pageObjects.Mac.Mac;
import abstractions.pageObjects.Navbar;
import abstractions.utils.DriverManager;
import abstractions.utils.DriverWaits;


public interface HelperInterface {
    DriverManager dM = new DriverManager();
    DriverWaits dW = new DriverWaits(dM);

    Mac mac = new Mac();
    buyMac buyMac = new buyMac();

}
