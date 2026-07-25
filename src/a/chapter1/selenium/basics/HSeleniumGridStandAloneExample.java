package a.chapter1.selenium.basics;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.URI;
import java.net.URL;

public class HSeleniumGridStandAloneExample {
    /*
        * This example demonstrates how to set up a Selenium Grid with a standalone server
        * Prequisites:
        *   1. Download Selenium Server JAR from the official Selenium website.
        *   1. Start the Selenium Grid standalone server on your machine
        * In the standalone server, you can specify the browser nodes (e.g., Chrome, Firefox) that will be available for testing.
        * There are different commands are used, for example,
        * Start the setup of Standalone Grid - F:\2025 Songs>java -jar selenium-server-4.38.0.jar standalone
        * http://100.71.39.224:4444/ui/# or http://localhost:4444/ui/#

     */
    public static void main(String[] args) throws Exception {
        // ✅ Recommended way to create URL in Java 21+
        URL gridUrl = URI.create("http://100.71.39.224:4444").toURL();

// Chrome setup
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPlatformName(Platform.WIN11.name());
        WebDriver chromeDriver = new RemoteWebDriver(gridUrl, chromeOptions);
        chromeDriver.get("https://www.google.com")  ;
        System.out.println("Chrome Title: " + chromeDriver.getTitle());
        chromeDriver.quit();

// Firefox setup
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setPlatformName(Platform.WIN11.name());
        WebDriver firefoxDriver = new RemoteWebDriver(gridUrl, firefoxOptions);
        firefoxDriver.get("https://www.google.com");
        System.out.println("Firefox Title: " + firefoxDriver.getTitle());
        firefoxDriver.quit();

    }
}
