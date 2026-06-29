package b.Selenium.locator.chapter2.b.xpathlocatorsComplete.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFollowingXpathAxes {
    /*
    points to remember
    1. following xpath axes - It is used to check all child element, grand child elements apart from the current node which is pointed
    syntax -         By.xpath("//tagName[@ anyattribute='anyattributeValue']/following::tagName
        syntax -         By.xpath("//p[@id='acc1']/following::p   // p is the tag, id is the attribute :: is known method Axis Operator
In the above code user is trying to find the all elements of p tag after id= acc1
    <html>
  <body>
    <h2>Bank Accounts</h2>
    <p id="acc1">User1 - Savings</p>
    <p id="acc2">User2 - Current</p>
    <p id="acc3">User3 - Loan</p>
    <p id="acc4">User4 - Savings</p>
  </body>
</html>


     */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("1.Use the following Xpath Axes with text() & Find the Next Element of the Webpage ");
        // In the following code, we are trying to find descendant which means finding all child and grand child and so on
        //we have used text() as Step 1 & we are trying the next element which comes after that element
            WebElement findElementThroughFollowingXpathAxes = openBrowser.findElement(By.xpath("//*[text()='Step 1']/following::li[1]"));
        System.out.println(findElementThroughFollowingXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Use the following Xpath Axes with text() & Find the Next Element of the Webpage, we have Extra // ");
        // In the following code, we are trying to find descendant which means finding all child and grand child and so on
        //we have used text() as Step 1 & we are trying to find the next element which comes after that element
        // Use of // is quite unnecessary, as it provides the same result, // helps to traverse everywhere within in the webpage
        WebElement findElementThroughFollowingXpathAxes2 = openBrowser.findElement(By.xpath("//*[text()='Step 1']/following::li[1]"));
        System.out.println(findElementThroughFollowingXpathAxes2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Use the following Xpath Axes with text() & Find the Next Table Element of the Webpage  ");
        // In the following code, we are trying to find descendant which means finding all child and grand child and so on
        //we have used text() as Notebook & we are trying to find the all the table data using td after current td - Notebook
        WebElement findElementThroughFollowingXpathAxes3 = openBrowser.findElement(By.xpath("//td[text()='Notebook']/following::td"));
        System.out.println(findElementThroughFollowingXpathAxes3.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("4.Use the following Xpath Axes with text() & Find the Next Table Element of the Webpage  ");
        // In the following code, we are trying to find descendant which means finding all child and grand child and so on
        // we have used contains text() as structure, with the help of structure we are trying to find the another text Aside
        WebElement findElementThroughFollowingXpathAxes4 = openBrowser.findElement(By.xpath("//*[contains(text(), 'structure')]/following::*[text()='Aside']"));
        System.out.println(findElementThroughFollowingXpathAxes4.isDisplayed());   // Return true if Element is found in the webpage otherwise false

//        System.out.println("5.Use the following Xpath Axes with Invalid text()   ");
//        // In the following code, we are trying to find descendant which means finding all child and grand child and so on
//        // we have used contains invalid text() as structure, with the help of structure we are trying to find the another text Aside
//        // as structure is not available in webpage it  throws an runTime Exception as NoSuchElementException
//        WebElement findElementThroughFollowingXpathAxes5 = openBrowser.findElement(By.xpath("//*[contains(text(), 'strducture')]/following::*[text()='Aside']"));
//        System.out.println(findElementThroughFollowingXpathAxes5.isDisplayed());   // Return true if Element is found in the webpage otherwise false


//        System.out.println("6.Use the following Xpath Axes incorrect way  ");
//        // In the following code, we are trying to find a descendant which means finding all child and grand child and so on
//        // we have used incorrect word following then it throws as runtime exception as InvalidSelectorException
//        WebElement findElementThroughFollowingXpathAxes6 = openBrowser.findElement(By.xpath("//*[contains(text(), 'structure')]/folloowing::*[text()='Aside']"));
//        System.out.println(findElementThroughFollowingXpathAxe6.isDisplayed());   // Return true if Element is found in the webpage otherwise false
//
    }}