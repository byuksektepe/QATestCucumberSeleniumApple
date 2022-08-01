package abstractions.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class ProductStepDefinitions {

    @And("Buy given: {string} product model")
    public void buyGivenProductModel(String Model) {
    }

    @And("Add product to bag")
    public void addProductToBag() {
    }

    @Then("Verify product added to bag")
    public void verifyProductAddedToBag() {
    }
}
