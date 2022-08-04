package abstractions.utils.Exceptions;

import java.util.Arrays;
import static org.junit.Assert.fail;

public class ConfigurationNotMatchByDefined extends Exception{
    public ConfigurationNotMatchByDefined(String GivenConfig){
        String exceptionMessage = String.format(
                "Given product configuration '%s' not match any defined configurations.",
                GivenConfig);

        String currMethodName = new Throwable()
                .getStackTrace()[1]
                .getMethodName();
        String exClassName = this
                .getClass()
                .getSimpleName();
        fail(exClassName +" -> "+currMethodName +" -> "+exceptionMessage);
    }
}
