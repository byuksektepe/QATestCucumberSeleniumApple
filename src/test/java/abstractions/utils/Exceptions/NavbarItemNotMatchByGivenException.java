package abstractions.utils.Exceptions;
import java.util.Arrays;

import static abstractions.utils.Constants.Global.APPLE_NAVBAR_ITEMS;


public class NavbarItemNotMatchByGivenException extends Exception{

    public NavbarItemNotMatchByGivenException(String NavbarItem){
        super(String.format("Given navbar item name '%s' not match any defined navbar items '%s'.", NavbarItem, Arrays.toString(APPLE_NAVBAR_ITEMS)));
    }
}
