package abstractions.pageObjects;

import abstractions.utils.Exceptions.NavbarItemNotMatchByGivenException;
import abstractions.utils.UtilsInterface;
import java.lang.reflect.*;
import org.openqa.selenium.NoSuchElementException;
import abstractions.utils.Locators;

import java.util.Objects;

import static abstractions.utils.Constants.Global.APPLE_NAVBAR_ITEMS;


public class Navbar implements UtilsInterface {

    /** Main Navbar Locator **/
    private static final String NavbarMainLocator = "//nav[@id='ac-globalnav']";
    /** Navbar Button Locators **/
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

    public void navigateNavbarByGiven(String navbarItem)
            throws NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException,
            NavbarItemNotMatchByGivenException {

        navbarItem = navbarItem.toLowerCase();
        boolean isEx = true;

        for (String navbar_item : APPLE_NAVBAR_ITEMS) {
            if(Objects.equals(navbar_item, navbarItem)){
                Method method = Navbar.class.getDeclaredMethod("_" + navbar_item);
                method.invoke(null);
                isEx = false;
                break;
            }
        }

        if(isEx)  { throw new NavbarItemNotMatchByGivenException(navbarItem); }
    }

    public static void _logo() { clickMethods.click(Locators.XPath, LogoLocator); }
    public static void _store() { clickMethods.click(Locators.XPath, StoreLocator); }
    public static void _mac() { clickMethods.click(Locators.XPath, MacLocator); }

    public void EnterSearchQueryInSearchBar(String SearchQuery){
        inputMethods.enterTextAndHitEnter(Locators.XPath,
                                          SearchQuery, SearchInputLocator);
    }
}
