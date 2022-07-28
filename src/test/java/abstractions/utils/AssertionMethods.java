package abstractions.utils;
import abstractions.helpers.AbstractHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static abstractions.utils.Constants.delayShort;

public class AssertionMethods extends AbstractHelper implements IUtils
{
    private final SelectElementByType selectElementByType = new SelectElementByType();

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

    public void isWait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}
