package abstractions.stepDefinitions;

import abstractions.helpers.NavigateHelper;
import abstractions.pageObjects.*;
import abstractions.utils.AssertionMethods;

public interface IStepDefinitions {
    Navbar navbar = new Navbar();
    Footer footer = new Footer();
    SearchResults searchResults = new SearchResults();
    NavigateHelper navigateHelper = new NavigateHelper();
    AssertionMethods assertionMethods = new AssertionMethods();
}
