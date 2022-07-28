package abstractions.stepDefinitions;

import abstractions.helpers.AbstractHelper;
import StringNotContainsByGivenException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class SearchStepDefinitions extends AbstractHelper implements IStepDefinitions{

    private String ReceivedSearchQuery;

    @Given("^Navigate to Apple's site$")
    public void navigeToApplesSite(){
        navigateHelper.navigateToTargetUrl();
    }

    @And("search for product or item {string} in search bar")
    public void searchForProductOrItemInSearchBar(String SearchQuery) {
        ReceivedSearchQuery = SearchQuery;
        navbar.VerifyNavbarIsVisible();
        navbar.ClickSearchButton();
        navbar.EnterSearchQueryInSearchBar(SearchQuery);
    }

    @And("Verify Search executed")
    public void verifySearchExecuted() {
        searchResults.VerifyPageLoad();
    }

    @When("Click first result in results")
    public void clickFirstResultInResults() {
        searchResults.ClickFirstResultInResults();
    }

    @Then("Verify expected item page opened")
    public void verifyExpectedItemPageOpened() throws StringNotContainsByGivenException {
        searchResults.VerifyOpenedPageByGiven(ReceivedSearchQuery);
    }
}
