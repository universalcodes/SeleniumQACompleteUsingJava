package d.chapter4.selenium.waitss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Duration.*;

public class DImplicitWait {


    /*
      Points to Remember
     
      1. Implicit Wait is a synchronization mechanism provided by
         Selenium WebDriver.
     
      2. It instructs WebDriver to wait for a specified maximum amount
         of time while locating an element if the element is not
         immediately available.
     
      3. Implicit Wait is applied globally to element searches performed
         by the particular WebDriver instance.
     
      4. The return type of implicitlyWait() is WebDriver.Timeouts.
     
      5. The argument type of implicitlyWait() is Duration.
     
         Syntax:
     
         driver.manage().timeouts()
               .implicitlyWait(Duration.ofSeconds(30));
     
     
      6. Different Duration units can be used:
     
         Duration.ofSeconds(30)
         Duration.ofMillis(5000)
         Duration.ofMinutes(1)
         Duration.ofHours(1)
         Duration.ofNanos(1000000000L)
         Duration.ofDays(1)
     
     
      7. Duration.ofMillis(5000) means a maximum timeout of 5000
         milliseconds, which is equal to 5 seconds.
     
      8. Duration.ofNanos(1000000000L) is equal to 1 second because:
     
         1 second = 1,000,000,000 nanoseconds.
     
     
      9. Implicit Wait does NOT mean that Selenium will always wait
         for the complete configured time.
     
         Example:
     
         implicitlyWait(Duration.ofSeconds(30));
     
         If the element is found after 3 seconds, Selenium can continue
         without waiting for the remaining 27 seconds.
     
     
      10. If the element cannot be located within the configured
          timeout, findElement() throws:
     
          NoSuchElementException
     
     
      11. Example:
     
         driver.manage().timeouts()
               .implicitlyWait(Duration.ofSeconds(30));
     
         driver.findElement(By.id("username"));
     
         If username element is not found within the configured timeout,
         Selenium throws NoSuchElementException.
     
     
      12. Implicit Wait is mainly applicable to element location
          operations such as findElement() and findElements().
     
     
      13. Implicit Wait is different from Thread.sleep().
     
         Thread.sleep(5000);
         -> Unconditionally pauses the current thread for 5 seconds.
     
         Implicit Wait:
         -> Waits while WebDriver is trying to locate an element,
            up to the configured maximum timeout.
     
     
      14. Negative Duration is not valid.
      
     RunTime Exception
                implicitlyWait(Duration.ofDays(-1)); // As -1 is not acceptable Value, its Throws an Run Time Exception
                Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument: value must be a non-negative integer

    
     
         Example:
     
         driver.manage().timeouts()
               .implicitlyWait(Duration.ofDays(-1));
     
         This results in an exception because the timeout value
         cannot be negative.
     
     
      15. Important:
     
         Implicit Wait is configured on a WebDriver instance and
         remains active for subsequent element searches until it is
         changed or reset.


  16. NoSuchElementException does NOT always mean that the element
      does not exist on the webpage.

      The element may actually be present on the webpage, but if
      the element is not available in the DOM / not located by
      WebDriver within the configured Implicit Wait timeout,
      findElement() can throw NoSuchElementException.

      Example:

      Implicit Wait = 2 seconds
      Website / element loading time = 5 seconds

      driver.manage().timeouts()
            .implicitlyWait(Duration.ofSeconds(2));

      driver.findElement(By.id("username"));

      If WebDriver cannot locate the element within 2 seconds,
      it can throw NoSuchElementException, even though the element
      may become available after 5 seconds.


      Important:

      Element actually exists eventually
               ↓
      But not located within Implicit Wait timeout
               ↓
      findElement() fails
               ↓
      NoSuchElementException
     
     */

    public static void main(String[] args) {

        System.out.println("1. Launch Browser with Implicit wait with 30 Seconds,");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        openBrowser.get("https://www.amazon.in/");
        WebElement searchBox = openBrowser.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.clear();
        searchBox.sendKeys("I Phone 17 Pro Max");
        System.out.println("Test Case is Completed Successfully");

        System.out.println("2.Check Element Implicit wait with 30 Seconds for Search the Product with Valid Element,");
        WebDriver openBrowserA = new ChromeDriver();
        openBrowserA.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        openBrowserA.get("https://www.amazon.in/");
        WebElement searchProduct = openBrowserA.findElement(By.xpath("//[contains(text(), 'Smartphones' )]"));
        boolean validateProduct = searchProduct.isDisplayed();
        System.out.println("The Result of Product as follows\t"+validateProduct);
        System.out.println("Test Case is Completed Successfully");

        /*
        Uncomment to Test
        In the following use case
        we have passed the invalid Element - (By.xpath("//[contains(text(), 'UA43UE86AHULXLT' )]"));
        it throws an exception as NoSuchElementException
        System.out.println("3.Check Element Implicit wait with 30 Seconds for Search the Product with Invalid Web Element,");
        WebDriver openBrowserB = new ChromeDriver();
        openBrowserB.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        openBrowserB.get("https://www.amazon.in/");
        WebElement searchProductA = openBrowserB.findElement(By.xpath("//[contains(text(), 'UA43UE86AHULXLT' )]"));
        boolean validateProductA = searchProductA.isDisplayed();
        System.out.println("The Result of Product as follows\t"+validateProductA);
        System.out.println("Test Case is Completed Successfully");



           In the following use case
        we have passed the invalid Element - (By.xpath("//[contains(text(), 'UA43UE86AHULXLT' )]"));
        it throws an exception as NoSuchElementException
        System.out.println("3.Check Element Implicit wait with 2 Seconds for Search the Product with Invalid Web Element,");
        WebDriver openBrowserB = new ChromeDriver();
        openBrowserB.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        openBrowserB.get("https://www.amazon.in/");
        WebElement searchProductA = openBrowserB.findElement(By.xpath("//[contains(text(), 'UA43UE86AHULXLT' )]"));
        boolean validateProductA = searchProductA.isDisplayed();
        System.out.println("The Result of Product as follows\t"+validateProductA);
        System.out.println("Test Case is Completed Successfully");
        */





    }
}
