package b.Selenium.locator.chapter2.b.advancedlocator.xpath.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DPrecedingSiblingsXpathAxes {
       /*
            Points to Remember.
            preceding-sibling  Axis in XPath:
        1.  Preceding-sibling helps to find all sibling of the particular parent
        2. The preceding-sibling axis contains all the sibling nodes that come before the current node in the document, excluding any ancestors.
        3. It is used to select sibling nodes that are located before the current node in the document order.
        4. The syntax for using the preceding-sibling axis is: preceding-sibling::node()
        5. You can specify a node name or use * to select all sibling nodes.
        6. Example: //div[@id='currentNode']/preceding-sibling::p will select all <p> sibling elements that come before the <div> with
          */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\preceeding-example.html");

        System.out.println("1.Use the Preceding Xpath Axes with text() & Find the Previous Element Sibling of the Webpage");
        WebElement findElementThroughPrecedingSiblingXpathAxes = openBrowser.findElement(By.xpath("//*[@placeholder='Enter FD Account No']/preceding::*[text()='Fixed Deposit']"));
        System.out.println(findElementThroughPrecedingSiblingXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false


    }

    }

