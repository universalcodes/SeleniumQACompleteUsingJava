package b.Selenium.locator.chapter2.b.advancedlocator.xpath.d.xpathxaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADescendantXpathAxes {
    /*
     points to remember
     1. descendant Axis is used to find the child, grandchild, great grandchild and so on of the current node.
     2. descendant Axis is represented by ::descendant
     3. A Basic Syntax as follows
     //tagName[@attribute='attributeValue']/descendant::tagName
        we should know about the html hierarchy of the webpage to use the descendant axis,
        as it is used to find the child, grandchild, great grandchild and so on of the current node.
        for example:
        here is the html code of the webpage which we are going to use for finding the element using descendant xpath axes
        <section id="bank-section"> Dada
    <h2>Bank Services</h2>

    <!-- Parent DIV with multiple nested children -->
    <div id="account-options"> child of bank-section
        <p class="account-row"> 1st grand  child of bank-section but child of account-options
            <span class="label">This is Normalize Text</span> great grand child of bank-section grand child of account-options
            <strong>Extra Bold Child</strong> 2nd great grand child of bank-section and 2nd grand child of account-options
            <em>Italic Child</em>
            <a href="#">Click Here</a>
        </p>

        <p class="account-row1">2nd child of account-options  but 2nd grand  child of bank-section
            <span class="label">Savings Account</span>  2nd grand child of account-options  but 2nd grat grand  child of Bank Services from  child account-options
            <input type="radio" name="accountType" value="savings">
        </p>

        <p class="account-row">
            <span class="label">Current Account</span>
            <input type="radio" name="accountType" value="current">
        </p>
    </div>

    <!-- Another parent with nested structure -->
    <div id="loan-options">
        <p class="loan-row">
            <span class="label">Home Loan</span>
            <button>Apply</button>
        </p>
        <p class="loan-row">
            <span class="label">Car Loan</span>
            <button>Apply</button>
        </p>
    </div>
</section>

        <section id="bank-section">   → Dada / Ancestor
│
├── <h2>Bank Services</h2>    → Child of section
│
├── <div id="account-options"> → Child of section
│   │
│   ├── <p class="account-row"> → Child of account-options, Grandchild of section
│   │   ├── <span> → Child of p, Grandchild of div, Great-grandchild of section
│   │   ├── <strong> → Same level as span
│   │   ├── <em> → Same level as span
│   │   └── <a> → Same level as span
│   │
│   ├── <p class="account-row1"> → Another child of account-options, Grandchild of section
│   │   ├── <span> → Child of p, Grandchild of div, Great-grandchild of section
│   │   └── <input> → Same level as span
│   │
│   └── <p class="account-row"> → Third child of account-options, Grandchild of section
│       ├── <span> → Child of p
│       └── <input> → Child of p
│
└── <div id="loan-options"> → Another child of section
    │
    ├── <p class="loan-row"> → Child of loan-options, Grandchild of section
    │   ├── <span> → Child of p, Great-grandchild of section
    │   └── <button> → Child of p, Great-grandchild of section
    │
    └── <p class="loan-row"> → Another child of loan-options
        ├── <span> → Child of p
        └── <button> → Child of p


      */
    public static void main(String[] args) {

        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("1.Use the Descendant Xpath Axes and Find the Descendant Element 1st Child of the Webpage ");
        WebElement findElementThroughDescendantXpathAxes = openBrowser.findElement(By.xpath("//*[@id='bank-section']/descendant::div[@id='account-options']"));
        System.out.println(findElementThroughDescendantXpathAxes.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("2.Use the Descendant Xpath Axes and Find the Descendant Element Grand Child of the Webpage ");
        WebElement findElementThroughDescendantXpathAxes2 = openBrowser.findElement(By.xpath("//*[@id='bank-section']/descendant::p[@class='account-row']"));
        System.out.println(findElementThroughDescendantXpathAxes2.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("3.Use the Descendant Xpath Axes and Find the Descendant Element Great Grand Child of the Webpage ");
        WebElement findElementThroughDescendantXpathAxes3 = openBrowser.findElement(By.xpath("//*[@id='bank-section']/descendant::*[text()='This is Normalize Text']"));
        System.out.println(findElementThroughDescendantXpathAxes3.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("4.Use the Descendant Xpath Axes and Find the Descendant Element Great Grand Child of the Webpage using Contains ");
        WebElement findElementThroughDescendantXpathAxes4 = openBrowser.findElement(By.xpath("//*[@id='bank-section']/descendant::*[contains(text(), 'Normalize Text')]"));
        System.out.println(findElementThroughDescendantXpathAxes4.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("5.Use the Descendant Xpath Axes and Find the Descendant Element 2nd Great Grand Child of the Webpage using Contains ");
        WebElement findElementThroughDescendantXpathAxes5 = openBrowser.findElement(By.xpath("//*[@id='bank-section']/descendant::*[contains(text(), 'Extra Bold Child')]"));
        System.out.println(findElementThroughDescendantXpathAxes5.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("6.Use the Descendant Xpath Axes and Find the Descendant Element 2nd Child of account-options inside the Webpage ");
        WebElement findElementThroughDescendantXpathAxes6 = openBrowser.findElement(By.xpath("//*[@id='account-options']/descendant::p[@class='account-row1']"));
        System.out.println(findElementThroughDescendantXpathAxes6.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("7.Use the Descendant Xpath Axes and Find the Descendant Element account-options 2nd Child's Great Grand Child of the Webpage ");
        WebElement findElementThroughDescendantXpathAxes7 = openBrowser.findElement(By.xpath("//*[@id='account-options']/descendant::span[contains(text(), 'Savings')]"));
        System.out.println(findElementThroughDescendantXpathAxes7.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("8.Another Way of Finding the Descendant Element Where we defined bank-section & finding the 2nd Child of account-options as Descendant Element of the Webpage ");
        WebElement findElementThroughDescendantXpathAxes8 = openBrowser.findElement(By.xpath("//*[@id='bank-section']//*[@class=\"account-row1\"]"));
        System.out.println(findElementThroughDescendantXpathAxes8.isDisplayed());   // Return true if Element is found in the webpage otherwise false

        System.out.println("9.Another Way of Finding the Descendant Element Where we defined bank-section as Parent and loan-options as Child Element of the Webpage ");
        WebElement findElementThroughDescendantXpathAxes9 = openBrowser.findElement(By.xpath(" //*[@id='bank-section']//*[@id='loan-options']"));
        System.out.println(findElementThroughDescendantXpathAxes9.isDisplayed());   // Return true if Element is found in the webpage otherwise false




    }
}
