package b.Selenium.chapter2.blocators.xpathsExamples.xpaths_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AXpathFunctionTextWithExceptionValidation {
    /*
    Points to Remember
    1 Xpath Functions helps to improve to write webelements better there are different types of xpath Functions
          1. text() or . - text() is the type of xpath function which helps to find element based on text behind the tag, Ensure the given text should be exact. text function is case-sensitive
          for example - In html table one row has text as Notebook then xpath text as follows
            //*[text()='Notebook']  -- Correct here we have defined text() function with * symbol which means any tag
            //td[text()='Notebook']  -- Correct here we have defined text() function with html tag
           //*[text()='NOTEBOOK']  -- Incorrect as text() function text is case sensitive
                      //*[text()='notebook']  -- Incorrect as text() function text is case sensitive
        //*[text()='NOTEBoOK']  -- Incorrect as text() function text is case sensitive
          //*[text()='Notebook ']  -- Incorrect as text() function text is case-sensitive we have given extra Space


          2. contains()
          3. starts-with()
          4. ends-with()
          5. position()
          6. last()
          7. normalize-space
     */

    public static void main(String[] args) {
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        try {
            System.out.println("Find the Particular HTML Text using contains with text() Function * means Any Tag");
            WebElement findElementByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='Note']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with Uppercase using contains with text() Function * means Any Tag");
            WebElement findSameElementUppercaseByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='NOTE']")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
            System.out.println(findSameElementUppercaseByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with lowercase contains with  text() Function * means Any Tag");
            WebElement findSameElementLowerCaseByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='Note']")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
            System.out.println(findSameElementLowerCaseByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with toggle contains with using text() Function * means Any Tag");
            WebElement findSameElementToggleCaseByTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='nOtE']")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
            System.out.println(findSameElementToggleCaseByTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text Element with Extra Space using contains with text() Function * means Any Tag");
            WebElement findElementByTextFunctionUsingExtraSpace = openBrowser.findElement(By.xpath("//*[text()='Note ']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementByTextFunctionUsingExtraSpace.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text using contains with text() Function using Particular HTML Tag");
            WebElement findElementByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='Note']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text.       System.out.println(findElementByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
            System.out.println(findElementByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with Uppercase using contains with text() Function using Particular HTML Tag");
            WebElement findSameElementUppercaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='NOTE']")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
            System.out.println(findSameElementUppercaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with lowercase contains with  text() Function using Particular HTML Tag");
            WebElement findSameElementLowerCaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='note']")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
            System.out.println(findSameElementLowerCaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with toggle contains with using text() Function using Particular HTML Tag");
            WebElement findSameElementToggleCaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='NoTe']")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
            System.out.println(findSameElementToggleCaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text Element with Extra Space using contains with text() Function using Particular HTML Tag");
            WebElement findElementByTextFunctionWithExtraSpaceUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='Note ']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementByTextFunctionWithExtraSpaceUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        }
        catch(NoSuchElementException exceptionText)
        {
            System.out.println("Exception Found");
        }
    }
}
