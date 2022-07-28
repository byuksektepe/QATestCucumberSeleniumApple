package abstractions.utils.expectedConditions;

import abstractions.helpers.AbstractHelper;
import abstractions.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ClickabilityOfElementByLocator extends AbstractHelper implements ExpectedCondition<WebElement> {

    private final By locator;

    public ClickabilityOfElementByLocator(By locator) {
        this.locator = locator;
    }

    @Override
    public WebElement apply(WebDriver webDriver) {

        final Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Constants.timeoutShort));
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (StaleElementReferenceException | NoSuchElementException e) {
            return webDriver.findElement(locator);
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

}
