package b.Selenium.locator.chapter2.c.CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACSSSelectorIntro {
    public static void main(String[] args) {
        /*
        Points to Remember
        1. CSS Selector is a powerful way to locate elements on a web page using their attributes, classes, IDs, and other properties.
        2. CSS Selectors can be used in Selenium WebDriver to find elements for interaction.
        3. CSS Selectors are based on Symbol based syntax, which is different from the path-based syntax of XPath. for Example ID and Class are represented by # and . respectively in CSS Selectors.
        3. The syntax for CSS Selectors is different from XPath, and it can be more concise and faster in some cases.
        4. Common CSS Selector patterns include:
           - By ID: #elementId
           - By Class: .className
           - By Attribute: [attribute='value']
            - By Tag and Class: tag.className
            - By Tag and ID: tag#elementId
            - By Tag and Attribute: tag[attribute='value']

         */
        System.out.println("Launched Browser");
        WebDriver openGoogleBrowser = new ChromeDriver();
        openGoogleBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("1.Use the CSS Selector as ID using # symbol");
        WebElement findElementCSSSelectorID = openGoogleBrowser.findElement(By.cssSelector("#lists")); // In the following Code we are tried to find the html element using CSS Selector as ID using # symbol
        System.out.println(findElementCSSSelectorID.isDisplayed());   // Return true if Element is found in the webpage otherwise false


    }
}
