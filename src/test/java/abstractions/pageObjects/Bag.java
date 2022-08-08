package abstractions.pageObjects;

import abstractions.utils.Exceptions.StringNotContainsByGivenException;
import abstractions.utils.Exceptions.StringNotMatchByGivenException;
import abstractions.utils.Locators;
import abstractions.utils.UtilsInterface;
import org.openqa.selenium.By;

import java.util.Objects;

public class Bag implements UtilsInterface {

    private static final String ProductHardwareInBagLocator = "//div[@class='rs-macdetails']//ul[preceding-sibling::h3[1]='Hardware']";

    /**
     * Method to verify product added to bag by given;
     * @param Hardware
     * @throws StringNotMatchByGivenException
     */
    public void verifyProductAddedToBagByGiven(String Hardware) throws StringNotMatchByGivenException {

        assertionMethods.isWait(1000);
        String ReceivedHardwareFromBag = assertionMethods
                .getElementAttribute(Locators
                        .XPath, ProductHardwareInBagLocator, "textContent");

        String FormattedHardware = transformer
                .replaceAllNonCharValue(Hardware)
                .toLowerCase();

        ReceivedHardwareFromBag = transformer
                .replaceAllNonCharValue(ReceivedHardwareFromBag)
                .toLowerCase();

        if(!Objects.equals(FormattedHardware, ReceivedHardwareFromBag)){
            throw new StringNotMatchByGivenException(FormattedHardware, ReceivedHardwareFromBag);
        }
    }
}
