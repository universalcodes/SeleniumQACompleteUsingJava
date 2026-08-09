package d.chapter4.selenium.waitss;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CPageLoadTimeout {

    /*
  Points to Remember

  1. pageLoadTimeout() is an inbuilt timeout method of Selenium.
     the arg type of pageLoadTimeout is 
         pageLoadTimeout(Duration.ofSeconds(30))
        pageLoadTimeout(Duration.ofMillis(5000));   // Here Script wait for fix 5000 milliseconds which means fix 5 Seconds
        pageLoadTimeout(Duration.ofMinutes(1));   // Here Script wait for fix minute
        pageLoadTimeout(Duration.ofHours(1));   // Here Script wait for fix an Hour
        pageLoadTimeout(Duration.ofNanos(34567));   // Here Script wait for fix 34567 nano
        pageLoadTimeout(Duration.ofNanos(1000000000l)); //Here Script wait for fix an 1000000000 nanos which means fix 1 Second
        pageLoadTimeout(Duration.ofDays(1)); //Here Script wait for 1 Day


     RunTime Exception
                pageLoadTimeout(Duration.ofDays(-1)); // As -1 is not acceptable Value, its Throws an Run Time Exception
                Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument: value must be a non-negative integer


  2. It defines the maximum time WebDriver should wait
     for a web page to load completely.

  3. If the page loads before the specified timeout,
     Selenium immediately executes the next statement.

  4. If the page is not loaded within the specified timeout,
     Selenium throws TimeoutException.

  5. It is used with
     driver.get()
     driver.navigate().to()

  6. It waits for complete page loading,
     not for WebElements.

  */
    public static void main(String[] args) {

        System.out.println("1. Launch Browser with Page load Time Out with 30 Seconds,");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        openBrowser.get("https://www.amazon.in/");
        System.out.println("Application Launch Successfully");

        System.out.println("2.Launch Browser with Page load Time Out with 40 Seconds,");
        WebDriver openBrowserA = new ChromeDriver();
        openBrowserA.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        openBrowserA.get("https://muzickart.in/products");
        System.out.println("Application Launch Successfully");


        System.out.println("3.Launch Browser with Page load Time Out with 80 Seconds, Application launch Time is 75 Seconds");
        WebDriver openBrowserB = new ChromeDriver();
        openBrowserB.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
        openBrowserB.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
        System.out.println("Application Launch Successfully");




        /*
         Run Time Exception programs

         Uncomment To Test
        1. Here Application load time is  75 Seconds, but we have passed 30 Seconds, As Page didnt load within  30 Seconds it throws an Exception as TimeoutException

            System.out.println("4.Launch Browser with Page load Time Out with 30 Seconds, Application launch Time is 75 Seconds");
            WebDriver openBrowser = new ChromeDriver();
            openBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
            System.out.println("Done");


      2. Here Application load time is  75 Seconds, but we have passed 60 Seconds, As Page didnt load within  60 Seconds it throws an Exception as TimeoutException

            System.out.println("5.Launch Browser with Page load Time Out with 60 Seconds, Application launch Time is 75 Seconds");
        WebDriver openBrowserA = new ChromeDriver();
        openBrowserA.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        openBrowserA.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
        System.out.println("Done");


       3. Here Application load time is  75 Seconds, but we have passed 70 Seconds, As Page didnt load within  70 Seconds it throws an Exception as TimeoutException

            System.out.println("6.Launch Browser with Page load Time Out with 70 Seconds, Application launch Time is 75 Seconds");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
        System.out.println("Done");


        4.

         System.out.println("6. 1. Launch Browser with Page load Time Out with Nagetive Value,");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(-1));
        openBrowser.get("https://www.amazon.in/");
        System.out.println("Application Launch Successfully");

          RunTime Exception
                pageLoadTimeout(Duration.ofDays(-1)); // As -1 is not acceptable Value, its Throws an Run Time Exception
                Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument: value must be a non-negative integer



         */

        System.out.println("7.Launch Browser with Page load Time Out with 30 Seconds, Application launch Time is 75 Seconds, It Handle An Exception TimeoutException");
        try {
            System.out.println("Launch Browser with Page load Time Out with 30 Seconds");
            WebDriver openBrowserC = new ChromeDriver();
            openBrowserC.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            openBrowserC.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
            System.out.println("Done");
        }
        catch (TimeoutException exceptionOccurred)
            {
                System.out.println("As Page is not loaded within 30 Seconds So TimeoutException Occurred ");
                System.out.println(exceptionOccurred.getMessage());

            }

            System.out.println("8.Launch Browser with Page load Time Out with 60 Seconds, Application launch Time is 75 Seconds, It Handle An Exception TimeoutException");
            try {
                System.out.println("Launch Browser with Page load Time Out with 60 Seconds");
                WebDriver openBrowserC = new ChromeDriver();
                openBrowserC.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
                openBrowserC.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
                System.out.println("Done");
            } catch (TimeoutException exceptionOccurredA) {

                System.out.println("As Page is not loaded within 60 Seconds So TimeoutException Occurred ");
                System.out.println(exceptionOccurredA.getMessage());

            }

            System.out.println("9.Launch Browser with Page load Time Out with 70 Seconds, Application launch Time is 75 Seconds, It Handle An Exception TimeoutException");
            try
            {
                System.out.println("Launch Browser with Page load Time Out with 70 Seconds");
                WebDriver openBrowserC = new ChromeDriver();
                openBrowserC.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
                openBrowserC.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ImplicitWait.html");
                System.out.println("Done");
            }
            catch (TimeoutException exceptionOccurredB) {
                System.out.println("As Page is not loaded within 70 Seconds So TimeoutException Occurred ");
                System.out.println(exceptionOccurredB.getMessage());

            }

        System.out.println("10 Launch Browser with Page load Time Out with 30 Seconds, Url is Navigated using navigate().to(Someurl)");
        WebDriver openBrowserD = new ChromeDriver();
        openBrowserD.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        openBrowserD.navigate().to ("https://www.amazon.in/");
        System.out.println("Application Launch Successfully");





    }

    }

