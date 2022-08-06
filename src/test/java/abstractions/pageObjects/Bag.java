package abstractions.pageObjects;

import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import abstractions.utils.Exceptions.StringNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Objects;

public class Bag implements UtilsInterface {

    private static final String ProductTitleInBagLocator = "//div[@class='rs-iteminfo-details']" +
                                                         "//h2";
    public void verifyProductAddedToBagByGiven(String Title) throws StringNotContainsByGivenException {
        dW.waitForElementVisible(By.xpath(ProductTitleInBagLocator));
        String ReceivedTitleFromBag = assertionMethods.getElementText
                (Locators.XPath, ProductTitleInBagLocator);

        Title = Title.toLowerCase();
        ReceivedTitleFromBag = ReceivedTitleFromBag.toLowerCase();

        if(!(Title.contains(ReceivedTitleFromBag))){
            throw new StringNotContainsByGivenException(Title, ReceivedTitleFromBag);
        }
    }
}
