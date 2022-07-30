package abstractions.utils;

import abstractions.helpers.AbstractHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigateMethods extends AbstractHelper implements UtilsInterface {
    private WebElement element = null;

    public void navigateToUrl(String url) {
        getDriver().get(url);
    }

    public void scrollToElement(String locatorType, String locatorValue) {
        element = getDriverWait().waitShort().until(ExpectedConditions.presenceOfElementLocated(selectElementByType.getelementbytype(locatorType, locatorValue)));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }
}
