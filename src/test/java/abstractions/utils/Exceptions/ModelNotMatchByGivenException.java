package abstractions.utils.Exceptions;

public class ModelNotMatchByGivenException extends Exception{
    public ModelNotMatchByGivenException(String Given){
        super(String.format("Given model string '%s' not match any models. Try '13 inch' or 'm1 chip'.",Given));
    }
}
