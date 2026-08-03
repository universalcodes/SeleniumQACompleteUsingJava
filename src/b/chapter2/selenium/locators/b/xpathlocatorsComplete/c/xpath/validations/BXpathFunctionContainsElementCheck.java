package b.chapter2.selenium.locators.b.xpathlocatorsComplete.c.xpath.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BXpathFunctionContainsElementCheck {
    /*
    Points to Remember
    1 Xpath Functions helps to improve to write webelements better there are different types of xpath Functions


          2. contains()  -- contains is very useful as compared to text(). In contains() function we need use
          specific/partial  text of  attribute or  normal HTML text or any html locator such as id /name/ class
          syntax as follows
           //*[contains(attribute, 'value')] or //*[contains(text(), 'value')] or //*[contains(locator, 'value')]



    for example - In html table one row has text as Notebook then contains function  as follows
            //*[contains(text(), 'value')]  -- we have used contains where we have defined partial text using contains  with text() * symbol which means any tag

          3. starts-with()
          4. position()
          5. last()
          6. normalize-space
     */

    public static void main(String[] args) {
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        try {
            System.out.println("Find the Particular HTML Text using contains with text() Function * means Any Tag");
            WebElement findElementByContainsWithTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[contains(text(), 'Note')]")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementByContainsWithTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with Uppercase using contains with text() Function * means Any Tag");
            WebElement findSameElementUppercaseByContainsWithTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[contains(text(), 'NOTE')]")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
            System.out.println(findSameElementUppercaseByContainsWithTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with lowercase contains with  text() Function * means Any Tag");
            WebElement findSameElementLowerCaseByContainsWithTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[contains(text(), 'note')]")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
            System.out.println(findSameElementLowerCaseByContainsWithTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with toggle contains with using text() Function * means Any Tag");
            WebElement findSameElementToggleCaseByContainsWithTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[contains(text(), 'NoTe')]")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
            System.out.println(findSameElementToggleCaseByContainsWithTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text Element with Extra Space using contains with text() Function * means Any Tag");
            WebElement findElementWithExtraSpaceByContainsWithTextFunctionUsingAsterisk = openBrowser.findElement(By.xpath("//*[text()='Note ']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementWithExtraSpaceByContainsWithTextFunctionUsingAsterisk.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text using contains with text() Function using Particular HTML Tag");
            WebElement findElementByContainsWithTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[contains(text(), 'Notebook')]")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text.       System.out.println(findElementByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false
            System.out.println(findElementByContainsWithTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with Uppercase using contains with text() Function using Particular HTML Tag");
            WebElement findSameElementUpperCaseByContainsWithTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[contains(text(), 'NOTE')]")); // In the Following Code we are tried to find same html text given in Uppercase using text() function using  * means Any T
            System.out.println(findSameElementUpperCaseByContainsWithTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with lowercase contains with  text() Function using Particular HTML Tag");
            WebElement findSameElementLowerCaseByTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[contains(text(), 'note')]")); // In the Following Code we are tried to find same html text given in lowercase using text() function using  * means Any T
            System.out.println(findSameElementLowerCaseByTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text with toggle contains with using text() Function using Particular HTML Tag");
            WebElement findSameElementToggleByTextFunctionFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[contains(text(), 'NoTe')]")); // In the Following Code we are tried to find same html text given in togglecase using text() function using  * means Any T
            System.out.println(findSameElementToggleByTextFunctionFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

            System.out.println("Find the Particular HTML Text Element with Extra Space using contains with text() Function using Particular HTML Tag");
            WebElement findElementWithExtraSpaceByContainsWithTextFunctionUsingHTMLTag = openBrowser.findElement(By.xpath("//td[text()='Note ']")); // In the Following Code we are tried to find html element using contains with text(), we have provided partial text instead of complete text we have provided partial text. * means Any Tag
            System.out.println(findElementWithExtraSpaceByContainsWithTextFunctionUsingHTMLTag.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        }
        catch(NoSuchElementException exceptionText)
        {
            System.out.println("Exception Found");
        }
    }
}
