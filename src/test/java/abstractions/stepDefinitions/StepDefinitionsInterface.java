package abstractions.stepDefinitions;

import abstractions.helpers.NavigateHelper;
import abstractions.pageObjects.*;
import abstractions.pageObjects.Mac.BuyMac.buyMac;
import abstractions.utils.AssertionMethods;

public interface StepDefinitionsInterface {
    Navbar navbar = new Navbar();
    Footer footer = new Footer();
    SearchResults searchResults = new SearchResults();
    NavigateHelper navigateHelper = new NavigateHelper();

    buyMac buyMac = new buyMac();
    AssertionMethods assertionMethods = new AssertionMethods();
}
