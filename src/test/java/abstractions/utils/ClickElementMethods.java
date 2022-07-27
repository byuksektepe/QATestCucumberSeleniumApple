package abstractions.utils;

import abstractions.helpers.AbstractHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClickElementMethods extends AbstractHelper implements Infrastructure {
    private final SelectElementByType selectElementByType = new SelectElementByType();
    private WebElement element = null;

    public void click(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        element.click();
    }

    public void forceClick(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", element);
    }
}
