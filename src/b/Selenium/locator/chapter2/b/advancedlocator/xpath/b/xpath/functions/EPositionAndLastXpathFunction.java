package b.Selenium.locator.chapter2.b.advancedlocator.xpath.b.xpath.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EPositionAndLastXpathFunction {
    /*
    Points to Remember
    1. Position() is an XPath function that returns the position of a node in a node set.
    2. The position of a node is determined by its order in the document, starting from 1 for the first node.
    3. The position() function can be used in conjunction with other XPath functions and
    axes to select specific nodes based on their position in the document.
    4. node is basically the element in the DOM, and position() is used to find the index of that element
     in the list of elements that match a certain criteria.

    For example, you can use position() to select the first, second, or nth node in a node set.
   // select the first id tagged with element
    (//input[@id='input])[postion()=1]
    // select the second id tagged with element
    (//input[@id='input'])[postion()=2]


//        // As following xpath expression is incorrect, it throws runtime exception as InvalidSelectorException
//        WebElement invalidElement = openBrowser.findElement(By.xpath("//*[@name='myyNameisUniqueAndTested'][position()=one)]"));
//        System.out.println("The first element with id 'input' is: " + invalidElement.isDisplayed());

           System.out.println("find the invalid element with id 'input' using position() function");
//        // As following xpath expression is incorrect, it throws runtime exception as InvalidSelectorException
//        WebElement invalidElement = openBrowser.findElement(By.xpath("//*[@name='myyNameisUniqueAndTested'][position()=1)]"));
//        System.out.println("The first element with id 'input' is: " + invalidElement.isDisplayed());


     */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

     System.out.println("1.find the 1st element with id 'input' using position() function");
        // As following xpath expression is incorrect, it throws runtime exception as InvalidSelectorException
        WebElement firstElement = openBrowser.findElement(By.xpath("(//*[@name='myyNameisUniqueAndTested'])[position()=1]"));
        System.out.println("The first element with id 'input' is: " + firstElement.isDisplayed());

        System.out.println("2.find the 2nd element with id 'input' using position() function");
        WebElement secondElement = openBrowser.findElement(By.xpath("(//*[@name='myyNameisUniqueAndTested'])[position()=2]"));
        System.out.println("The first element with id 'input' is: " + secondElement.isDisplayed());

        System.out.println("3.find the 3rd element with id 'input' using position() function");
        WebElement thirdElement = openBrowser.findElement(By.xpath("(//*[@name='myyNameisUniqueAndTested'])[position()=3]"));
        System.out.println("The first element with id 'input' is: " + thirdElement.isDisplayed());

        System.out.println("4.find the 4th element with id 'input' using position() function");
        WebElement fourthElement = openBrowser.findElement(By.xpath("(//*[@name='myyNameisUniqueAndTested'])[position()=4]"));
        System.out.println("The first element with id 'input' is: " + fourthElement.isDisplayed());


        System.out.println("find the last element with id 'input' using position() function");
        WebElement fifthElement = openBrowser.findElement(By.xpath("(//*[@name='myyNameisUniqueAndTested'])[last()]"));
        System.out.println("The first element with id 'input' is: " + fifthElement.isDisplayed());


        System.out.println("find the invalid element with id 'input' using position() function");
//        // As following xpath expression is incorrect, it throws runtime exception as InvalidSelectorException
//        WebElement invalidElement = openBrowser.findElement(By.xpath("//*[@name='myyNameisUniqueAndTested'][position()=1)]"));
//        System.out.println("The first element with id 'input' is: " + invalidElement.isDisplayed());

//                System.out.println("find the invalid element with id 'input' using position() function");
//        // As following xpath expression is incorrect, it throws runtime exception as InvalidSelectorException
//        WebElement invalidElement = openBrowser.findElement(By.xpath("//*[@name='myyNameisUniqueAndTested'][position()=one)]"));
//        System.out.println("The first element with id 'input' is: " + invalidElement.isDisplayed());

    }

}
