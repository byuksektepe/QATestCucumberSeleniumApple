package abstractions.pageObjects;

import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;
import org.openqa.selenium.By;

public class Bag implements UtilsInterface {

    private static final String ProductTitleInBagLocator = "//div[@class='rs-iteminfo-details']" +
                                                           "//h2";
    public void verifyProductAddedToBagByGiven(String Title) throws StringNotContainsByGivenException {
        dW.waitForElementVisible(By.xpath(ProductTitleInBagLocator));

        String ReceivedTitleFromBag = assertionMethods
                .getElementText
                (Locators.XPath, ProductTitleInBagLocator);

        String FormattedTitle = transformer
                .replaceAllNonCharValue(Title)
                .toLowerCase();

        ReceivedTitleFromBag = transformer
                .replaceAllNonCharValue(ReceivedTitleFromBag)
                .toLowerCase();

        if(!(FormattedTitle.contains(ReceivedTitleFromBag))){
            throw new StringNotContainsByGivenException(FormattedTitle, ReceivedTitleFromBag);
        }
    }
}
