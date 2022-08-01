package abstractions.helpers;

import abstractions.utils.DriverWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractHelper implements HelperInterface{

    protected AbstractHelper(){
        PageFactory.initElements(dM.getDriver(), this);
    }

    public WebDriver getDriver() {
        return dM.getDriver();
    }

    public DriverWaits getDriverWait() {
        return dW;
    }

}
