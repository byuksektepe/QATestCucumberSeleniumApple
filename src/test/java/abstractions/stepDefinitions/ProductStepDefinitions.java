package abstractions.stepDefinitions;

import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class ProductStepDefinitions implements StepDefinitionsInterface{

    private String ProductFamily;
    @And("Buy given: {string} product model")
    public void buyGivenProductModel(String Model) {
    }

    @And("Add product to bag")
    public void addProductToBag() {
    }

    @Then("Verify product added to bag")
    public void verifyProductAddedToBag() {
    }

    @And("Click navbar item {string}")
    public void clickNavbarItem(String ProductFamily) {
        this.ProductFamily = ProductFamily;
        navbar.navigateNavbarByGiven(ProductFamily);
    }

    @And("Verify family page opened")
    public void verifyFamilyPageOpened() throws StringNotContainsByGivenException {
        assertionMethods.verifyOpenedPageByGiven(ProductFamily);
    }

    @When("Click product: {string} button")
    public void clickProductButton(String arg0) {
    }

    @And("Verify product page opened")
    public void verifyProductPageOpened() {
    }

    @And("Select given: {string} product configuration")
    public void selectGivenProductConfiguration(String arg0) {
    }
}
