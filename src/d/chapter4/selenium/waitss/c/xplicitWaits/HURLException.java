package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HURLException {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("1. Validate Valid URL Address");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("https://www.amazon.in/");
        WebDriverWait explicitWaitValidate = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        explicitWaitValidate.until(ExpectedConditions.urlToBe("https://www.amazon.in/"));
        System.out.println("Test Case is Passed - Valid URL is Launched Successfully");

        /*
        System.out.println("2. Validate InValid URL Address");
        WebDriver openBrowserA = new ChromeDriver();
        openBrowserA.get("https://www.amazon.in/");
        WebDriverWait explicitWaitValidateA = new WebDriverWait(openBrowserA, Duration.ofSeconds(10));
        explicitWaitValidateA.until(ExpectedConditions.urlToBe("https://www.amaazon.in/"));  // As per the entered URL, Validated URL is not matched it throws an Exception TimeoutException
        */

        try {
            System.out.println("3. Validate InValid URL Address with Exception Handling");
            WebDriver openBrowserA = new ChromeDriver();
            openBrowserA.get("https://www.amazon.in/");
            WebDriverWait explicitWaitValidateA = new WebDriverWait(openBrowserA, Duration.ofSeconds(10));
            explicitWaitValidateA.until(ExpectedConditions.urlToBe("https://www.amaazon.in/"));  // As per the entered URL, Validated URL is not matched it throws an Exception TimeoutException
             }
        catch (TimeoutException invalidURLException) {
            System.out.println("Test Case is Failed - Invalid URL is not Launched Successfully\n"+ invalidURLException);



    }
}
}
