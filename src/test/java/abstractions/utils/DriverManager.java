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
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
    private static WebDriver driver;

    /**
     * Default driver is edge. because pre-installed in windows devices.
     * @return webdriver
     */
    private static WebDriver setWebDriver() {
        String preferredDriver = System.getProperty("browser", "Edge");
        boolean headless = System.getProperty("headless", "false").equals("true");

        switch (preferredDriver.toLowerCase()) {
            case "safari":
                return new SafariDriver();
            case "edge":
                return new EdgeDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
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
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
                final FirefoxOptions ffOptions = new FirefoxOptions();

                if (headless) {
                    ffOptions.setHeadless(true);
                }
                return new FirefoxDriver(ffOptions);
            default:
                return new EdgeDriver();
        }
    }

    public WebDriver getDriver() {
            return driverThreadLocal.get();
    }
}
