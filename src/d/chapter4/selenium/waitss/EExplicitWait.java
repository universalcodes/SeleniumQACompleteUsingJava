package d.chapter4.selenium.waitss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EExplicitWait {
    /*
    points to remember
    /*
1. Explicit Wait is used to wait for a SPECIFIC CONDITION.

2. It is implemented using WebDriverWait.

3. ExpectedConditions provides predefined conditions.

4. Explicit Wait has a MAXIMUM TIMEOUT.
   It does NOT necessarily wait for the complete timeout.

5. As soon as the condition becomes TRUE,
   Selenium continues execution.

6. Commonly used excepted conditions:

   1.presenceOfElementLocated()
     → Element DOM mein present hona chahiye.
→ Element visible ho ya hidden, dono acceptable hain.
→ Element DOM mein nahi mila within timeout → TimeoutException.

   3.invisibilityOfElementLocated()  -- ensure that weather Present in the DOM & visible on the html webpage
   2.visibilityOfElementLocated() -- Present in the DOM & visible on the html webpage
   4.elementToBeClickable()  -- Present in the DOM, visible, and enabled then user can click on it
   5.alertIsPresent()  --  alert present in the html as alert pop up visible on the screen   ---
   7.titleContains()  --
   8.urlContains()
   9.textToBePresentInElement()
   6.frameToBeAvailableAndSwitchToIt()
   10.stalenessOf()

   mostly excepted conditions throw TimeOutException when the condition is not satisfied with given time.


7. Explicit Wait is CONDITION-BASED.

8. Thread.sleep() is TIME-BASED.

9. Explicit Wait is generally preferred over
   Thread.sleep() for synchronization.

10. If the condition is not satisfied within the
    timeout, TimeoutException can occur.

11. Explicit Wait is normally used for a specific
    element/condition, not globally.

12. Explicit Wait is very useful for dynamic elements,
    AJAX calls, delayed loading, and asynchronous UI changes.

13. Modern Selenium syntax:

    WebDriverWait wait =
        new WebDriverWait(driver, Duration.ofSeconds(10));

14. Example:

    WebElement element = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.id("username")
        )
    );

15. Most important difference:

    presence  → Element exists in DOM
    visibility → Element is visible
    clickable  → Element can be clicked

16. Explicit Wait helps reduce flaky tests caused
    by synchronization/timing issues.

     */

    public static void main(String[] args) {
      /*
        Here presenceOfElementLocated is that weather element present in the DOM doesn't matter its hidden or visible, here element is present in the DOM
         */

        System.out.println("Launch Browser");
        System.out.println("1.Validate the presence of Element located which means Element is Present is the DOM and Not Visible");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait waitForElement = new WebDriverWait(openBrowser, Duration.ofSeconds(2));
        waitForElement.until(ExpectedConditions.presenceOfElementLocated(By.id("addElementButton")));
        System.out.println("Test Case Passed");



        /*
        Uncomment to Test
        Here presenceOfElementLocated is that weather element present in the DOM doesn't matter its hidden or visible, here element is not present in the DOM
        System.out.println("2.Validate the presence of Element located which means Element is not Present is the DOM");
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait waitForElementA = new WebDriverWait(openBrowser, Duration.ofSeconds(20));
        waitForElementA.until(ExpectedConditions.presenceOfElementLocated(By.id("addElementButtonHandle")));
        System.out.println("Test Case Failed");

         */


    }
}
