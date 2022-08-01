package abstractions.utils.pageObjects.Mac.BuyMac;

import abstractions.utils.pageObjects.Mac.MacInterface;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.UtilsInterface;
import abstractions.utils.pageObjects.Mac.MacbookPro.MBP;

public class buyMac implements UtilsInterface, MacInterface {

    public void selectMacByGiven(String Mac) throws ModelNotMatchByGivenException {
    Mac = Mac.toLowerCase();

        switch(Mac)
        {
            case MBP.O13:
                mbp.selectMacbookPro13();
            case MBP.O14:
                mbp.selectMacbookPro14();
            case MBP.O16:
                mbp.selectMacbookPro16();
            default:
                throw new ModelNotMatchByGivenException(Mac);
        }
    }
}
