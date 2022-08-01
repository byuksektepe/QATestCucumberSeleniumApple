package abstractions.stepDefinitions;

import abstractions.helpers.NavigateHelper;
import abstractions.pageObjects.Footer;
import abstractions.pageObjects.Mac.BuyMac.buyMac;
import abstractions.utils.AssertionMethods;
import abstractions.pageObjects.Navbar;
import abstractions.pageObjects.SearchResults;

public interface StepDefinitionsInterface {
    Navbar navbar = new Navbar();
    Footer footer = new Footer();
    SearchResults searchResults = new SearchResults();
    NavigateHelper navigateHelper = new NavigateHelper();

    buyMac buyMac = new buyMac();
    AssertionMethods assertionMethods = new AssertionMethods();
}
