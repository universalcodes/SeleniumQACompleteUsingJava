package b.Selenium.locator.chapter2.b.xpathlocatorsComplete.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AParentXpathAxes {
    /*
    points to remember
    when the user wants to find the parent element in the webpage then we used parent
    syntax
        //tagname[@attribute='attributeValue']/parent::tagname
     */
    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("1.Use the Parent Xpath Axes with text() & Find the Parent Element of the Webpage ");
        // In the following code, we are trying to find parent tag based on the child element which is present in the webpage, and we have used text()
        // as This is a  to find the child element & then we are trying to find the parent element of that child element
        //we have used text() as Step 1 & we are trying the next element which comes after that element
        WebElement findElementThroughParentXpathAxes = openBrowser.findElement(By.xpath("//*[text()='This is a ']/parent::section"));
        System.out.println(findElementThroughParentXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Use the Parent Xpath Axes with html Tag & Find the Parent Element of the Webpage ");
        // In the following code, we are trying to find parent tag based on the child element which is present in the webpage, and we have used child tag
        // as h1 to find the child element & then we are trying to find the parent element of that child element
        WebElement findElementThroughParentXpathAxes2 = openBrowser.findElement(By.xpath("//h1/parent::header"));
        System.out.println(findElementThroughParentXpathAxes2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Use the Parent Xpath Axes with Normalize Text & Find the Parent Element of the Webpage ");
        // In the following code, we are trying to find parent tag based on the child element which is present in the webpage, and we have used child tag
        // as h1 to find the child element & then we are trying to find the parent element of that child element
        WebElement findElementThroughParentXpathAxes3 = openBrowser.findElement(By.xpath("//*[normalize-space(.)='This is Normalize Text']//parent::p"));
        System.out.println(findElementThroughParentXpathAxes3.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("4.Use the Parent Xpath Axes with Attribute & Find the Parent Element of the Webpage using Parent Attribute ");
        // In the following code, we are trying to find parent tag based on the child element which is present in the webpage, and we have used child tag
        // as h1 to find the child element & then we are trying to find the parent element of that child element
        WebElement findElementThroughParentXpathAxes4 = openBrowser.findElement(By.xpath("//*[@type='radio']//parent::p[@class='account-row']"));
        System.out.println(findElementThroughParentXpathAxes4.isDisplayed());   // Return true if Element is found in the webpage otherwise false



    }
}
