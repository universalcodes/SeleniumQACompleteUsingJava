package a.chapter1.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KRunScriptOnAttachedBrowser {
    public static void main(String[] args) {
        /*
===============================================================================
 Attach Selenium Script to Existing Active Chrome Browser
===============================================================================

1. Selenium can attach to an already running Chrome browser using
   Chrome Remote Debugging.

2. Chrome must be launched in Remote Debugging Mode.

      Example:
      chrome.exe --remote-debugging-port=9222
                 --user-data-dir="C:\ChromeDebugProfile"

3. The debugging port specified while launching Chrome
   must be the same port used in Selenium.

      Example:
      options.setExperimentalOption(
             "debuggerAddress",
             "127.0.0.1:9222");

4. Selenium will not launch a new browser.
   Instead, it connects to the existing browser session.

5. Existing browser state is preserved.

      • Login Session
      • Cookies
      • Local Storage
      • Current URL
      • Open Tabs

6. This approach is useful when

      • CAPTCHA is present
      • Manual Login is required
      • MFA Authentication
      • OAuth Login
      • Debugging Existing Session

7. Browser must remain open while executing Selenium.

8. If Chrome is closed,
   Selenium cannot attach to it.

9. Normal Chrome Browser cannot be attached.

   Chrome must be started with

      --remote-debugging-port

10. If debugging port changes,
    update debuggerAddress accordingly.

11. Once attached,
    Selenium performs all actions normally.

      • click()
      • sendKeys()
      • clear()
      • getText()
      • getAttribute()
      • executeScript()

12. Do not call driver.get()
    if you want to continue from the currently opened page.

13. If driver.get() is executed,
    Selenium navigates to another page.

14. This approach is mainly used for

      Development
      Debugging
      Learning
      Manual + Automation Hybrid Testing

15. Enterprise Frameworks generally do NOT use this technique
    for automated test execution.
    They create a fresh browser session for every execution
    to ensure test independence.

===============================================================================
*/
        ChromeOptions options = new ChromeOptions();

        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");

        WebDriver openBrowser = new ChromeDriver(options);

        System.out.println(openBrowser.getTitle());
        System.out.println("1. Locate the Input Type as Text & should be Visible as Well");
        WebElement locateInputTypeAsText = openBrowser.findElement(By.id("txtLocate"));
        boolean textBoxIsVisible = locateInputTypeAsText.isDisplayed();
        System.out.println("Text Box is Visible: " + textBoxIsVisible);


        System.out.println("2. Locate the Input Type as Text should be Visible & Enabled as Well");
        WebElement locateInputTypeAsTextEnabled = openBrowser.findElement(By.id("txtLocate"));
        boolean textBoxIsVisibles = locateInputTypeAsTextEnabled.isDisplayed();
        boolean textBoxIsVisibleEnabled = locateInputTypeAsTextEnabled.isDisplayed();

        System.out.println("3. Locate the Input Type as Text should be Visible, Enabled as Well & Enter the Text");
        WebElement enterTextInTextBox = openBrowser.findElement(By.id("txtLocate"));
        System.out.println(enterTextInTextBox.isDisplayed() + " and Enabled as " + enterTextInTextBox.isEnabled());
        System.out.println("Text Box is Visible as: " + textBoxIsVisibles +" and Enabled as " + textBoxIsVisibleEnabled) ;
        locateInputTypeAsTextEnabled.sendKeys("Selenium Java Journey");

        System.out.println("4. Locate the Input Type as Text should be visible, enabled then clear the input box, Enter the New Text");
        WebElement clearTextAndReEnterTextBox = openBrowser.findElement(By.id("txtClear"));
        System.out.println(clearTextAndReEnterTextBox.isDisplayed() + " and Enabled as " + clearTextAndReEnterTextBox.isEnabled());
        clearTextAndReEnterTextBox.clear();
        clearTextAndReEnterTextBox.sendKeys("Text is Cleared and Re-Entered Successfully");


    }
}
