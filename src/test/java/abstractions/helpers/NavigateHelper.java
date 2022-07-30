package abstractions.helpers;

import org.openqa.selenium.WebDriver;
import static abstractions.utils.Constants.MAIN_URL;

public class NavigateHelper extends AbstractHelper{

    public void navigateToTargetUrl(){

        getDriver().navigate().to(MAIN_URL);
        getDriverWait().waitUntilJSReady();
    }
}
