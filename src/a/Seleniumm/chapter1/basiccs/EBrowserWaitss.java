package a.Seleniumm.chapter1.basiccs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EBrowserWaitss {

    public static void main(String[] args) throws InterruptedException {

        /*
        Points to Remember
           1. Waits helps to stay active/open on the webpage, Browser Webpage loads and
           waits for particular wait
                There are different types of waits
                1.Thread.sleep - Thread Sleep is a very common wait which is not though
                not suitable  where page stay pause for the fixed given time
                for example - Thread.sleep(5000)
                In the above example we have used Thread class and
                .sleep() is the inbuilt method of Thread Class
                (5000) means wait for 5 Seconds 5000 is milliseconds
                we can change the wait value as per our pause required time
               To Add the Thread.sleep() its Mandate to add Exception
               InterruptedException

                 2. timeout Wait
                   Timeout is wait which helps to entire webpage wait to load with given time
                   openGoogleChrome.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
                    In Above code .manage(), timeouts() & pageLoadTimeout those inbuilt abstract methods of WebDriver Interface & return type is Duration class
                    Duration is inbuilt Library java class. It is inbuilt method ofSeconds() helps to wait the given time
                    If the Page doesn't load with within timeframe it throws as Timeouts Exception

                2.Implicit Wait
                Implicitly waits till the HTML Element/Tag is visible within the given timeframe otherwise it will throw an Exception NoSuchElementException
                Always Remember whenever we are searching for HTML webpage elements then only Implicitly wait works otherwise it remains inactive
                even though code is provided.
                 openGoogleChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
                 In Above code .manage(), timeouts() & implicitlyWait(Duration.ofSeconds(45)); those inbuilt abstract methods of WebDriver Interface & return type is Duration class
                    Duration is inbuilt Library java class. It is inbuilt method ofSeconds() helps to wait the given time
                    If the Page doesn't load with within timeframe it throws as NoSuchElementFoundException
               we will cover in detail later
                3. Explicit Wait
                 Explicit waits is similar to Implicitly wait where it will wait till the HTML Element/Tag is visible within the given timeframe with certain conditions
                 otherwise it will throw an different Exception depends on the Explicit Condition
                even though code is provided.

         */

        WebDriver openGoogleChrome = new ChromeDriver();
        openGoogleChrome.get("https://www.geeksforgeeks.org/");
        Thread.sleep(5000); // the webpage is active till 5 Seconds
        openGoogleChrome.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));  // Webpage is wait till 30 Seconds  if Page is not load within the given time which is 30 Seconds later on it throws as TimeoutException

//        WebDriver.Timeouts testTime2 =  openGoogleChrome.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));   // with using Duration return type is Timeouts
//        System.out.println(testTime2);
//        Duration testDurationTime =  openGoogleChrome.manage().timeouts().getPageLoadTimeout();  // without Duration returntype is Duration
       // System.out.println(testDurationTime);

        openGoogleChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(34));

//        WebDriver.Timeouts testTime2 = openGoogleChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(34));
//        System.out.println(testTime2);


        openGoogleChrome.quit();

    }
}
