package abstractions.helpers;

import abstractions.utils.Exceptions.MacFamilyNotMatchByGivenException;

public class ProductHelper implements HelperInterface{

    public void redirectToProductByGiven(String Family, String ModelFamily) throws MacFamilyNotMatchByGivenException {
        Family = Family.toLowerCase();
        switch (Family){
            case "mac":
                mac.selectMacFamilyByGiven(ModelFamily);
        }

    }


}
