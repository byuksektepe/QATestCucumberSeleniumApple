package abstractions.pageObjects.Mac.MacPro;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.UtilsInterface;

public class MacPro implements MacInterface, UtilsInterface {

    public static final String Name = "mac pro";

    public static final String[] DefinedConfigurations = {"desktop", "rackmount"};
}
