package abstractions.utils.Exceptions;

import static org.junit.Assert.fail;

public class ModelNotMatchByGivenException extends Exception{
    public ModelNotMatchByGivenException(String Given){
        String exceptionMessage = String.format("Given model string '%s' not match any models. Try '13 inch' or 'm1 chip'.",Given);

        String currMethodName = new Throwable()
                .getStackTrace()[1]
                .getMethodName();
        String exClassName = this
                .getClass()
                .getSimpleName();
        fail(exClassName +" -> "+currMethodName +" -> "+exceptionMessage);
    }
}
