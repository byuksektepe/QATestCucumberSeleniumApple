package abstractions.helpers;

import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;

import java.util.Objects;

import static abstractions.utils.Constants.ProductFamily._MAC;


public class ProductHelper implements HelperInterface{

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

            throws MacFamilyNotMatchByGivenException,
            ModelNotMatchByGivenException {

        Family = Family.toLowerCase();
        Model = Model.toLowerCase();

        switch (Family){
            case _MAC: buyMac.selectMacModelByGiven(Model); break;
        }
    }
}
