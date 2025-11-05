package a.Seleniumm.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.URI;
import java.net.URL;

public class SeleniumGridExample {
    public static void main(String[] args) throws Exception {
        // ✅ Recommended way to create URL in Java 21+
        URL gridUrl = URI.create("http://localhost:4444/wd/hub").toURL();

        // Chrome setup
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver chromeDriver = new RemoteWebDriver(gridUrl, chromeOptions);
        chromeDriver.get("https://www.google.com");
        System.out.println("Chrome Title: " + chromeDriver.getTitle());
        chromeDriver.quit();

        // Firefox setup
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        WebDriver firefoxDriver = new RemoteWebDriver(gridUrl, firefoxOptions);
        firefoxDriver.get("https://www.google.com");
        System.out.println("Firefox Title: " + firefoxDriver.getTitle());
        firefoxDriver.quit();
    }
}
