package b.chapter2.selenium.locator.b.xpathlocatorsComplete.b.xpath.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AXpathFunctionTextFunction {
    /*
    Points to Remember
    1 Xpath Functions helps to improve to write webelements better there are different types of xpath Functions
          1. text() or . - text() is the type of xpath function which helps to find element based on text behind the tag, Ensure the given text should be exact. text function is case-sensitive
          for example - In html table one row has text as Note then xpath text as follows
            //*[text()='Note']  -- Correct here we have defined text() function with * symbol which means any tag
            //h1[text()='Note']  -- Correct here we have defined text() function with html tag



           //*[text()='note']  -- Incorrect as text() function text provided in lowercase, it is failed as text() is always case sensitive
                      //*[text()='NOTE']  -- Incorrect as text() function text provided in uppercase, it is failed as text() is always case sensitive
        //*[text()='NoTe']  -- Incorrect as text() function text provided in toggle, it is failed as text() is always case sensitive
          //*[text()='Note ']  -- Incorrect as text() function text provided with extra space, it is failed as text() is always we have given extra Space


          2. contains()
          3. starts-with()
          4. position()
          5. last()
          6. normalize-space
     */

    public static void main(String[] args) {
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

            System.out.println("Find the Particular HTML Text using contains with text() Function * means Any Tag");
            WebElement findElementByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='Note']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        System.out.println("Find the Particular HTML Text using contains with text() Function * means Any Tag");
        WebElement findElementByTextFunctionUsingTag = openBrowser.findElement(By.xpath("//h1[text()='Note']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
        System.out.println(findElementByTextFunctionUsingTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        // Commented Code throws Runtime Exception as text() function is case-sensitive

//            System.out.println("Find the Particular HTML Text with Uppercase using contains with text() Function * means Any Tag");
//            WebElement findSameElementUppercaseByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='NOTE']")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
//            System.out.println(findSameElementUppercaseByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text with lowercase contains with  text() Function * means Any Tag");
//            WebElement findSameElementLowerCaseByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='Note']")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
//            System.out.println(findSameElementLowerCaseByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text with toggle contains with using text() Function * means Any Tag");
//            WebElement findSameElementToggleCaseByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='nOtE']")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
//            System.out.println(findSameElementToggleCaseByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text Element with Extra Space using contains with text() Function * means Any Tag");
//            WebElement findElementByTextFunctionUsingExtraSpace = openBrowser.findElement(By.xpath("//*[text()='Note ']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
//            System.out.println(findElementByTextFunctionUsingExtraSpace.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text using contains with text() Function using Particular HTML Tag");
//            WebElement findElementByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='Note']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text.       System.out.println(findElementByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//            System.out.println(findElementByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text with Uppercase using contains with text() Function using Particular HTML Tag");
//            WebElement findSameElementUppercaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='NOTE']")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
//            System.out.println(findSameElementUppercaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text with lowercase contains with  text() Function using Particular HTML Tag");
//            WebElement findSameElementLowerCaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='note']")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
//            System.out.println(findSameElementLowerCaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text with toggle contains with using text() Function using Particular HTML Tag");
//            WebElement findSameElementToggleCaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='NoTe']")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
//            System.out.println(findSameElementToggleCaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
//            System.out.println("Find the Particular HTML Text Element with Extra Space using contains with text() Function using Particular HTML Tag");
//            WebElement findElementByTextFunctionWithExtraSpaceUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='Note ']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
//            System.out.println(findElementByTextFunctionWithExtraSpaceUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        }

    }

