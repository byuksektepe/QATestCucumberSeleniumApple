package abstractions.utils.Exceptions;
import java.util.Arrays;

import static abstractions.utils.Constants.Global.APPLE_NAVBAR_ITEMS;
import static org.junit.Assert.fail;


public class NavbarItemNotMatchByGivenException extends Exception{

    public NavbarItemNotMatchByGivenException(String NavbarItem){
        String exceptionMessage = String.format("Given navbar item name '%s' not match any defined navbar items '%s'.", NavbarItem, Arrays.toString(APPLE_NAVBAR_ITEMS));
        String currMethodName = new Throwable()
                .getStackTrace()[1]
                .getMethodName();
        String exClassName = this
                .getClass()
                .getSimpleName();
        fail(exClassName +" -> "+currMethodName +" -> "+exceptionMessage);

    }
}
