package abstractions.utils;

public interface IUtils {
    ClickElementMethods clickMethods = new ClickElementMethods();
    InputMethods inputMethods = new InputMethods();
    AssertionMethods assertionMethods = new AssertionMethods();
    NavigateMethods navigateMethods = new NavigateMethods();
    DriverManager driverManager = new DriverManager();
    DriverWaits driverWaits = new DriverWaits(driverManager);
    SelectElementByType selectElementByType = new SelectElementByType();
}
