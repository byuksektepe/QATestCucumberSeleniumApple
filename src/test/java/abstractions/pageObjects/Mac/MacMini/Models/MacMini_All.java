package abstractions.pageObjects.Mac.MacMini.Models;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.pageObjects.Mac.MacMini.MacMini;
import abstractions.utils.UtilsInterface;

public class MacMini_All extends MacMini implements MacInterface, UtilsInterface {

    public static final String Model = "all";

    public static final String[] DefinedConfigurations = {"good", "better", "ultimate"};
}
