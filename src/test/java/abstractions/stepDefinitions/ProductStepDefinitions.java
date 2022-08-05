package abstractions.stepDefinitions;

import abstractions.utils.Exceptions.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;

@RunWith(Cucumber.class)
public class ProductStepDefinitions implements StepDefinitionsInterface{

    private String ProductFamily;
    private String ModelFamily;
    private String Model;
    @And("Buy given: {string} product model")
    public void buyGivenProductModel(String Model)
            throws  ModelNotMatchByGivenException {
        productHelper.buyProductByGiven(ProductFamily, Model);
        this.Model = Model;
    }

    @And("Add product to bag")
    public void addProductToBag() {
        productHelper.addProductToTheBag();
    }

    @Then("Verify product added to bag")
    public void verifyProductAddedToBag() {
    }

    @And("Click navbar item {string}")
    public void clickNavbarItem(String ProductFamily)
            throws NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException,
            NavbarItemNotMatchByGivenException {

        navbar.navigateNavbarByGiven(ProductFamily);
        this.ProductFamily = ProductFamily;
    }

    @And("Verify family page opened")
    public void verifyFamilyPageOpened() throws StringNotContainsByGivenException {
        assertionMethods.verifyOpenedPageByGiven(ProductFamily);
    }

    @When("Click product: {string} button")
    public void clickProductButton(String ModelFamily) throws MacFamilyNotMatchByGivenException {
        productHelper.redirectToProductByGiven(ProductFamily, ModelFamily);
        this.ModelFamily = ModelFamily;
    }

    @And("Verify product page opened")
    public void verifyProductPageOpened() throws StringNotContainsByGivenException {
        assertionMethods.verifyOpenedPageByGiven(ModelFamily);
    }

    @And("Select given: {string} product configuration")
    public void selectGivenProductConfiguration(String Config)
            throws
            ConfigurationNotMatchByDefinedException,
            ModelNotMatchByGivenException {

        productHelper.selectProductConfigByGiven(ProductFamily, ModelFamily, Model, Config);
    }
}
