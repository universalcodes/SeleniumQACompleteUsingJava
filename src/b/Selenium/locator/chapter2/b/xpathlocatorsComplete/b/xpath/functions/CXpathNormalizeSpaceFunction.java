package b.Selenium.locator.chapter2.b.xpathlocatorsComplete.b.xpath.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CXpathNormalizeSpaceFunction {
    /*
    points to Remember
    1. normalize-space() allows to delete extra space from starting and ending
    which helps to find web element in a better way,
    for example

            WebElement findElementThroughAttribute = openBrowser.findElement(By.xpath("//input[normalize-space(@id)='lang2']"));

    */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("1.Find the Attribute using id with Normalize Space");
       // In the following Code we are tried to find the html element using attribute @id that have spaces with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttribute = openBrowser.findElement(By.xpath("//input[normalize-space(@id)='lang2']"));
        System.out.println(findElementThroughAttribute.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Find the Attribute using name with Normalize Space");
        // In the following Code we are tried to find the html element using attribute @id that have spaces with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttributeName = openBrowser.findElement(By.xpath("//input[normalize-space(@name)='myName']"));
        System.out.println(findElementThroughAttributeName.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Find the Attribute using class with Normalize Space");
        // In the following Code we are tried to find the html element using attribute @class that have spaces  with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttributeClass = openBrowser.findElement(By.xpath("//input[normalize-space(@class)='myClass']"));
        System.out.println(findElementThroughAttributeClass.isDisplayed());   // Return true if Element is found in the webpage otherwise false



        System.out.println("Find the Text using . with Normalize Space");
        // In the following Code we are tried to find the html element using text() with valid exact value that have spaces,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughText = openBrowser.findElement(By.xpath("//*[normalize-space(.)='This is Normalize Text']"));
        System.out.println(findElementThroughText.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        System.out.println("Find the Text using text() with Normalize Space");
        // In the following Code we are tried to find the html element using text() with valid exact value that have spaces,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughText2 = openBrowser.findElement(By.xpath("//*[normalize-space(text())='This is Normalize Text']"));
        System.out.println(findElementThroughText2.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        System.out.println("Find the Text using contains() with Normalize Space");
        // In the following Code we are tried to find the html element using contains text()  with valid exact value that have spaces,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughContains = openBrowser.findElement(By.xpath("//*[contains(normalize-space(text()), 'Normalize')]"));
        System.out.println(findElementThroughContains.isDisplayed());   // Return true if Element is found in the webpage otherwise false

//        System.out.println("Find the Invalid Text using . with Normalize Space");
//        // In the following Code we are tried to find the html element using attribute  with valid exact value,
//        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
//        WebElement findElementThroughInvalidText = openBrowser.findElement(By.xpath("//*[normalize-space(.)='Testing']"));
//        System.out.println(findElementThroughInvalidText.isDisplayed());   // Return true if Element is found,otherwise throws
//        //an exception NoSuchElementException as the text is not found in the webpage, because of invalid text value provided in the xpath expression.
//


    }
}
