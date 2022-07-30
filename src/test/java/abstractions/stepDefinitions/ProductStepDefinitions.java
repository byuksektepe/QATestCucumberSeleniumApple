package abstractions.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductStepDefinitions {
    @And("Select given: {string} product")
    public void selectGivenProduct(String Model) {
    }

    @And("Add product to bag")
    public void addProductToBag() {
    }

    @Then("Verify product added to bag")
    public void verifyProductAddedToBag() {
    }
}
