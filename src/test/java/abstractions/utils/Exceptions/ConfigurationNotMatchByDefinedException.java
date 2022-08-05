package abstractions.utils.Exceptions;

import static org.junit.Assert.fail;

public class ConfigurationNotMatchByDefinedException extends Exception{
    public ConfigurationNotMatchByDefinedException(String GivenConfig){
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
