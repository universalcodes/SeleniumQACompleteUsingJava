package b.Selenium.chapter2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFirstLocator {

    public static void main(String[] args) {

        /*
        Points to Remember
        1. Locator is used to help find  the web Element in the given webpage
        2. There are different types of Locators . id, name, className, cssSelector
        tagName, linkText, patrialLinkText xpath
        3. To work with Locator, we require some components
            Interface - WebElement which contains different methods
            like click(), clear() sendkeys() and many more
            findElement() method which is part of the Super Interface SearchContext & Interface of WebElement
        4. By is the abstract class which different locators as method such as
        id, name, className, cssSelector
        tagName, linkText, patrialLinkText xpath
        5.   ensure that locator value must be string return type
            example By.id("yogesh"));  // Yogesh is given in the String



         */

        /*
            In the following code, we are going to work with Id Locator of given webpage
            Id locator is one of the fastest locator which provides elements instantly without scanning the entire DOM



         */

        WebDriver openBroswer = new ChromeDriver();

        openBroswer.get("https://the-internet.herokuapp.com/");

        // following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openBroswer.get("the-internet.herokuapp.com/");

        //----------------- Postive Case --------------------------

  //WebElement validLocatorCheckID = openBroswer.findElement(By.id(page-footer)); // Compile Time Error Id locator is not given in String
        WebElement validLocatorCheckID = openBroswer.findElement(By.id("page-footer"));


        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
       //  where we can validate weather given Locator is present or
     //   displayed in the webpage
         boolean checkLocatorValid =validLocatorCheckID.isDisplayed();
         System.out.println(checkLocatorValid);  // The Result is true as given Locator is Present in the webpage


        //----------------- Negative Case --------------------------


        // In the following line, we're looking for given id Yogesh if locator is not found in the webpage then
        //NoSuchElementException Exception is displayed in the Console & Code is not reached to next line of Code
      //  WebElement invalidLocatorCheckID = openBroswer.findElement(By.id("yogesh"));

        // isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        // where we can validate weather given Locator is present or
        //displayed in the webpage
       // boolean checkLocator =invalidLocatorCheckID.isDisplayed();
       // System.out.println(checkLocator);





    }
}
