package b.chapter2.selenium.locator.b.xpathlocatorsComplete.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BChilldXpathAxes {
    /*
    points to remember
    when the user wants to find the child element in the webpage then we used parent
    syntax
        //tagname[@attribute='attributeValue']/child::tagname
     */
    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        System.out.println("1.Use the Child Xpath Axes with text() & Find the Child Element of the Webpage ");
        // In the following code, we are trying to find child tag based on the parent element which is present in the webpage, and we have used tag
        WebElement findElementThroughChildXpathAxes = openBrowser.findElement(By.xpath("//nav[@aria-label='Primary']/child::ul"));
        System.out.println(findElementThroughChildXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Use the Parent Xpath Axes with html Tag & Find the Child Element of the Webpage ");
        // In the following code, we are trying to find parent tag based on the child element which is present in the webpage, and we have used child tag
        //  used footer element & then we are trying to find the child element of that parent element
        WebElement findElementThroughChildXpathAxes2 = openBrowser.findElement(By.xpath("//footer/child::p"));
        System.out.println(findElementThroughChildXpathAxes2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Use the Child Xpath Axes with Normalize Text & Find the child Element of the Webpage ");
        // In the following code, we are trying to find child tag based on the parent element which is present in the webpage, and we have used child tag
        // as h1 to find the child element & then we are trying to find the parent element of that child element
        WebElement findElementThroughChildXpathAxes3 = openBrowser.findElement(By.xpath("//footer/child::p[normalize-space(text())='© 2026 ChaseBank Demo']"));
        System.out.println(findElementThroughChildXpathAxes3.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("4.Use the Parent Xpath Axes with Attribute & Find the Child Element of the Webpage using Child Attribute ");
        // In the following code, we are trying to find child tag based on the child element which is present in the webpage, and we have used child tag
        // as h1 to find the child element & then we are trying to find the parent element of that child element
        WebElement findElementThroughChildXpathAxes4 = openBrowser.findElement(By.xpath("//*[@id='account-options']/child::p[@class='account-row1']"));
        System.out.println(findElementThroughChildXpathAxes4.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        System.out.println("5.Use the Child Xpath Axes with Contains Text & Find the Child Element of the Webpage using Child Text ");
        // In the following code, we are trying to find child tag based on the child element which is present in the webpage, and we have used child tag
        // as h2 to find the child element & then we are trying to find the child element using contains
        WebElement findElementThroughChildXpathAxes5 = openBrowser.findElement(By.xpath("//*[@id='loans']/child::h2[contains(text(), 'Services')]"));
        System.out.println(findElementThroughChildXpathAxes5.isDisplayed());   // Return true if Element is found in the webpage otherwise false





    }
}
