package b.Selenium.chapter2.blocators.xpathsExamples.xpaths_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AXpathFunctionText {
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
            System.out.println("Find the Particular HTML Text using text() Function * means Any Tag");
            WebElement findElementByTextFunctionUsingAstrick = openBrowser.findElement(By.xpath("//*[text()='Notebook']")); // In the Following Code we are tried to find html text using text() function using  * means Any Tag
            System.out.println(findElementByTextFunctionUsingAstrick.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text using text() Function using Particular HTML Tag");
            WebElement findElementByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//*[text()='Notebook']")); // In the Following Code we are tried to find html text using text() function using Particular Tag
            System.out.println(findElementByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with Uppercase using text() Function * means Any Tag");
            WebElement findAnotherElementByTextFunctionUsingAstrick = openBrowser.findElement(By.xpath("//*[text()='NOTEBOOK']")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
            System.out.println(findAnotherElementByTextFunctionUsingAstrick.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with lowercase using text() Function * means Any Tag");
            WebElement findSameElementUppercaseByTextFunctionUsingAstrick = openBrowser.findElement(By.xpath("//*[text()='notebook']")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
            System.out.println(findSameElementUppercaseByTextFunctionUsingAstrick.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with lowercase using text() Function * means Any Tag");
            WebElement findSameElementLowercaseByTextFunctionUsingAstrick = openBrowser.findElement(By.xpath("//*[text()='notebook']")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
            System.out.println(findSameElementLowercaseByTextFunctionUsingAstrick.isDisplayed());   // Return true if Element is found in the webpage otherwise false


            System.out.println("Find the Particular HTML Text with lowercase using text() Function * means Any Tag");
            WebElement findSameElementToggleByTextFunctionUsingAstrick = openBrowser.findElement(By.xpath("//*[text()='NotebOoK']")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
            System.out.println(findSameElementToggleByTextFunctionUsingAstrick.isDisplayed());   // Return true if Element is found in the webpage otherwise false


            System.out.println("Find the Particular HTML Text using text() Function * means Any Tag");
            WebElement findSameElementWithGivenSpaceByTextFunctionUsingAstrick = openBrowser.findElement(By.xpath("//*[text()='Notebook ']")); // In the Following Code we are tried to find html text using text() function where Xtra Space is Given using  * means Any Tag
            System.out.println(findElementByTextFunctionUsingAstrick.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        }
        catch(NoSuchElementException exceptionText)
        {
            System.out.println("Exception Found");
        }
    }
}
