package abstractions.stepDefinitions;

import abstractions.helpers.NavigateHelper;
import abstractions.helpers.ProductHelper;
import abstractions.pageObjects.Bag;
import abstractions.pageObjects.Footer;
import abstractions.pageObjects.Mac.BuyMac.BuyMac;
import abstractions.utils.AssertionMethods;
import abstractions.pageObjects.Navbar;
import abstractions.pageObjects.SearchResults;
import abstractions.utils.NavigateMethods;

public interface StepDefinitionsInterface {
    Navbar navbar = new Navbar();
    Footer footer = new Footer();
    SearchResults searchResults = new SearchResults();
    NavigateHelper navigateHelper = new NavigateHelper();
    ProductHelper productHelper = new ProductHelper();
    Bag bag = new Bag();
    BuyMac buyMac = new BuyMac();
    AssertionMethods assertionMethods = new AssertionMethods();
    NavigateMethods navigateMethods = new NavigateMethods();
}
