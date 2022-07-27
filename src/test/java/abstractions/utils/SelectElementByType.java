package abstractions.utils;

import org.openqa.selenium.By;

public class SelectElementByType {

    public By getelementbytype(String type, String value) {
        switch (type) {
            case Locators.Id:
                return By.id(value);
            case Locators.Name:
                return By.name(value);
            case Locators.Class:
                return By.className(value);
            case Locators.XPath:
                return By.xpath(value);
            case Locators.CSS:
                return By.cssSelector(value);
            case Locators.LinkText:
                return By.linkText(value);
            case Locators.PartialLinkText:
                return By.partialLinkText(value);
            case Locators.TagName:
                return By.tagName(value);
            default:
                return null;

        }
    }
}

