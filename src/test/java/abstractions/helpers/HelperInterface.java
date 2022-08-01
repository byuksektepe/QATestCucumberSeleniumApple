package abstractions.helpers;

import abstractions.utils.DriverManager;
import abstractions.utils.DriverWaits;

public interface HelperInterface {
    public final DriverManager dM = new DriverManager();
    public final DriverWaits dW = new DriverWaits(dM);
}
