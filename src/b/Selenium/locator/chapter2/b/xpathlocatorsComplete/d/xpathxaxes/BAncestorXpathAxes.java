package b.Selenium.locator.chapter2.b.xpathlocatorsComplete.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BAncestorXpathAxes {
    public static void main(String[] args) {
        /*
        points to remember
        1. Ancestor is the opposite of Ancestor, which means if we want to find the Ancestor element of the webpage then we used Ancestor xpath axes,
        Ancestor xpath axes is used to find the child, grandchild, great grandchild and so on Ancestor element of the webpage with the help of Ancestor xpath axes,
        and if we want to find the ancestor element of the webpage then we used ancestor xpath axes that is used to find the parent, grandparent, great grandparent and so on ancestor element of the webpage with the help of ancestor xpath axes.

        2. Ancestor xpath axes syntax is //tagname[@attribute='attributeValue']/ancestor::tagname
            for example
            //input[@id='myId']/ancestor::div
            in the above example we are trying to find the ancestor element of the input tag
            which have id attribute value is myId, and we are trying to find the ancestor element with the help of div tag, it will return the ancestor element of the input tag which have id attribute value is myId, and that ancestor element is div tag in the webpage.


        3. Tree Based Hierary of the Webpage
        │
├── <section id="bank-section"> → Root element (top ancestor)
│   │
│   ├── <h2>Bank Services</h2> → Child of section
│   │
│   ├── <div id="account-options"> → Child of section
│   │   │
│   │   ├── <p class="account-row"> → Child of account-options, Grandchild of section
│   │   │   ├── <span> → Child of p, Ancestors: <p>, <div>, <section>
│   │   │   ├── <strong> → Same level as span, Ancestors: <p>, <div>, <section>
│   │   │   ├── <em> → Same level as span, Ancestors: <p>, <div>, <section>
│   │   │   └── <a> → Same level as span, Ancestors: <p>, <div>, <section>
│   │   │
│   │   ├── <p class="account-row1"> → Another child of account-options, Grandchild of section
│   │   │   ├── <span> → Child of p, Ancestors: <p>, <div>, <section>
│   │   │   └── <input> → Same level as span, Ancestors: <p>, <div>, <section>
│   │   │
│   │   └── <p class="account-row"> → Third child of account-options, Grandchild of section
│   │       ├── <span> → Child of p, Ancestors: <p>, <div>, <section>
│   │       └── <input> → Child of p, Ancestors: <p>, <div>, <section>
│   │
│   └── <div id="loan-options"> → Another child of section
│       │
│       ├── <p class="loan-row"> → Child of loan-options, Grandchild of section
│       │   ├── <span> → Child of p, Ancestors: <p>, <div>, <section>
│       │   └── <button> → Child of p, Ancestors: <p>, <div>, <section>
│       │
│       └── <p class="loan-row"> → Another child of loan-options
│           ├── <span> → Child of p, Ancestors: <p>, <div>, <section>
│           └── <button> → Child of p, Ancestors: <p>, <div>, <section.

         */

        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("1.Use the Ancestor Xpath Axes and Find the Parent Element of the Webpage ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes = openBrowser.findElement(By.xpath("//*[@class='loan-row']/ancestor::div"));
        System.out.println(findElementThroughAncestorXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false


        System.out.println("2.Use the Ancestor Xpath Axes and Find the Great Grand Parent Element of the Webpage ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes2 = openBrowser.findElement(By.xpath("//*[@class='loan-row']/ancestor::div"));
        System.out.println(findElementThroughAncestorXpathAxes2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Use the Ancestor Xpath Axes and Find the Great Grand Parent Element of the Webpage ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes3 = openBrowser.findElement(By.xpath("//*[text()='Apply']/ancestor::section"));
        System.out.println(findElementThroughAncestorXpathAxes3.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("4.Use the Ancestor Xpath Axes and Find the Great Grand Parent Element of the Webpage ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes4 = openBrowser.findElement(By.xpath("//span[normalize-space(.)='This is Normalize Text']/ancestor::div[@id='account-options']"));
        System.out.println(findElementThroughAncestorXpathAxes4.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("5.Use the Ancestor Xpath Axes and Find the Great Grand Parent Element of the Webpage ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes5 = openBrowser.findElement(By.xpath("//strong[contains(text(), 'Extra')]/ancestor::p"));
        System.out.println(findElementThroughAncestorXpathAxes5.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("6.Use the Ancestor Xpath Axes and Find the All the Parents Including Current Node ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes6 = openBrowser.findElement(By.xpath("//strong[contains(text(), 'Extra')]/ancestor-or-self::*"));
        System.out.println(findElementThroughAncestorXpathAxes6.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("7.Use the Ancestor Xpath Axes and Find the All the Parents not Including Current Node ");
        // In the following code, we are trying to find ancestor tag based on the child element
        WebElement findElementThroughAncestorXpathAxes7 = openBrowser.findElement(By.xpath("//strong[contains(text(), 'Extra')]/ancestor::*"));
        System.out.println(findElementThroughAncestorXpathAxes7.isDisplayed());   // Return true if Element is found in the webpage otherwise false


    }
}
