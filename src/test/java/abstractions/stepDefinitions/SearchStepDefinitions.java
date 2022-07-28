package abstractions.stepDefinitions;

import abstractions.helpers.AbstractHelper;
import abstractions.helpers.NavigateHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class SearchStepDefinitions extends AbstractHelper implements IStepDefinitions{


    @Given("^Navigate to Apple's site$")
    public void navigeToApplesSite(){
        navigateHelper.navigateToTargetUrl();
    }

    @And("search for product or item {string} in search bar")
    public void searchForProductOrItemInSearchBar(String SearchQuery) {
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
    }

    @Then("Verify expected item page opened")
    public void verifyExpectedItemPageOpened() {
    }
}
