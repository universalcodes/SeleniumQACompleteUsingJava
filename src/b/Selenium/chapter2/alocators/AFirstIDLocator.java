package b.Selenium.chapter2.alocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFirstIDLocator {

    public static void main(String[] args) {

        /*
        Points to Remember
        1. "Locator is used to find web elements in a webpage.
        Generally, locators are applied to elements inside the <body> section (like header, footer, buttons, inputs),
        because these are visible to the user. Elements inside <head> can also be located,
         but they are non-visual

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

        6. ID Locator is the one of fastest Locator 
         */



        /*----------------- Positive Case 1 --------------------------
        In the following code, we are going to work with ID Locator of given webpage
        In the following code we need to ensure that element is the present in the webpage,
        but It's not visible then isDisplayed() Method returns false
        /*
         */


                WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("https://the-internet.herokuapp.com/");

        // following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openBrowser.get("the-internet.herokuapp.com/");

        //WebElement validLocatorCheckID = openBrowser.findElement(By.id(content)); // Compile Time Error name locator is not given in String
        WebElement validLocatorCheckID = openBrowser.findElement(By.id("content"));


        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        //  where we can validate weather given Locator is present or not in the webpage
        boolean checkLocatorIDValid =validLocatorCheckID.isDisplayed();
        System.out.println("Element is Present but Not Visible\t"+checkLocatorIDValid);  // The Result is false as given Locator is Present in the webpage but not visible didnt throws the NoSuchElementException as well

        System.out.println("One Test Case is Passed");


        //----------------- Positive Case 2 --------------------------

       /* In the following code, we are going to work with ID Locator of given webpage
        In the following code we need to ensure that element is the present in the webpage,
        & should be visible then isDisplayed() Method returns true */


        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/nameExample.html");
        //WebElement validLocatorCheckID = openBrowser.findElement(By.id(fname)); // Compile Time Error name locator is not given in String
        WebElement validLocatorCheckID2 = openBrowser.findElement(By.id("fname"));

        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        //  where we can validate weather given Locator is present or not in the webpage
        boolean checkLocatorIDValid2 =validLocatorCheckID2.isDisplayed();
        System.out.println("Element is Present & Visible as well \t"+checkLocatorIDValid2);  // The Results returns true as Element is Present & Visible too
        System.out.println("Second Test Case is Passed");


        //----------------- Negative Case --------------------------


        // In the following line, we're looking for given id Yogesh if given id locator value is not found in the webpage then
        //NoSuchElementException Exception is displayed in the Console & Code is not reached to next line of Code as Java runs line by line
        WebElement invalidLocatorCheckID = openBrowser.findElement(By.id("yogesh"));
        // isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        // where we can validate weather given Locator is present or
        //displayed in the webpage
         boolean checkLocatorName =invalidLocatorCheckID.isDisplayed();
        // System.out.println(checkLocatorName);


    }
}
