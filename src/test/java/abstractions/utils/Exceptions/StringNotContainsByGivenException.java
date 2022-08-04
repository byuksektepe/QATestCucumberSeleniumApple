package abstractions.utils.Exceptions;

import static org.junit.Assert.fail;

public class StringNotContainsByGivenException extends Exception {
    public StringNotContainsByGivenException(String Given, String Received) {
        /** Replace fail(); to super(); if not work **/
        String exceptionMessage = String.format(
                "Given string '%s' is not contains received string '%s' value.\"",
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
