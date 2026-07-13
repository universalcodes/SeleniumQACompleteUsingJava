package b.Selenium.locator.chapter2.b.xpathlocatorsComplete.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFollowingSiblingXpathAxis {
     /*
        Points to Remember:
        1. following-sibling is one of the XPath axes.
        2. It is used to locate nodes that share the same parent as the current node
           and appear after it in the document.
        3. It will NOT find child, grandchild, or deeper descendant nodes.
           → Only the current element’s siblings are considered.
        4. Syntax:
             //tagName[@attribute='value']/following-sibling::tagName
           Example:
             //p[@id='acc1']/following-sibling::p
           → This will locate all <p> elements that are siblings of acc1 and come after it.
        5. Failure Use Cases:
           - if we have Provided the Invalid Element then it thrown an Exception NoSuchElementException
           - If we do Typo in Xpath Locator then it thrown an Exception InvalidSelectorException

        */


    public static void main(String[] args) {

        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("1.Use the following-sibling Xpath Axes with text() & Find the Next Immediate Sibling of the Webpage ");
        WebElement findElementThroughFollowingSiblingXpathAxes = openBrowser.findElement(By.xpath("//*[text()='Pen']/following-sibling::td[1]"));
        System.out.println(findElementThroughFollowingSiblingXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise it throws an Exception as NoSuchElementFound

        System.out.println("2.Use the following-sibling Xpath Axes with text() & Find the Next Immediate Sibling Using Another Text of the Webpage ");
        WebElement findElementThroughFollowingSiblingXpathAxesUsingAnotherText = openBrowser.findElement(By.xpath("//*[text()='Pen']/following-sibling::td[text()='10']"));
        System.out.println(findElementThroughFollowingSiblingXpathAxesUsingAnotherText.isDisplayed());   // Return true if Element is found in the webpage otherwise it throws an Exception as NoSuchElementFound

        System.out.println("3.Use the following-sibling Xpath Axes with text() & Find the Next Immediate Sibling Using Another Contains Xpath Function within of the Webpage ");
        WebElement findElementThroughFollowingSiblingXpathAxesUsingContains = openBrowser.findElement(By.xpath("//*[text()='Learn Partial Link Test']/following-sibling::a[contains(text(),'Learn Java' )]"));
        System.out.println(findElementThroughFollowingSiblingXpathAxesUsingContains.isDisplayed());   // Return true if Element is found in the webpage otherwise it throws an Exception as NoSuchElementFound

        System.out.println("4.Use the following-sibling Xpath Axes with id & Find the Next Immediate Sibling Using text() Function within of the Webpage ");
        WebElement findElementThroughFollowingSiblingXpathAxesUsingID = openBrowser.findElement(By.xpath("//*[@id='chkFollowingSibling']/following-sibling::p[text()='Customer2 - Current Account']"));
        System.out.println(findElementThroughFollowingSiblingXpathAxesUsingID.isDisplayed());   // Return true if Element is found in the webpage otherwise it throws an Exception as NoSuchElementFound

        System.out.println("5.Use the following-sibling Xpath Axes with name & Find the Next Immediate Sibling Using Name Function within of the Webpage ");
        WebElement findElementThroughFollowingSiblingXpathAxesUsingName = openBrowser.findElement(By.xpath("//*[@name='cust1']/following-sibling::p[@name='cust4']"));
        System.out.println(findElementThroughFollowingSiblingXpathAxesUsingName.isDisplayed());   // Return true if Element is found in the webpage otherwise it throws an Exception as NoSuchElementFound

//Uncomment to Test -- Syntax Error
//        System.out.println("6.Use the following-sibling Xpath Syntax Error ");
//        WebElement findElementThroughFollowingSiblingSyntaxError = openBrowser.findElement(By.xpath("//*[@name='cust1']/following-sibling:p[@name='cust4']"));
//        System.out.println(findElementThroughFollowingSiblingSyntaxError.isDisplayed());  // In the Above Line we have provided wrong Syntax of following- sibling . It throws an Exception as InvalidSelectorException


//Uncomment to Test -- Invalid Locator Defined so it thrown an Exception InvalidSelectorException
//        System.out.println("7.Use the following-sibling Xpath Syntax Error ");
//        WebElement findElementThroughFollowingSiblingSyntaxError = openBrowser.findElement(By.xpath("//*[@name='cust11']/following-sibling::p[@name='cust4']"));
//        System.out.println(findElementThroughFollowingSiblingSyntaxError.isDisplayed());  // In the Above Line we have provided invalid locator using following- sibling xpath . It throws an Exception as NoSuchElementException




        //openBrowser.close();

    }
}
