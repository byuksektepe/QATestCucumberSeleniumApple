package abstractions.utils.Exceptions;

import java.util.Arrays;

import static abstractions.utils.Constants.MAC_PRODUCT_FAMILY;

public class MacFamilyNotMatchByGivenException extends Exception {
    public MacFamilyNotMatchByGivenException(String GivenMacFamily){
        super(String.format("Given mac family name '%s' not match any defined mac family products '%s'.",
                GivenMacFamily, Arrays.toString(MAC_PRODUCT_FAMILY)));
    }
}
