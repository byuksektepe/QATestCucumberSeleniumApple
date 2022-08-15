package abstractions.utils;
import abstractions.helpers.AbstractHelper;
import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static abstractions.utils.Constants.Global.DELAY_SHORT;


public class AssertionMethods extends AbstractHelper implements UtilsInterface
{
    private WebElement element = null;

    /**
     * Method to get element displayed status
     * @param locatorType : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     * @return boolean : (True, False)
     */
    public boolean isElementDisplayed(String locatorType, String locatorValue) {
        element = getDriverWait().waitLong().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        isWait(DELAY_SHORT);
        return element.isDisplayed();
    }

    /**
     * Method to find any element
     * @param locatorType  : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     * @return WebElement
     */
    public WebElement findElement(String locatorType, String locatorValue){

        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        return element;
    }

    /**
     * Method to find element and ignore no such element error.
     * @param locatorType  : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     * @return : WebElement or null
     */
    public WebElement findElementAndIgnoreErrors(String locatorType, String locatorValue){
        try
        {
            return getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Exception Ignored: "+ e);
            return null;
        }
    }

    /**
     *
     * @param element : WebElement : ElementName
     * @return : boolean (True, False)
     */
    public boolean isElementExists(WebElement element){
        if (element == null)
        { return false; }
        return true;
    }

    /**
     * Method to get current page title
     * @return : String : PageTitle
     */
    public String getPageTitle() {
        return getDriver().getTitle();
    }

    /**
     * Method to verify opened page by given;
     * @param SearchQuery : String : search query in feature file
     * @throws StringNotContainsByGivenException
     */
    public void verifyOpenedPageByGiven(String SearchQuery) throws StringNotContainsByGivenException {
        String pageTitle = this.getPageTitle().toLowerCase();
        SearchQuery = SearchQuery.toLowerCase();
        if(!pageTitle.contains(SearchQuery)) {
            throw new StringNotContainsByGivenException(SearchQuery, pageTitle);
        }
    }

    /**
     * Method to wait driver
     * @param ms : in milliseconds
     */
    public void isWait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * method to get attribute value
     *
     * @param locatorType   : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue  : String : Locator value
     * @param attributeName : String : attribute name
     * @return String
     */
    public String getElementAttribute(String locatorType, String locatorValue, String attributeName) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        return element.getAttribute(attributeName);
    }

    /**
     * Method to get element text
     *
     * @param locatorType  : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     * @return String
     */
    public String getElementText(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        return element.getText();

    }
}
