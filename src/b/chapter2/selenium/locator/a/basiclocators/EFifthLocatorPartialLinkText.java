package b.chapter2.selenium.locator.a.basiclocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EFifthLocatorPartialLinkText {

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

        7. Partial Link Text is also similar Link Text, but In Partial Link Text Complete Link Is not Needed
            for Example - Learn Selenium By UniversalCode1 is complete Text Link Text
            In Case of Partial Link Text this can be following Combinations
                1. Learn
                2. Learn Selenium
                3. Learn Selenium By
                4. Learn Selenium By UniversalCode1




         */

        /*
          //----------------- Positive Case 1 --------------------------
            In the following code, we are going to work with  Partial LinkText Locator of given webpage
        In the following code we need to ensure that element is the present in the webpage,
        but It's not visible then isDisplayed() Method returns false


         */

        WebDriver openGoogleBrowser = new ChromeDriver();
        openGoogleBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        // In the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openGoogleBrowser.get("file:/ull%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        //WebElement validLocatorLinkText = openGoogleBrowser.findElement(By.partialLinkText(Learn)); // Compile Time Error Partial Link Text locator is not given in String
        WebElement validLocatorPartialLinkText = openGoogleBrowser.findElement(By.partialLinkText("Learn"));

        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        //  where we can validate weather given Locator is present or not in the webpage
        boolean validLocatorPartialLinkTextStatus = validLocatorPartialLinkText.isDisplayed();
        System.out.println("Element is Present &  Visible Too\t" + validLocatorPartialLinkTextStatus);  // The Result is false as given Locator is Present in the webpage but not visible didnt throws the NoSuchElementException as well
        //getAttribute() is the inbuilt method which helps to retrieve the String value based on Passed Attribute -- In this we have passed href Attribute
        String getPartialLinkValue = validLocatorPartialLinkText.getAttribute("href");
        System.out.println("Actual Link as Follows:\t"+getPartialLinkValue);
        //getText() is the inbuilt method which helps to retrieve the String value based on Located WebElement of Selenium
        String getPartialLinkValueText = validLocatorPartialLinkText.getText();
        System.out.println("Actual Link Text as Follows:\t"+getPartialLinkValueText);
        System.out.println("One Test Case is Passed");


//
//
//
///*
////        //----------------- Positive Case 2 --------------------------
//
//       /* In the following code, we are going to work with Partial Link Text Locator of given webpage
//        In the following code we need to ensure that element is the present in the webpage,
//        & should be visible then isDisplayed() Method returns true */
//

        // In the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openGoogleBrowser.get("file:/ull%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        //WebElement validLocatorLinkText = openGoogleBrowser.findElement(By.partialLinkText(Learn Selenium)); // Compile Time Error Partial Link Text locator is not given in String
        WebElement validLocatorPartialLinkText2 = openGoogleBrowser.findElement(By.partialLinkText("Learn Selenium"));

        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        //  where we can validate weather given Locator is present or not in the webpage
        boolean validLocatorPartialLinkTextStatus2 = validLocatorPartialLinkText2.isDisplayed();
        System.out.println("Element is Present &  Visible Too\t" + validLocatorPartialLinkTextStatus2);  // The Result is false as given Locator is Present in the webpage but not visible didnt throws the NoSuchElementException as well
        //getAttribute() is the inbuilt method which helps to retrieve the String value based on Passed Attribute -- In this we have passed href Attribute
        String getPartialLinkValue2 = validLocatorPartialLinkText2.getAttribute("href");
        System.out.println("Actual Link as Follows:\t"+getPartialLinkValue2);
        //getText() is the inbuilt method which helps to retrieve the String value based on Located WebElement of Selenium
        String getPartialLinkValueText2 = validLocatorPartialLinkText2.getText();
        System.out.println("Actual Link Text as Follows:\t"+getPartialLinkValueText2);
        System.out.println("Second Test Case is Passed");


////        //----------------- Positive Case 3 --------------------------
//
//       /* In the following code, we are going to work with Partial Link Text Locator of given webpage
//        In the following code we need to ensure that element is the present in the webpage,
//        & should be visible then isDisplayed() Method returns true */
//

        // In the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openGoogleBrowser.get("file:/ull%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        //WebElement validLocatorLinkText = openGoogleBrowser.findElement(By.partialLinkText(Learn Selenium By)); // Compile Time Error Partial Link Text locator is not given in String
        WebElement validLocatorPartialLinkText3 = openGoogleBrowser.findElement(By.partialLinkText("Learn Selenium By"));

        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        //  where we can validate weather given Locator is present or not in the webpage
        boolean validLocatorPartialLinkTextStatus3 = validLocatorPartialLinkText3.isDisplayed();
        System.out.println("Element is Present &  Visible Too\t" + validLocatorPartialLinkTextStatus3);  // The Result is false as given Locator is Present in the webpage but not visible didnt throws the NoSuchElementException as well
        //getAttribute() is the inbuilt method which helps to retrieve the String value based on Passed Attribute -- In this we have passed href Attribute
        String getPartialLinkValue3 = validLocatorPartialLinkText3.getAttribute("href");
        System.out.println("Actual Link as Follows:\t"+getPartialLinkValue3);
        //getText() is the inbuilt method which helps to retrieve the String value based on Located WebElement of Selenium
        String getPartialLinkValueText3 = validLocatorPartialLinkText3.getText();
        System.out.println("Actual Link Text as Follows:\t"+getPartialLinkValueText3);
        System.out.println("Third Test Case is Passed");

        /*----------------- Negative Case --------------------------*/
   //     In the following code, we are going to work with Invalid Partial Link Text Locator of given webpage
//        In the following code we need to ensure that element is the present in the webpage,
//        & should be visible then isDisplayed() Method returns true */
//

        // In the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openGoogleBrowser.get("file:/ull%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        //WebElement validLocatorLinkText = openGoogleBrowser.findElement(By.partialLinkText(Learn Selenium y)); // Compile Time Error Partial Link Text locator is not given in String
       //In the following line we have passed invalid partial Link Text - Learn Selenium y it throws an Exception as NoSuchElementException
        WebElement validLocatorPartialLinkText4 = openGoogleBrowser.findElement(By.partialLinkText("Learn Selenium y"));

        //    isDisplayed() is the inbuilt method with return type boolean comes under WebElement Interface
        //  where we can validate weather given Locator is present or not in the webpage
        boolean validLocatorPartialLinkTextStatus4 = validLocatorPartialLinkText4.isDisplayed();
        System.out.println("Element is Present &  Visible Too\t" + validLocatorPartialLinkTextStatus4);  // The Result is false as given Locator is Present in the webpage but not visible didnt throws the NoSuchElementException as well
        //getAttribute() is the inbuilt method which helps to retrieve the String value based on Passed Attribute -- In this we have passed href Attribute
        String getPartialLinkValue4 = validLocatorPartialLinkText4.getAttribute("href");
        System.out.println("Actual Link as Follows:\t"+getPartialLinkValue4);
        //getText() is the inbuilt method which helps to retrieve the String value based on Located WebElement of Selenium
        String getPartialLinkValueText4 = validLocatorPartialLinkText3.getText();
        System.out.println("Actual Link Text as Follows:\t"+getPartialLinkValueText4);
        System.out.println("Third Test Case is Passed");

    }
}
