package b.chapter2.selenium.locator.a.basiclocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DFourthLocatorLinkText {

    public static void main(String[] args) {

        /*
        Points to Remember
        1. Locator is used to help find  the web Element in the given webpage
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

        6. LinkText is used to locate the Element which has Anchor Tag, we need to pass actual Link Text

         */

        /*
          //----------------- Positive Case 1 --------------------------
            In the following code, we are going to work with LinkText Locator of given webpage
        In the following code we need to ensure that element is the present in the webpage,
        but It's not visible then isDisplayed() Method returns false


         */

        WebDriver openGoogleBrowser = new ChromeDriver();
        openGoogleBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        // In the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
       // openGoogleBrowser.get("file:/ull%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

  //WebElement validLocatorLinkText = openGoogleBrowser.findElement(By.linkText(Text & formatting)); // Compile Time Error name locator is not given in String
        WebElement validLocatorLinkText = openGoogleBrowser.findElement(By.linkText("Text & formatting"));

        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
       //  where we can validate weather given Locator is present or not in the webpage
         boolean checkLocatorNameValid =validLocatorLinkText.isDisplayed();
         System.out.println("Element is Present &  Visible Too\t"+checkLocatorNameValid);  // The Result is false as given Locator is Present in the webpage but not visible didnt throws the NoSuchElementException as well
        //getAttribute() is the inbuilt method which helps to retrieve the String value based on Passed Attribute
        String getLinkValue = validLocatorLinkText.getAttribute("href");
        System.out.println(getLinkValue);
        System.out.println("One Test Case is Passed");




/*
//        //----------------- Positive Case 2 --------------------------
//
//       /* In the following code, we are going to work with Name Locator of given webpage
//        In the following code we need to ensure that element is the present in the webpage,
//        & should be visible then isDisplayed() Method returns true */
//
//
//        openGoogleBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/nameExample.html");
//        //WebElement validLocatorCheckName = openGoogleBrowser.findElement(By.linkText(Text & formatting)); // Compile Time Error name locator is not given in String
        WebElement validLocatorCheckLinkText2 = openGoogleBrowser.findElement(By.linkText("Forms"));
//
//        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
//        //  where we can validate weather given Locator is present or not in the webpage

        String getLinkValue2 = validLocatorLinkText.getAttribute("href");
        System.out.println(getLinkValue2);

        boolean validLocatorCheckLinkTextStatus =validLocatorCheckLinkText2.isDisplayed();
        System.out.println("Element is Present & Visible as well \t"+validLocatorCheckLinkTextStatus);  // The Results returns true as Element is Present & Visible too
        System.out.println("Second Test Case is Passed");
//
//
//        //----------------- Negative Case --------------------------
//
//
//        // In the following line, we're looking for given name java if given name  locator value is not found in the webpage then
//        //NoSuchElementException Exception is displayed in the Console & Code is not reached to next line of Code as Java runs line by line
        WebElement invalidLocatorLinkText = openGoogleBrowser.findElement(By.linkText("java"));
        boolean invalidLinkTextStatus = invalidLocatorLinkText.isDisplayed();
        System.out.println(invalidLinkTextStatus);
//        // isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
//        // where we can validate weather given Locator is present or
//        //displayed in the webpage
//       // boolean checkLocatorName =invalidLocatorCheckName.isDisplayed();
//       // System.out.println(checkLocatorName);
//  */
    }
}
