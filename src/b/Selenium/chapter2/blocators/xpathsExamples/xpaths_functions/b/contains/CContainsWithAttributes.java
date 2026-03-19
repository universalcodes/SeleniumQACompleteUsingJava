package b.Selenium.chapter2.blocators.xpathsExamples.xpaths_functions.b.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CContainsWithAttributes {
    /*
    points to Remember
    1. Contains is the type of xpath functions, which can apply to different attributes
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
        System.out.println("Find the Attribute 1");
        WebElement findElementThroughAttribute = openBrowser.findElement(By.xpath("//*[@title='Example iframe']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findElementThroughAttribute.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        WebElement findElementThroughAttribute2 = openBrowser.findElement(By.xpath("//*[@datetime='2025']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findElementThroughAttribute2.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        WebElement findElementThroughAttribute3 = openBrowser.findElement(By.xpath("//*[@method='dialog']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findElementThroughAttribute3.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        WebElement findElementThroughAttribute4 = openBrowser.findElement(By.xpath("//*[@id='interactive']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findElementThroughAttribute4.isDisplayed());   // Return true if Element is found in the webpage otherwise false
        WebElement findMultpleElementThroughAttribute = openBrowser.findElement(By.xpath("//*[@title='Example iframe'][@datetime='2025']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findMultpleElementThroughAttribute.isDisplayed());   // Return true if Element is found in the webpage otherwise false



    }
}
