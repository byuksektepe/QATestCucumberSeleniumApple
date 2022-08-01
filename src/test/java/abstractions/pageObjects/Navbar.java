package abstractions.pageObjects;

import abstractions.utils.UtilsInterface;
import org.openqa.selenium.NoSuchElementException;
import abstractions.utils.Locators;

public class Navbar implements UtilsInterface {

    /** Main Navbar Locator **/
    private static final String NavbarMainLocator = "//nav[@id='ac-globalnav']";
    /** Navbar Buttons Locators **/
    private static final String LogoLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-apple')]";
    private static final String StoreLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-store')]";
    private static final String MacLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-mac')]";
    private static final String IpadLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-ipad')]";
    private static final String IphoneLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-iphone')]";
    private static final String WatchLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-watch')]";
    private static final String AirpodsLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-airpods')]";
    private static final String TvHomeLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-tvhome')]";
    private static final String OnlyOnAppleLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-onlyonapple')]";
    private static final String AccessoriesLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-accessories')]";
    private static final String SupportLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-support')]";
    private static final String SearchButtonLocator = NavbarMainLocator+"//li[contains(@class, 'ac-gn-search') " +
                                                                        "and @role='search']";
    private static final String SearchInputLocator = NavbarMainLocator+"//input[@id='ac-gn-searchform-input']";
    public void VerifyNavbarIsVisible(){

        Boolean NavbarVerify = assertionMethods.isElementDisplayed(Locators.XPath, NavbarMainLocator);
        if(!NavbarVerify){ throw new NoSuchElementException("Navbar Element Is Not Visible"); }
    }

    public void ClickSearchButton(){
        clickMethods.click(Locators.XPath, SearchButtonLocator);
    }
    public void clickLogo(){
        clickMethods.click(Locators.XPath, LogoLocator);
    }

    public void clickStore(){
        clickMethods.click(Locators.XPath, StoreLocator);
    }

    public void clickMac(){
        clickMethods.click(Locators.XPath, MacLocator);
    }

    public void navigateNavbarByGiven(String ButtonName){
        ButtonName = ButtonName.toLowerCase();
        switch (ButtonName){
            case "logo":
                clickLogo();
            case "store":
                clickStore();
            case "mac":
                clickMac();
        }

    }

    public void EnterSearchQueryInSearchBar(String SearchQuery){
        inputMethods.enterTextAndHitEnter(Locators.XPath,
                                          SearchQuery, SearchInputLocator);
    }
}
