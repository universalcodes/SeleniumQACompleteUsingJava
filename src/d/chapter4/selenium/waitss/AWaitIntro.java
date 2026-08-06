package d.chapter4.selenium.waitss;

public class AWaitIntro {
    /*
    points to remember
    1. In web development, when a user wants to pause the webpage then waits are very useful as some elements takes time to load into Webpage
       User can perform various operations on that webpage
      visibility of element.
      click on the element & so on.

    There are different types of Waits
    1. Hard Wait - Thread.sleep()
    2. Implicit Wait -
    3. Explicit Wait -
    4. Fluent Wait
    5.pageLoadTimeOut()
    
    a) Hard Wait (Thread.sleep())
            - Pauses execution for a fixed amount of time.
            - Not recommended because it always waits for the specified time
              even if the element is available earlier.
     
         b) Implicit Wait
            - Global wait.
            - Applied to all WebElement searches.
            - Waits until an element is found or timeout occurs.
     
         c) Explicit Wait (WebDriverWait)
            - Waits for a specific condition.
            - Most commonly used wait in Selenium automation.
            - Uses ExpectedConditions.
     
         d) Fluent Wait
            - Advanced version of Explicit Wait.
            - Allows polling interval configuration.
            - Can ignore specific exceptions while waiting.
     
         e) Page Load Timeout
            - Waits for the entire web page to load.
            - Throws TimeoutException if loading exceeds the configured time.
     
      4. Best Practice:
         - Prefer Explicit Wait over Thread.sleep().
         - Use Fluent Wait for highly dynamic applications.
         - Avoid mixing Implicit Wait and Explicit Wait because it can
           lead to unpredictable wait times.

           */
    public static void main(String[] args) {

    }
}
