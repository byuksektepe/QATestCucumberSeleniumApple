package abstractions.helpers;

import org.openqa.selenium.WebDriver;

public class NavigateHelper extends AbstractHelper{
    private static final String TargetUrl = "https://www.apple.com/";
    private WebDriver driver = getDriver();

    public void navigateToTargetUrl(){

        driver.navigate().to(TargetUrl);
        getDriverWait().waitUntilJSReady();

    }
}
