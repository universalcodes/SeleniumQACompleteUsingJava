package a.Seleniumm.chapter1.basiccs.a1.windowHanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class AWindowHandling {
    public static void main(String[] args) {
        WebDriver openGoogleChrome = new ChromeDriver();
        openGoogleChrome.manage().deleteAllCookies();
        // The Following line 30 help us to delete all cookies the Browser.
        openGoogleChrome.manage().window().minimize();
        // The Following line 32 help us to minimize the Browser.
        openGoogleChrome.manage().window().maximize();
        // The Following line 34  help us to maximize the Browser.
        openGoogleChrome.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\GetWindowHandles.html");
        String getWindowHandleID = openGoogleChrome.getWindowHandle();
        System.out.println("Webpage Window Handle ID as follows\t"+getWindowHandleID); // get the String Window of the Webpage, Return type is String
        WebElement openLinkA = openGoogleChrome.findElement(By.xpath("//*[text()='Open Child Window']"));
        openLinkA.click();
        String getWindowHandleIDA = openGoogleChrome.getWindowHandle();
        System.out.println("Webpage Window Handle ID as follows\t"+getWindowHandleIDA);
        WebElement openLinkB = openGoogleChrome.findElement(By.xpath("//*[text()='Open Page 2']"));
        openLinkB.click();
        String getWindowHandleIDB = openGoogleChrome.getWindowHandle();
        System.out.println("Webpage Window Handle ID as follows\t"+getWindowHandleIDB);
        WebElement openLinkC = openGoogleChrome.findElement(By.xpath("//*[text()='Open Page 3']"));
        openLinkC.click();
        String getWindowHandleIDC = openGoogleChrome.getWindowHandle();
        System.out.println("Webpage Window Handle ID as follows\t"+getWindowHandleIDC);
        WebElement openLinkD = openGoogleChrome.findElement(By.xpath("//*[text()='Open Page 4']"));
        openLinkD.click();
        String getWindowHandleIDD = openGoogleChrome.getWindowHandle();
        System.out.println("Webpage Window Handle ID as follows\t"+getWindowHandleIDD);

        Set<String> allHandles = openGoogleChrome.getWindowHandles();
        System.out.println("All Window Handles: " + allHandles);

        for (String handle : openGoogleChrome.getWindowHandles()) {
            System.out.println("Window Handle Found:\t" + handle);
        }

        Set<String> handles = openGoogleChrome.getWindowHandles();
        Iterator<String> it = handles.iterator();

// Point 1: First window (Main)
        String firstWindow = it.next();
        openGoogleChrome.switchTo().window(firstWindow);
        System.out.println("First Window Title: " + openGoogleChrome.getTitle());

// Point 2: Second window
        String secondWindow = it.next();
        openGoogleChrome.switchTo().window(secondWindow);
        System.out.println("Second Window Title: " + openGoogleChrome.getTitle());

// Point 3: Third window
        String thirdWindow = it.next();
        openGoogleChrome.switchTo().window(thirdWindow);
        System.out.println("Third Window Title: " + openGoogleChrome.getTitle());


    }
}
