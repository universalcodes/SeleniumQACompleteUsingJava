package b.chapter2.selenium.locator.b.xpathlocatorsComplete.b.xpath.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BXpathStartsWithFunction {
    /*
    points to Remember
    1.starts-with() is the type of xpath function, which can apply to different attributes
    such as id, name, and a lot more attributes.
    for example
    <input type="text" id="username12345" name=Test  value="attributes1"/>
     // In following example input is the HTML tag  where we define different
        attributes such as type, id, name, value.
        starts-with() function is used to find the element with the help of partial attribute value,
         which means we can use partial attribute value to find the element in the webpage,
         it is very useful when we have dynamic attribute value in the webpage,
         for example
            <input type="text" id="username12345" name=Test  value="attributes1"/>
            in the above example if we have dynamic id attribute value which is changing every time
            when we refresh the webpage then we can use starts-with() function to find the element with the help of partial attribute value,
                for example
            //input[starts-with(@id, 'username')]  -- In the following code we are tried to find the element
            with the help of starts-with() function using partial attribute value,
            in this case we have used id attribute where we have provided partial attribute value which is username,
            it will return true if it found any element with the help of partial attribute value which is username in the webpage otherwise
            it will return false
    */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("1.Find the Attribute using id with starts with");
       // In the following Code we are tried to find the html element using attribute @placeholder with valid starting value using starts-with() function,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttribute = openBrowser.findElement(By.xpath("//input[starts-with(@placeholder, 'EnteredName')]"));
        System.out.println(findElementThroughAttribute.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Find the Attribute using name with Starts With");
        // In the following Code we are tried to find the html element using attribute @name with valid starting value using starts-with() function,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttributeName = openBrowser.findElement(By.xpath("//*[starts-with(@name, 'myyName')]"));
        System.out.println(findElementThroughAttributeName.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Find the Attribute using class with Starts With");
        // In the following Code we are tried to find the html element using attribute @class with valid starting value using starts-with() function,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughAttributeClass = openBrowser.findElement(By.xpath("//*[starts-with(@class, 'alwaysBest')]"));
        System.out.println(findElementThroughAttributeClass.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        System.out.println("Find the Text using . with Starts With");
        // In the following Code we are tried to find the html element using . with valid starting value using starts-with() function,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughText = openBrowser.findElement(By.xpath("//*[starts-with(., 'Starts with')]"));
        System.out.println(findElementThroughText.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        // In the following Code we are tried to find the html element using text() with valid starting value using starts-with() function,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.

        System.out.println("Find the Text using text() with Starts With");
        // In the following Code we are tried to find the html element using attribute @title with valid exact value,
        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
        WebElement findElementThroughText2 = openBrowser.findElement(By.xpath("//*[starts-with(text(), 'Starts with')]"));
        System.out.println(findElementThroughText2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

//
//        System.out.println("Provide Wrong Function Name to find the Text using text() with Starts With");
//        // In the following Code we are tried to find the html element using attribute @title with valid exact value,
//        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
//        WebElement findElementThroughWrongFunction = openBrowser.findElement(By.xpath("//*[start-with(text(), 'Starts with')]"));
//        System.out.println(findElementThroughWrongFunction.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//        // if we provide invalid locator no compile time, at the time of RunTime then it throws an exception as 'InvalidSelectorException

        // tried wrong function name, it will throw an exception as 'InvalidSelectorException' as start-with is not a valid function name, correct function name is starts-with

        try {
            System.out.println("Provide Wrong Function Name to find the Text using text() with Starts With");
            // In the following Code we are tried to find the html element using attribute @title with valid exact value,
            // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
            WebElement findElementThroughWrongFunction = openBrowser.findElement(By.xpath("//*[start-with(text(), 'Starts with')]"));
            System.out.println(findElementThroughWrongFunction.isDisplayed());   // Return true if Element is found in the webpage otherwise false
            // if we provide invalid locator no compile time, at the time of RunTime then it throws an exception as 'InvalidSelectorException'
        }
        catch(InvalidSelectorException exceptionCame)

        {
            System.out.println("Invalid Selector Exception Came with Raw Message as follows\t"+exceptionCame.getRawMessage());
            System.out.println("Invalid Selector Exception Came with message as follows\t"+exceptionCame.getMessage());
            System.out.println("Invalid Selector Exception Came with Additional Information as follows\t"+exceptionCame.getAdditionalInformation());

        }
//
        // as the locator is invalid as there is no element in the webpage with the text which is starting with 'Java is'
        // it will throw an exception as 'NoSuchElementException' as there is no element found in the webpage with the provided locator

//        System.out.println("provide invalid Web Elements using text() with Starts With");
//        // In the following Code we are tried to find the html element using attribute @title with valid exact value,
//        // * is known as wild card character which means any tag, we can use any tag to find the element with the help of attribute.
//        WebElement findInValidElementText = openBrowser.findElement(By.xpath("//*[starts-with(text(), 'Java is')]"));
//        System.out.println(findInValidElementText.isDisplayed());   // Return true if Element is found in the webpage otherwise false

    }
}
