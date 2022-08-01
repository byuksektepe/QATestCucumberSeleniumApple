package abstractions.utils;
import abstractions.helpers.AbstractHelper;
import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static abstractions.utils.Constants.DELAY_SHORT;

public class AssertionMethods extends AbstractHelper implements UtilsInterface
{
    private WebElement element = null;

    /**
     * method to get element status - displayed?
     *
     * @param locatorType : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     * @return Boolean
     */
    public boolean isElementDisplayed(String locatorType, String locatorValue) {
        element = getDriverWait().waitLong().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        isWait(DELAY_SHORT);
        return element.isDisplayed();
    }
    public WebElement findElement(String locatorType, String locatorValue){

        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        return element;
    }
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
    public boolean isElementExists(WebElement element){
        if (element == null)
        { return false; }
        return true;
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }

    public void verifyOpenedPageByGiven(String SearchQuery) throws StringNotContainsByGivenException {
        String pageTitle = this.getPageTitle().toLowerCase();
        SearchQuery = SearchQuery+"ededw".toLowerCase();
        if(!pageTitle.contains(SearchQuery)) {
            throw new StringNotContainsByGivenException(SearchQuery, pageTitle);
        }
    }

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
}
