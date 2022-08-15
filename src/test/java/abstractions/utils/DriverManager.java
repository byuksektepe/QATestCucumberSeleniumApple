package abstractions.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;


public class DriverManager {
    private static WebDriver driver;
    private static final Boolean IsHeadless = false;

    /**
     * Default driver is edge. because pre-installed in windows devices.
     * If you are using MacOs, change default driver to SafariDriver()
     * @return WebDriver
     */
    private WebDriver choseDriver() {
        String preferredDriver = getDriverProperty();
        boolean headless = IsHeadless;

        switch (preferredDriver.toLowerCase()) {
            case "safari":
                return new SafariDriver();
            case "edge":
                return new EdgeDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                final ChromeOptions chromeOptions = new ChromeOptions();

                if (headless) {
                    chromeOptions.addArguments("--headless");
                }

                chromeOptions.addArguments("--disable-site-isolation-trials");
                chromeOptions.addArguments("disable-infobars");
                chromeOptions.addArguments("--disable-extensions");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--disable-notifications");

                return new ChromeDriver(chromeOptions);
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                final FirefoxOptions ffOptions = new FirefoxOptions();

                if (headless) {
                    ffOptions.setHeadless(true);
                }
                return new FirefoxDriver(ffOptions);
            default:
                return new EdgeDriver();
        }
    }

    /**
     * Gets Browser selection from VM Options setting.
     * Arguments: key: -Ddrivers.browser=<browser>
     * Arguments: def: <browser>
     * Possible Options: chrome, edge, firefox and safari (in Mac OS)
     * @return String
     */
    private String getDriverProperty(){
        return System.getProperty(
                "browser",
                "chrome");
    }

    public void setDriver(){

        driver = choseDriver();
        driver.manage().window().maximize();
    }

    public void destroyDriver(){
        if(driver != null){
            driver.quit();
        }
    }
    public WebDriver getDriver() {
        return driver;
    }
}
