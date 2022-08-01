package abstractions.utils;

public interface UtilsInterface {
    ClickElementMethods clickMethods = new ClickElementMethods();
    InputMethods inputMethods = new InputMethods();
    AssertionMethods assertionMethods = new AssertionMethods();
    NavigateMethods navigateMethods = new NavigateMethods();
    DriverManager dM = new DriverManager();
    DriverWaits dW = new DriverWaits(dM);
    SelectElementByType selectElementByType = new SelectElementByType();
}
