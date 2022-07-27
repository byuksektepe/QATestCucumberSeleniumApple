package abstractions.pageObjects;

import abstractions.utils.IUtils;
import org.openqa.selenium.NoSuchElementException;
import abstractions.utils.Locators;

public class Navbar implements IUtils {

    private static final String NavbarVerifyLocator = "//nav[@id='ac-globalnav']";
    public void VerifyNavbarIsVisible(){
        Boolean NavbarVerify = assertionMethods.isElementDisplayed(Locators.XPath, NavbarVerifyLocator);
        if(!NavbarVerify){ throw new NoSuchElementException("Element Is Not Visible"); }
    }
}
