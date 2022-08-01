package abstractions.helpers;

import abstractions.pageObjects.Navbar;
import abstractions.utils.DriverManager;
import abstractions.utils.DriverWaits;

public interface HelperInterface {
    DriverManager dM = new DriverManager();
    DriverWaits dW = new DriverWaits(dM);

}
