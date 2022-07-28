package abstractions.utils.Exceptions;

public class StringNotContainsByGivenException extends Exception {
    public StringNotContainsByGivenException(String Given, String Received) {
        super(String.format("Given string '%s' is not contains received string '%s' value.", Given, Received));
    }
}
