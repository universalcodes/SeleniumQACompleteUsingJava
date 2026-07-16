package a.Seleniumm.chapter1.basiccs.a1.windowHanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public static void main(String[] args) {
        WebDriver openGoogleChrome = new ChromeDriver();
        openGoogleChrome.manage().deleteAllCookies();
        // The Following line 30 help us to delete all cookies the Browser.
        openGoogleChrome.manage().window().minimize();
        // The Following line 32 help us to minimize the Browser.
        openGoogleChrome.manage().window().maximize();
        // The Following line 34  help us to maximize the Browser.
        openGoogleChrome.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\GetWindowHandles.html");
        
        String getMainTabHandleID = openGoogleChrome.getWindowHandle();
        System.out.println("Webpage Tab Handle ID as follows\t"+getMainTabHandleID); // get the String Tab of the Webpage, Return type is String

        WebElement openLinkA = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab']"));
        openLinkA.click();
        String getChildTabHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
        System.out.println("Webpage Tab Handle ID as follows\t"+getChildTabHandleID);

        WebElement openLinkB = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab 2']"));
        openLinkB.click();
        String getSecondChildTabHandleID = openGoogleChrome.getWindowHandle(); // Without Using Set It returns Same Tab ID
        System.out.println("Webpage Tab Handle ID as follows\t"+getSecondChildTabHandleID);

        WebElement openLinkC = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab 3']"));
        openLinkC.click();
        String getThirdChildTabHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
        System.out.println("Webpage Tab Handle ID as follows\t"+getThirdChildTabHandleID);

        WebElement openLinkD = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Tab 4']"));
        openLinkD.click();
        String getFourthChildTabHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
        System.out.println("Webpage Tab Handle ID as follows\t"+getFourthChildTabHandleID);

        WebElement openWindowA = openGoogleChrome.findElement(By.xpath("//*[text()='Open New Window']"));
        openWindowA.click();
        String getChildWindowHandleID = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
        System.out.println("Webpage Tab Handle ID as follows\t"+getChildWindowHandleID);


        WebElement openWindowB = openGoogleChrome.findElement(By.xpath("//*[text()='Another Window']"));
        openWindowB.click();
        String getChildWindowHandleIDB = openGoogleChrome.getWindowHandle();  // Without Using Set It returns Same Tab ID
        System.out.println("Webpage Tab Handle ID as follows\t"+getChildWindowHandleIDB);

        /*
        Without Using Set It returns Same Tab ID
        Set is Used To Iterate Each Tab & New Browser Window
         */

        Set<String> allTabWindowHandles = openGoogleChrome.getWindowHandles();
        System.out.println("All Tab & Window Handles: " + allTabWindowHandles);


        System.out.println("handle Browser Window And Tab Using for Each loop");
        for (String handleBrowsersTabWindows : openGoogleChrome.getWindowHandles()) {
           System.out.println("Tab Handle Found:\t" + handleBrowsersTabWindows);
        }



        Iterator<String> TabHandleIterate = allTabWindowHandles.iterator();
        /*
        Using While Loop we are Iterating Each Tab using hasNext() & next() Method
         */
        while (TabHandleIterate.hasNext()) {
            String handle = TabHandleIterate.next();
            openGoogleChrome.switchTo().window(handle);
            System.out.println("Tab Title: " + openGoogleChrome.getTitle());
        }
























//
//        while(widnowHandleIterate.hasNext()) {
//            if(!(getMainTabHandleID.equals(widnowHandleIterate))) {
//                String firstTab = widnowHandleIterate.next();
//                openGoogleChrome.switchTo().Tab(firstTab);
//                System.out.println("First Tab Title: " + openGoogleChrome.getTitle());
//            }
//// Point 2: Second Tab
//            String secondTab = widnowHandleIterate.next();
//            openGoogleChrome.switchTo().Tab(secondTab);
//            System.out.println("Second Tab Title: " + openGoogleChrome.getTitle());
//
//// Point 3: Third Tab
//            String thirdTab = widnowHandleIterate.next();
//            openGoogleChrome.switchTo().Tab(thirdTab);
//            System.out.println("Third Tab Title: " + openGoogleChrome.getTitle());
//        }

//
    }
}
