package abstractions.pageObjects.Mac;

import abstractions.pageObjects.Mac.IMac.IMac;
import abstractions.pageObjects.Mac.MacMini.MacMini;
import abstractions.pageObjects.Mac.MacPro.MacPro;
import abstractions.pageObjects.Mac.MacStudio.MacStudio;
import abstractions.pageObjects.Mac.MacbookAir.MBA;
import abstractions.pageObjects.Mac.MacbookPro.MBP;

public interface MacInterface {

    MBP mbp = new MBP();
    MBA mba = new MBA();

    IMac imac = new IMac();

    MacMini macmini = new MacMini();

    MacStudio macstudio = new MacStudio();

    MacPro macpro = new MacPro();


}
