package abstractions.helpers;

import abstractions.utils.Exceptions.ConfigurationNotMatchByDefinedException;
import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import static abstractions.utils.Constants.ProductFamily._MAC;

public class ProductHelper implements HelperInterface, UtilsInterface {

    private static final String AddToBagButtonLocator = "//button[@value='add-to-cart']";

    public void redirectToProductByGiven(String Family,
                                         String ModelFamily)

            throws MacFamilyNotMatchByGivenException {
        Family = Family.toLowerCase();
        switch (Family){
            case _MAC: mac.selectMacFamilyByGiven(ModelFamily);
        }
    }

    public void buyProductByGiven(String Family,
                                  String Model)

            throws ModelNotMatchByGivenException {

        Family = Family.toLowerCase();
        Model = Model.toLowerCase();

        switch (Family){
            case _MAC: buyMac.selectMacModelByGiven(Model); break;
        }
    }

    public void selectProductConfigByGiven(String Family,
                                     String ModelFamily,
                                     String Model,
                                     String Config)
            throws
            ConfigurationNotMatchByDefinedException,
            ModelNotMatchByGivenException {

        Family = Family.toLowerCase();
        ModelFamily = ModelFamily.toLowerCase();
        Model = Model.toLowerCase();
        Config = Config.toLowerCase();

        switch (Family){
            case _MAC: buyMac.selectMacConfigurationByGiven(Model, ModelFamily, Config);
                break;
        }
    }

    public void addProductToTheBag(){
        clickMethods.click(Locators.XPath, AddToBagButtonLocator);
    }
}
