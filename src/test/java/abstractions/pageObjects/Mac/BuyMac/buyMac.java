package abstractions.pageObjects.Mac.BuyMac;

import abstractions.pageObjects.Mac.MacbookPro.MBP;
import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.UtilsInterface;

public class buyMac implements UtilsInterface, MacInterface {

    public void selectMacModelByGiven(String MacModel) throws ModelNotMatchByGivenException {
        MacModel = MacModel.toLowerCase();

        switch(MacModel)
        {
            case MBP.O13:
                mbp.selectMacbookPro13(); break;
            case MBP.O14:
                mbp.selectMacbookPro14(); break;
            case MBP.O16:
                mbp.selectMacbookPro16(); break;
            default:
                throw new ModelNotMatchByGivenException(MacModel);
        }
    }
}
