package abstractions.pageObjects;

import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;

import java.util.Objects;

public class Bag implements UtilsInterface {

    private static final String ProductUrlInBagLocator = "//div[@class='rs-iteminfo-details']" +
                                                         "//h2/a";
    public void verifyProductAddedToBagByGiven(String Url) throws Exception {
        String ReceivedUrlFromBag = assertionMethods.getElementAttribute
                (Locators.XPath, ProductUrlInBagLocator, "href");
        if(!Objects.equals(Url, ReceivedUrlFromBag)){
            throw new Exception("lol");
        }
    }
}
