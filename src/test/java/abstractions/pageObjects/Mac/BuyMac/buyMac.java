package abstractions.pageObjects.Mac.BuyMac;

import abstractions.pageObjects.Mac.MacbookPro.MBP;
import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Exceptions.ConfigurationNotMatchByDefined;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import java.util.Objects;

import static abstractions.pageObjects.Mac.MacbookPro.Models.MBP13.DefinedConfigurations_13;
import static abstractions.pageObjects.Mac.MacbookPro.Models.MBP14.DefinedConfigurations_14;
import static abstractions.pageObjects.Mac.MacbookPro.Models.MBP16.DefinedConfigurations_16;

public class buyMac implements UtilsInterface, MacInterface {

    public void selectMacModelByGiven(String MacModel) throws ModelNotMatchByGivenException {
        MacModel = MacModel.toLowerCase();

        switch(MacModel)
        {
            case MBP.O13:
                mbp.buyMacbookPro13(); break;
            case MBP.O14:
                mbp.buyMacbookPro14(); break;
            case MBP.O16:
                mbp.buyMacbookPro16(); break;
            default:
                throw new ModelNotMatchByGivenException(MacModel);
        }
    }

    public void selectMacConfigurationByGiven(String MacModel,
                                              String GivenConfig)
            throws
            ModelNotMatchByGivenException,
            ConfigurationNotMatchByDefined {

        MacModel = MacModel.toLowerCase();
        GivenConfig = GivenConfig.toLowerCase();
        boolean isConfigEx = true;

        switch(MacModel)
        {
            case MBP.O13:
                for (String defined_config : DefinedConfigurations_13) {
                    if(Objects.equals(defined_config, GivenConfig)){
                        String ProceedMainButtonLocator = "//button[@class='button button-block' and " +
                                "contains(@data-autom, '13inch-" + defined_config + "')]";
                        clickMethods.click(Locators.XPath, ProceedMainButtonLocator);
                        isConfigEx = false;
                        break;
                    }
                }
                break;
            case MBP.O14:
                for (String defined_config : DefinedConfigurations_14) {
                    if(Objects.equals(defined_config, GivenConfig)){
                        String ProceedMainButtonLocator = "//button[@class='button button-block' and " +
                                "contains(@data-autom, '14inch-" + defined_config + "')]";
                        clickMethods.click(Locators.XPath, ProceedMainButtonLocator);
                        isConfigEx = false;
                        break;
                    }
                }
                break;
            case MBP.O16:
                for (String defined_config : DefinedConfigurations_16) {
                    if(Objects.equals(defined_config, GivenConfig)){
                        String ProceedMainButtonLocator = "//button[@class='button button-block' and " +
                                "contains(@data-autom, '16inch-" + defined_config + "')]";
                        clickMethods.click(Locators.XPath, ProceedMainButtonLocator);
                        isConfigEx = false;
                        break;
                    }
                }
                break;
            default:
                throw new ModelNotMatchByGivenException(MacModel);
        }
        if (isConfigEx) { throw new ConfigurationNotMatchByDefined(GivenConfig);
        }
    }
}
