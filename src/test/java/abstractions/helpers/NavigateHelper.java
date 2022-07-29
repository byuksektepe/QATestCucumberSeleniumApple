package abstractions.helpers;

import org.openqa.selenium.WebDriver;

public class NavigateHelper extends AbstractHelper{
    private static final String TargetUrl = "https://www.apple.com/";

    public void navigateToTargetUrl(){

        getDriver().navigate().to(TargetUrl);
        getDriverWait().waitUntilJSReady();

    }
}
