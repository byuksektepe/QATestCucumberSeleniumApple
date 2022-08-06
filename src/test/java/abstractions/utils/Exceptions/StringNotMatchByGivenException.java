package abstractions.utils.Exceptions;

import static org.junit.Assert.fail;

public class StringNotMatchByGivenException extends Throwable {

    public StringNotMatchByGivenException(String Given, String Received) {

        String exceptionMessage = String.format(
                "Given string '%s' is not match or equal received string '%s' value.\"",
                Given, Received);

        String currMethodName = new Throwable()
                .getStackTrace()[1]
                .getMethodName();
        String exClassName = this
                .getClass()
                .getSimpleName();
        fail(exClassName +" -> "+currMethodName +" -> "+exceptionMessage);
    }
}
