package abstractions.helpers;

import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;
import abstractions.utils.Exceptions.ModelNotMatchByGivenException;

import java.util.Objects;


public class ProductHelper implements HelperInterface{

    public void redirectToProductByGiven(String Family,
                                         String ModelFamily)

            throws MacFamilyNotMatchByGivenException {
        Family = Family.toLowerCase();
        switch (Family){
            case "mac": mac.selectMacFamilyByGiven(ModelFamily);
        }
    }

    public void buyProductByGiven(String Family,
                                  String Model)

            throws MacFamilyNotMatchByGivenException,
            ModelNotMatchByGivenException {

        Family = Family.toLowerCase();
        Model = Model.toLowerCase();

        switch (Family){
            case "mac": buyMac.selectMacModelByGiven(Model); break;
        }
    }
}
