package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LTextVisibleException {
    public static void main(String[] args) {
        System.out.println("1. Validate Valid Text Present in the Webpage");
        String visibleText = "Selenium Explicit Wait Practice Lab";
        String visibleTextA = "Explicit Wait Practice";
        String xpathLocator = "//h1[text()='Selenium Explicit Wait Practice Lab']";
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait explicitWaitValidate = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        explicitWaitValidate.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathLocator), visibleText));
        System.out.println("TC is Passed");


        /*
        As the following text is not for specific locator its throws TimeOut Exception
        System.out.println("1. Validate InValid Text Present in the Webpage");
        String visibleTextA = "Selenium Explicit Wait Practice Lab Test";
        String xpathLocatorA = "//h1[text()='Selenium Explicit Wait Practice Lab']";
        WebDriver openBrowserA = new ChromeDriver();
        openBrowserA.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait explicitWaitValidateA = new WebDriverWait(openBrowserA, Duration.ofSeconds(10));
        explicitWaitValidateA.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathLocatorA), visibleTextA));
        System.out.println("Failed is Passed");

        */
        try {
            System.out.println("3. Validate InValid Text Present in the Webpage");
            String visibleTextAA = "Selenium Explicit Wait Practice Lab Test";
            String xpathLocatorA = "//h1[text()='Selenium Explicit Wait Practice Lab']";
            String xpathContainsLocatorr = "//h1[contains(text(), 'Explicit Wait Practice')]";

            WebDriver openBrowserA = new ChromeDriver();
            openBrowserA.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
            WebDriverWait explicitWaitValidateA = new WebDriverWait(openBrowserA, Duration.ofSeconds(10));
         //   explicitWaitValidateA.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathLocatorA), visibleTextA));
              explicitWaitValidateA.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpathContainsLocatorr), visibleTextA));
            System.out.println("TC  is Passed");
        }
        catch(TimeoutException checkTextException)
        {
           String exceptionMessage =  checkTextException.getMessage();
            System.out.println(exceptionMessage);
        }


        System.out.println("4. Validate the Test ");
    }
}
