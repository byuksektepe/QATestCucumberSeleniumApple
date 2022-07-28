package abstractions.utils;

public interface IUtils {
    ClickElementMethods clickMethods = new ClickElementMethods();
    InputMethods inputMethods = new InputMethods();
    AssertionMethods assertionMethods = new AssertionMethods();

    DriverManager driverManager = new DriverManager();
}
