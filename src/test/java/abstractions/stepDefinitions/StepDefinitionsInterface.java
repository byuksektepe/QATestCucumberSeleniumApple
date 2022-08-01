package abstractions.stepDefinitions;

import abstractions.helpers.NavigateHelper;
import abstractions.utils.pageObjects.Footer;
import abstractions.utils.pageObjects.Mac.BuyMac.buyMac;
import abstractions.utils.AssertionMethods;
import abstractions.utils.pageObjects.Navbar;
import abstractions.utils.pageObjects.SearchResults;

public interface StepDefinitionsInterface {
    Navbar navbar = new Navbar();
    Footer footer = new Footer();
    SearchResults searchResults = new SearchResults();
    NavigateHelper navigateHelper = new NavigateHelper();

    buyMac buyMac = new buyMac();
    AssertionMethods assertionMethods = new AssertionMethods();
}
