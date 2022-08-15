package abstractions.helpers;

import abstractions.utils.Exceptions.ConfigurationNotMatchByDefinedException;
import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import static abstractions.utils.Constants.ProductFamily._MAC;

public class ProductHelper implements HelperInterface, UtilsInterface {

    private static final String AddToBagButtonLocator = "//button[@data-autom='addToCart']";
    private static final String ReviewBagButtonLocator = "//button[@title='Review Bag']";

    /**
     * Stage 1 : Method to redirect to product by given;
     * @param Family : String : @Constants.ProductFamily -> _<Family_Name>
     * @param ModelFamily : String : @Constants.ProductFamily -> <Family_Name>_PRODUCT_FAMILY
     * @throws MacFamilyNotMatchByGivenException : Fail
     */
    public void redirectToProductByGiven(String Family,
                                         String ModelFamily)

            throws MacFamilyNotMatchByGivenException {
        Family = Family.toLowerCase();
        switch (Family){
            case _MAC: mac.selectMacFamilyByGiven(ModelFamily);
        }
    }

    /**
     * Stage 2 : Method to buy product by given;
     * @param Family : String : @Constants.ProductFamily -> _<Family_Name>
     * @param ModelFamily : String : @Constants.ProductFamily -> <Family_Name>_PRODUCT_FAMILY
     * @param Model : String : @pageObjects.<Family>.<ModelFamily>.<Models> -> Model.Name
     * @throws ModelNotMatchByGivenException : Fail
     */
    public void buyProductByGiven(String Family,
                                  String ModelFamily,
                                  String Model)

            throws ModelNotMatchByGivenException {

        Family = Family.toLowerCase();
        Model = Model.toLowerCase();

        switch (Family){
            case _MAC: buyMac.selectMacModelByGiven(ModelFamily, Model);
                break;
        }
    }

    /**
     * Stage 3 : Method to select product configuration by given;
     * @param Family : String : @Constants.ProductFamily -> _<Family_Name>
     * @param ModelFamily : String : @Constants.ProductFamily -> <Family_Name>_PRODUCT_FAMILY
     * @param Model : String : @pageObjects.<Family>.<ModelFamily>.<Models> -> Model.Name
     * @param Config : String : @pageObjects.<Family>.<ModelFamily>.<Models> -> Model.DefinedConfigurations
     * @throws ConfigurationNotMatchByDefinedException : Fail
     * @throws ModelNotMatchByGivenException : Fail
     */
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

    /**
     * Stage 4 : Method to get product title by given;
     * @param Family : String : @Constants.ProductFamily -> _<Family_Name>
     * @return : String : ProductTitle
     */
    public String getProductTitleByGiven(String Family){
        Family = Family.toLowerCase();
        switch (Family){
            case _MAC: return customizeMac.getCustomizedMacHardware();
            default: return null;
        }
    }

    /**
     * Method to add product to bag
     */
    public void addProductToTheBag(){
        clickMethods.click(Locators.XPath, AddToBagButtonLocator);

        boolean isElDisplayed = assertionMethods.isElementDisplayed(Locators.XPath, ReviewBagButtonLocator);
        if(isElDisplayed){ clickMethods.click(Locators.XPath, ReviewBagButtonLocator); }
    }
}
