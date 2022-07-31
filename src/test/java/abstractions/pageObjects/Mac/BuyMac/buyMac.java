package abstractions.pageObjects.Mac.BuyMac;

import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.UtilsInterface;

import static abstractions.pageObjects.Mac.MacbookPro.MBP.O13;
import static abstractions.pageObjects.Mac.MacbookPro.MBP.O14;
import static abstractions.pageObjects.Mac.MacbookPro.MBP.O16;

public class buyMac implements UtilsInterface, MacInterface {

    public void selectMacByGiven(String Mac) throws ModelNotMatchByGivenException {
    Mac = Mac.toLowerCase();

        switch(Mac)
        {
            case O13:
                mbp.selectMacbookPro13();
            case O14:
                mbp.selectMacbookPro14();
            case O16:
                mbp.selectMacbookPro16();
            default:
                throw new ModelNotMatchByGivenException(Mac);
        }
    }
}
