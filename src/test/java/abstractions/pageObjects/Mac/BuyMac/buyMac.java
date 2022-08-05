package abstractions.pageObjects.Mac.BuyMac;


import abstractions.pageObjects.Mac.MacInterface;
import abstractions.utils.Exceptions.ConfigurationNotMatchByDefinedException;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import java.util.Objects;

import abstractions.pageObjects.Mac.MacbookPro.MBP;
import  abstractions.pageObjects.Mac.MacbookPro.Models.*;


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
                                              String MacFamily,
                                              String GivenConfig)
            throws
            ModelNotMatchByGivenException,
            ConfigurationNotMatchByDefinedException {

        MacModel = MacModel.toLowerCase();
        MacFamily = MacFamily.toLowerCase();
        GivenConfig = GivenConfig.toLowerCase();

        boolean isConfigEx = true;

        if(Objects.equals(MacFamily, MBP.MacBookPro)) {
            switch (MacModel) {
                case MBP.O13:
                    for (String defined_config : MBP13.DefinedConfigurations) {
                        if (Objects.equals(defined_config, GivenConfig)) {
                            String ProceedMainButtonLocator = "//button[@class='button button-block' and " +
                                    "contains(@data-autom, '13inch-" + defined_config + "')]";
                            clickMethods.click(Locators.XPath, ProceedMainButtonLocator);
                            isConfigEx = false;
                            break;
                        }
                    }
                    break;
                case MBP.O14:
                    for (String defined_config : MBP14.DefinedConfigurations) {
                        if (Objects.equals(defined_config, GivenConfig)) {
                            String ProceedMainButtonLocator = "//button[@class='button button-block' and " +
                                    "contains(@data-autom, '14inch-" + defined_config + "')]";
                            clickMethods.click(Locators.XPath, ProceedMainButtonLocator);
                            isConfigEx = false;
                            break;
                        }
                    }
                    break;
                case MBP.O16:
                    for (String defined_config : MBP16.DefinedConfigurations) {
                        if (Objects.equals(defined_config, GivenConfig)) {
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
        }
        if (isConfigEx) { throw new ConfigurationNotMatchByDefinedException(GivenConfig);
        }
    }
}
