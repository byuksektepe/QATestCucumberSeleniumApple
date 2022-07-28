package abstractions.pageObjects;

import abstractions.utils.IUtils;
import org.openqa.selenium.NoSuchElementException;
import abstractions.utils.Locators;
import org.openqa.selenium.WebElement;

public class SearchResults implements IUtils{

    private static final String SearchResultsVerifyLocator = "//div[@class='rf-serp-explore-details']" +
                                                             "/div[@class='rf-serp-resultcount']";

    public void VerifyPageLoad(){
        driverWaits.waitUntilJSReady();
        WebElement VerifyElement = assertionMethods.FindElement(Locators.XPath,SearchResultsVerifyLocator);
    }
}
