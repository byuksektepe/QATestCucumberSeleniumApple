package abstractions.utils;

import abstractions.helpers.AbstractHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClickElementMethods extends AbstractHelper implements UtilsInterface {
    private WebElement element = null;

    /**
     * Method to regular-click
     * @param locatorType : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     */
    public void click(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        element.click();
    }

    /**
     * Method to force-click
     * @param locatorType : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     */
    public void forceClick(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    /**
     * Method to double-click
     * @param locatorType : String : Locator type (id, name, class, xpath, css)
     * @param locatorValue : String : Locator value
     */
    public void doubleClick(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        Actions action = new Actions(getDriver());
        action.moveToElement(element).doubleClick().perform();
    }
}
