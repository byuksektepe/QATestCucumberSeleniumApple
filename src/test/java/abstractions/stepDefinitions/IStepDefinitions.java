package abstractions.stepDefinitions;

import abstractions.helpers.NavigateHelper;
import abstractions.pageObjects.*;

public interface IStepDefinitions {
    Navbar navbar = new Navbar();
    Footer footer = new Footer();
    SearchResults searchResults = new SearchResults();
    NavigateHelper navigateHelper = new NavigateHelper();
}
