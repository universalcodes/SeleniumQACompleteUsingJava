package b.Selenium.chapter2.blocators.xpathsExamples.xpaths_functions.b.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CContainsWithAttributes {
    /*
    points to Remember
    1. Contain is the type of xpath functions, which can apply to different attributes
    such as id, name, and a lot more attributes.

    what is the HTML Attributes
    Its work with Open Tag we define attribute
    for example
    <input type="text" id="username12345" name=Test  value="attributes1"/>  // In following example input is the HTML tag  where we define different
    attributes such as type, id, name, value.

    How to locate HTML Attributes in Selenium Java
     To use in Selenium - we need to use @Symbol to locate the particular
     for example
        //input [@name= test"]
        //input [@type= text"]
        //input [@id= username12345"]
        //input [@value= username12345"]

     */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("Find the Attribute using title");
       // In the following Code we are tried to find the html element using attribute @title with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttribute = openBrowser.findElement(By.xpath("//*[@title='Example iframe']"));
        System.out.println(findElementThroughAttribute.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        System.out.println("Find the Attribute using datetime");
        // In the following Code we are tried to find the html element using attribute @datetime with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttribute2 = openBrowser.findElement(By.xpath("//*[@datetime='2025']"));
        System.out.println(findElementThroughAttribute2.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        System.out.println("Find the Attribute using method");
        // In the following Code we are tried to find the html element using attribute @dialog with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttribute3 = openBrowser.findElement(By.xpath("//*[@method='dialog']"));
        System.out.println(findElementThroughAttribute3.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        System.out.println("Find the Attribute using id");
        // In the following Code we are tried to find the html element using attribute @id with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttribute4 = openBrowser.findElement(By.xpath("//*[@id='interactive']"));
        System.out.println(findElementThroughAttribute4.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        System.out.println("Find the Attribute using multiple Attribute using title and datetime");
        // In the following Code we are tried to find the html element using attribute @title & @height with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        // in the case of multiple attributes one or more attributes should in the same tag, otherwise it will return false
        // it thorw an exception as NoSuchElementException if any of the attribute is not found in the webpage
        WebElement findMultipleElementThroughAttribute = openBrowser.findElement(By.xpath("//*[@title='Example iframe'][@height=200]")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findMultipleElementThroughAttribute.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        System.out.println("Find the Attribute using title using contains()");
        WebElement findElementThroughAttributeWithContains = openBrowser.findElement(By.xpath("//*[contains(@title, 'Example')]")); // In the Following Code we are tried to fin
        System.out.println(findElementThroughAttributeWithContains.isDisplayed());   // Return true if Element is found in the webpage otherwise false



    }
}
