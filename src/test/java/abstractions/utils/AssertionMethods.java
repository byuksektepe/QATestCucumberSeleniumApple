package abstractions.utils;
import abstractions.helpers.AbstractHelper;
import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;
import org.junit.Test;

import static abstractions.utils.Constants.delayShort;

public class AssertionMethods extends AbstractHelper implements IUtils
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
        isWait(delayShort);
        return element.isDisplayed();
    }
    public WebElement FindElement(String locatorType, String locatorValue){

        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        return element;
    }
    public WebElement FindElementAndIgnoreErrors(String locatorType, String locatorValue){
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

    public void VerifyOpenedPageByGiven(String SearchQuery) throws StringNotContainsByGivenException {
        String pageTitle = this.getPageTitle().toLowerCase();
        SearchQuery = SearchQuery.toLowerCase();
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
