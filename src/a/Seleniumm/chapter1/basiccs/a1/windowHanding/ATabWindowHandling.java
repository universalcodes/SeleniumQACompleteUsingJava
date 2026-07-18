package a.Seleniumm.chapter1.basiccs.a1.windowHanding;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class ATabWindowHandling {
    /*
    📌 Points to Remember

    1. Handling Tabs & Windows:
       - In Selenium, handling tabs and windows means switching between different browser contexts
         using their unique handle IDs and performing operations on each.

    2. Child Tab Handling:
       - When a child tab opens, capture its handle.
       - Switch focus to that tab, perform required browser operations (like verifying title or interacting with elements).
       - Close the tab once done and return to the main window.

    3. New Window Handling:
       - When a new window opens, capture its handle.
       - Switch focus to that window, perform required browser operations.
       - Close the window once done and return to the main window.

    4. Key Selenium Methods:
       - getWindowHandle() → Returns the ID of the current active tab/window.
       - getWindowHandles() → Returns a Set<String> of all open tabs/windows.
       - switchTo().window(handle) → Switches focus to the specified tab/window.
       - getTitle() → Returns the title of the current tab/window.
       - close() → Closes the current tab/window.
       - quit() → Closes all tabs/windows and ends the browser session.
*/


    public static void main(String[] args) throws InterruptedException {
        WebDriver openGoogleChrome = new ChromeDriver();
        openGoogleChrome.manage().deleteAllCookies();
        // The Following line 30 help us to delete all cookies the Browser.
        openGoogleChrome.manage().window().minimize();
        // The Following line 32 help us to minimize the Browser.
        openGoogleChrome.manage().window().maximize();
        // The Following line 34  help us to maximize the Browser.
        openGoogleChrome.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\GetWindowHandles.html");

         String parentMainWindow =    openGoogleChrome.getWindowHandle();
        //Open a New Tab Through Selenium 4 ;
        openGoogleChrome.switchTo().newWindow(WindowType.TAB);
        openGoogleChrome.get("https://www.amazon.in/");
        String getTitleOfNewTab = openGoogleChrome.getTitle();
        String getCurrentOpenedWebAddress = openGoogleChrome.getCurrentUrl();
        System.out.println("Title as follows:\t" +getTitleOfNewTab + " " + "Current WebAddress as follows:\t" +getCurrentOpenedWebAddress);
        // close the Current Newly Open Tab;
        Thread.sleep(10000);
        openGoogleChrome.close(); // close current Tab

        //Open a New Window Through Selenium 4 ;
        openGoogleChrome.switchTo().window(parentMainWindow);
        Thread.sleep(10000);

        openGoogleChrome.switchTo().newWindow(WindowType.WINDOW);
        openGoogleChrome.get("https://www.flipkart.com/");
        String getTitleOfNewWindow = openGoogleChrome.getTitle();
        String getCurrentOpenedWebAddressWindow = openGoogleChrome.getCurrentUrl();
        System.out.println("Title as follows:\t" +getTitleOfNewWindow + " " + "Current WebAddress as follows:\t" +getCurrentOpenedWebAddressWindow);
        Thread.sleep(10000);
        openGoogleChrome.close(); // close the current Window


        // ✅ Open new tab using JS In Selenium 3
        openGoogleChrome.switchTo().window(parentMainWindow);
        ((JavascriptExecutor) openGoogleChrome).executeScript("window.open('https://www.myntra.com/','_blank');");
        Thread.sleep(10000);
        String getCurrentOpenedTabTitleJS = openGoogleChrome.getTitle();
        String getCurrentOpenedTabAddressJS = openGoogleChrome.getCurrentUrl();
        System.out.println("Title as follows:\t" +getCurrentOpenedTabTitleJS + " " + "Current WebAddress as follows:\t" +getCurrentOpenedTabAddressJS);
        //openGoogleChrome.close();


        // ✅ Open new Window using JS In Selenium 3
        //openGoogleChrome.switchTo().window(parentMainWindow);
        ((JavascriptExecutor) openGoogleChrome).executeScript("window.open('https://blinkit.com/','blinkit','width=800,height=600');");



//
//
//        String getMainTabHandleID = openGoogleChrome.getWindowHandle();
//        System.out.println("Webpage Tab Handle ID as follows\t" + getMainTabHandleID); // get the String Tab of the Webpage, Return type is String
//
//        WebElement openLinkA = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab']"));
//        openLinkA.click();
//        String getChildTabHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
//        System.out.println("Webpage Tab Handle ID as follows\t" + getChildTabHandleID);
//
//        WebElement openLinkB = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab 2']"));
//        openLinkB.click();
//        String getSecondChildTabHandleID = openGoogleChrome.getWindowHandle(); // Without Using Set It returns Same Tab ID
//        System.out.println("Webpage Tab Handle ID as follows\t" + getSecondChildTabHandleID);
//
//        WebElement openLinkC = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab 3']"));
//        openLinkC.click();
//        String getThirdChildTabHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
//        System.out.println("Webpage Tab Handle ID as follows\t" + getThirdChildTabHandleID);
//
//        WebElement openLinkD = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab 4']"));
//        openLinkD.click();
//        String getFourthChildTabHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
//        System.out.println("Webpage Tab Handle ID as follows\t" + getFourthChildTabHandleID);
//
//        WebElement openWindowA = openGoogleChrome.findElement(By.xpath("//*[text()='Open New Window']"));
//        openWindowA.click();
//        String getChildWindowHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
//        System.out.println("Webpage Tab Handle ID as follows\t" + getChildWindowHandleID);
//
//
//        WebElement openWindowB = openGoogleChrome.findElement(By.xpath("//*[text()='Another Window']"));
//        openWindowB.click();
//        String getChildWindowHandleIDB = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
//        System.out.println("Webpage Tab Handle ID as follows\t" + getChildWindowHandleIDB);
//
//        /*
//        Without Using Set It returns Same Tab ID
//        Set is Used To Iterate Each Tab & New Browser Window
//         */
//
//        Set<String> allTabWindowHandles = openGoogleChrome.getWindowHandles();
//        System.out.println("All Tab & Window Handles: " + allTabWindowHandles);
//
//
//        System.out.println("handle Browser Window And Tab Using for While loop");
//        for (String handleBrowsersTabWindows : openGoogleChrome.getWindowHandles()) {
//            System.out.println("Tab Handle Found:\t" + handleBrowsersTabWindows);
//        }
//
//        Iterator<String> TabHandleIterate = allTabWindowHandles.iterator();
//        /*
//        Using While Loop we are Iterating Each Tab using hasNext() & next() Method
//         */
//        while (TabHandleIterate.hasNext()) {
//            String handleDifferentWindowsTabs = TabHandleIterate.next();
//            String getDifferentTabsWindowsTitle = openGoogleChrome.getTitle();
//            if (!handleDifferentWindowsTabs.equals(getMainTabHandleID)) {
//                openGoogleChrome.switchTo().window(handleDifferentWindowsTabs);
//
//                System.out.println("Window-Tab Handles ID as follows\t" + handleDifferentWindowsTabs + "  " + "Tab/Window URL Title as follows: " + getDifferentTabsWindowsTitle);
//                 openGoogleChrome.close();
//            }
//
////
//        while(TabHandleIterate.hasNext()) {
//            if(!(handleDifferentWindowsTabs.equals(getMainTabHandleID))) {
//                String firstTabOrWindow = TabHandleIterate.next();
//                openGoogleChrome.switchTo().window(firstTabOrWindow);
//                System.out.println("First Tab Title: " + openGoogleChrome.getTitle());
//            }
//// Point 2: Second Tab
//            String secondTabOrWindow = TabHandleIterate.next();
//            openGoogleChrome.switchTo().window(secondTabOrWindow);
//            System.out.println("Second Tab Title: " + openGoogleChrome.getTitle());
//
//// Point 3: Third Tab
//            String thirdTab = widnowHandleIterate.next();
//            openGoogleChrome.switchTo().Tab(thirdTab);
//            System.out.println("Third Tab Title: " + openGoogleChrome.getTitle());
//        }
//
//        }
    }
}
