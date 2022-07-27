package abstractions.helpers;

import abstractions.utils.DriverManager;
import abstractions.utils.DriverWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractHelper {

    private final DriverManager driverManager = new DriverManager();
    private final DriverWaits driverWait = new DriverWaits(driverManager);
    protected AbstractHelper(){
        PageFactory.initElements(driverManager.getDriver(), this);
    }

    public WebDriver getDriver() {
        return driverManager.getDriver();
    }

    public DriverWaits getDriverWait() {
        return driverWait;
    }

    public void wait(String time) throws InterruptedException {
        Thread.sleep(Integer.parseInt(time));
    }
}
