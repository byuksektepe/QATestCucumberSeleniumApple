package abstractions.utils.Exceptions;

import java.util.Arrays;

import static abstractions.utils.Constants.ProductFamily.MAC_PRODUCT_FAMILY;
import static org.junit.Assert.fail;

public class MacFamilyNotMatchByGivenException extends Exception {
    public MacFamilyNotMatchByGivenException(String GivenMacFamily){
        String exceptionMessage = String.format("Given mac family name '%s' not match any defined mac family products '%s'.",
                GivenMacFamily, Arrays.toString(MAC_PRODUCT_FAMILY));

        String currMethodName = new Throwable()
                .getStackTrace()[1]
                .getMethodName();
        String exClassName = this
                .getClass()
                .getSimpleName();
        fail(exClassName +" -> "+currMethodName +" -> "+exceptionMessage);
    }
}
