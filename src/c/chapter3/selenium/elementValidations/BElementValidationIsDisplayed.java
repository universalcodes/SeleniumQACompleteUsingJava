package c.chapter3.selenium.elementValidations;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BElementValidationIsDisplayed {
    /*
    points to remember
      To Validate such elements, it requires some inbuilt methods such as
        * isDisplayed() - This method helps to validate that weather web element visible within the page
            return type is boolean, no argument is required
            *  If the Element is Not visible then it throws an Exception as NoSuchElementException
            *  If  user tries same element multiple times if we should use List Interface
            *  If Same multiple elements not present then no exception is occurred it returns 0



     */
    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("1. Validate Valid Element is present using isDisplayed()");
        WebElement checkValidWebElement = openBrowser.findElement(By.xpath("//*[text()='Semantics']"));
        boolean validElementResult = checkValidWebElement.isDisplayed();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResult);
        System.out.println(checkValidWebElement.isDisplayed());   // Return true if Element is found in the webpage otherwise false



        System.out.println("3. Validate Valid Same Element Multiple Times present using isDisplayed()");
        List<WebElement> checkValidSameWebElements = openBrowser.findElements(By.tagName("li"));
        System.out.println("The Number of Elements as follows\t"+checkValidSameWebElements.size());
        for (WebElement validateMultipleElements: checkValidSameWebElements)
        {
            boolean validSameMultipleElementsResult = validateMultipleElements.isDisplayed();
            System.out.println("The Result of Valid Element as follows:\t"+validSameMultipleElementsResult);
        }


        System.out.println("2. Validate InValid Element is present using isDisplayed() in try catch block");
        try {
            WebElement checkInvalidWebElement = openBrowser.findElement(By.xpath("//*[text()='Semantics1']"));
            boolean invalidElementResult = checkInvalidWebElement.isDisplayed();
            System.out.println("The Result of InValid Element as follows:\t"+invalidElementResult);

        }
        catch(NoSuchElementException exception){
            System.out.println(exception.getMessage());

        }



        /*
        Uncomment To Test
        If the Element is Not visible then it throws an Exception as NoSuchElementException
        System.out.println("2. Validate InValid Element is present using isDisplayed()");
        WebElement checkInvalidWebElement = openBrowser.findElement(By.xpath("//*[text()='Semantics1']"));
        boolean invalidElementResult = checkInvalidWebElement.isDisplayed();
        System.out.println("The Result of InValid Element as follows:\t"+invalidElementResult);
         */

        System.out.println("4. Validate In Valid Same Element Multiple Times present using isDisplayed()");
        List<WebElement> checkInvalidSameWebElements = openBrowser.findElements(By.tagName("Test"));
        System.out.println("The Number of Elements as follows\t"+checkInvalidSameWebElements.size());
        for (WebElement validateMultipleInvalidElements: checkInvalidSameWebElements)
        {
            boolean validateSameMultipleInvalidElementsResult = validateMultipleInvalidElements.isDisplayed();
            System.out.println("Element not found on page.");
            System.out.println("The Result of Valid Element as follows:\t"+validateSameMultipleInvalidElementsResult);
        }



    }
}
