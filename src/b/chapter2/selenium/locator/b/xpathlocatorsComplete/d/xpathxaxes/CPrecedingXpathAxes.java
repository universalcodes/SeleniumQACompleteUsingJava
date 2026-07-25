package b.chapter2.selenium.locator.b.xpathlocatorsComplete.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CPrecedingXpathAxes {
       /*
            Points to Remember.
            preceding Axis in XPath:
        1. The preceding axis contains all the nodes that come before the current node in the document, excluding any ancestors.
        2. It is used to select nodes that are located before the current node in the document order.
        3. The syntax for using the preceding axis is: preceding::node()
        4. You can specify a node name or use * to select all nodes.
        5. Example: //div[@id='currentNode']/preceding::p will select all <p> elements that come before the <div> with id 'currentNode'.
         */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\preceeding-example.html");

        System.out.println("1.Use the Preceding Xpath Axes with text() & Find the Previous Element of the Webpage");
        WebElement findElementThroughPrecedingXpathAxes = openBrowser.findElement(By.xpath("//input[@id='loan2']/preceding::input"));
        System.out.println(findElementThroughPrecedingXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Use the Preceding Xpath Axes with text() & Find the Previous Text Element of the Webpage");
        WebElement findElementThroughPrecedingXpathAxes2 = openBrowser.findElement(By.xpath("//*[text()='Withdrawal']/preceding::*[text()='Personal Loan']"));
        System.out.println(findElementThroughPrecedingXpathAxes2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Use the Preceding Xpath Axes with text() & Find the title of the Webpage");
        WebElement findElementThroughPrecedingXpathAxes3 = openBrowser.findElement(By.xpath("//*[text()='Bank Services Portal']/preceding::title"));
        System.out.println(findElementThroughPrecedingXpathAxes3.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("4.Use the Preceding Xpath Axes with text() & Find the title of the Webpage");
        WebElement findElementThroughPrecedingXpathAxes4 = openBrowser.findElement(By.xpath("//*[@placeholder='Enter FD Account No']/preceding::div"));
        System.out.println(findElementThroughPrecedingXpathAxes4.isDisplayed());   // Return true if Element is found in the webpage otherwise false

    }

    }

