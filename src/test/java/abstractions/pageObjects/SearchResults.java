package abstractions.pageObjects;

import abstractions.utils.IUtils;
import abstractions.utils.Locators;
import org.openqa.selenium.WebElement;

public class SearchResults implements IUtils{

    private static final String SearchResultsVerifyLocator = "//div[@class='rf-serp-explore-details']" +
                                                             "/div[@class='rf-serp-resultcount']";
    private static final String FirstResultLocator = "//div[@class='rf-serp-explore-curated-position-1 rf-serp-curated-product']" +
                                                     "//h2[@class='rf-serp-productname']/a";

    public void VerifyPageLoad(){
        driverWaits.waitUntilJSReady();
        WebElement VerifyElement = assertionMethods.findElement(Locators.XPath,SearchResultsVerifyLocator);
    }

    public void ClickFirstResultInResults(){
        navigateMethods.scrollToElement(Locators.XPath, FirstResultLocator);
        clickMethods.click(Locators.XPath, FirstResultLocator);
    }


}
