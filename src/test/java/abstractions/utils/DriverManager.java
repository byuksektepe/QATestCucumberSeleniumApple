package abstractions.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class DriverManager {
    private static WebDriver driver;
    private static final String SelectedBrowser = "chrome";
    private static final Boolean IsHeadless = false;

    /**
     * Default driver is edge. because pre-installed in windows devices.
     * @return webdriver
     */
    private static WebDriver choseDriver() {
        String preferredDriver = SelectedBrowser;
        boolean headless = IsHeadless;

        switch (preferredDriver.toLowerCase()) {
            case "safari":
                return new SafariDriver();
            case "edge":
                return new EdgeDriver();
            case "chrome":
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
                final FirefoxOptions ffOptions = new FirefoxOptions();

                if (headless) {
                    ffOptions.setHeadless(true);
                }
                return new FirefoxDriver(ffOptions);
            default:
                return new EdgeDriver();
        }
    }

    public void setDriver(){
        driver = choseDriver();
    }
    public void destroyDriver(){
        driver.quit();
    }
    public WebDriver getDriver() {
            return driver;
    }
}
