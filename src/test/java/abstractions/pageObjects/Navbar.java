package abstractions.pageObjects;

import abstractions.utils.IUtils;
import org.openqa.selenium.NoSuchElementException;
import abstractions.utils.Locators;

public class Navbar implements IUtils {

    private static final String NavbarMainLocator = "//nav[@id='ac-globalnav']";
    private static final String SearchButtonLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-search') and @role='search']";
    private static final String SearchInputLocator = NavbarMainLocator+"//input[@id='ac-gn-searchform-input']";
    public void VerifyNavbarIsVisible(){

        Boolean NavbarVerify = assertionMethods.isElementDisplayed(Locators.XPath, NavbarMainLocator);
        if(!NavbarVerify){ throw new NoSuchElementException("Navbar Element Is Not Visible"); }
    }

    public void ClickSearchButton(){
        clickMethods.click(Locators.XPath, SearchButtonLocator);
    }

    public void EnterSearchQueryInSearchBar(String SearchQuery){
        inputMethods.enterTextAndHitEnter(Locators.XPath, SearchQuery, SearchInputLocator);
    }
}
