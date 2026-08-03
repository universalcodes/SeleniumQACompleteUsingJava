package b.chapter2.selenium.locators.c.CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACSSSelectorIntro {
  public static void main(String[] args) {
    /*
    Points to Remember
    1. CSS Selector is a powerful way to locate elements on a web page using their attributes, classes, IDs, and other properties.
    2. CSS Selectors can be used in Selenium WebDriver to find elements for interaction.
    3. CSS Selectors are based on Symbol based syntax, which is different from the path-based syntax of XPath. for Example ID and Class are represented by # and . respectively in CSS Selectors.
    3. The syntax for CSS Selectors is different from XPath, and it can be more concise and faster in some cases.
    4. Common CSS Selector patterns include:
      - By ID: #elementId
      - By Class: .className
      - By Attribute: [attribute='value']
      - By Tag and Class: tag.className
      - By Tag and ID: tag#elementId
      - By Tag and Attribute: tag[attribute='value']

     */
    System.out.println("Launched Browser");
    WebDriver openGoogleBrowser = new ChromeDriver();
    openGoogleBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

    System.out.println("1.Find the Element using the CSS Selector as ID using # symbol");
    WebElement findElementCSSSelectorID = openGoogleBrowser.findElement(By.cssSelector("#lists")); // In the following Code we are tried to find the html element using CSS Selector as ID using # symbol
    System.out.println(findElementCSSSelectorID.isDisplayed());  // Return true if Element is found in the webpage otherwise  It Throws An Exception as :NoSuchElementException

    System.out.println("2.Find the Element using the CSS Selector as Class using . symbol");
    WebElement findElementCSSSelectorClass = openGoogleBrowser.findElement(By.cssSelector(".btn")); // In the following Code we are tried to find the html element using CSS Selector as Class using . symbol
    System.out.println(findElementCSSSelectorClass.isDisplayed());  // Return true if Element is found in the webpage otherwise  It Throws An Exception as :NoSuchElementException

    System.out.println("3.Find the Element using the CSS Selector as Attribute using [] symbol");
    WebElement findElementCSSSelectorAttribute = openGoogleBrowser.findElement(By.cssSelector("[name=' normalize-name']")); // In the following Code we are tried to find the html element using CSS Selector as Attribute using [attribute=value] symbol
    System.out.println(findElementCSSSelectorAttribute.isDisplayed());  // Return true if Element is found in the webpage otherwise  It Throws An Exception as :NoSuchElementException

    System.out.println("4.Find the Element using the CSS Selector as Tag name + ID using # symbol");
    WebElement findElementCSSSelectorHTMLTagAndID = openGoogleBrowser.findElement(By.cssSelector("section#lists")); // In the following Code we are tried to find the html element using CSS Selector as tag and id using tagname# symbol
    // in the above code we have used section as tag name and #lists as id, it will find the element with tagname section and id lists
    System.out.println(findElementCSSSelectorHTMLTagAndID.isDisplayed());  // Return true if Element is found in the webpage otherwise  It Throws An Exception as :NoSuchElementException

    System.out.println("5.Find the Element using the CSS Selector as Tag name + Class . symbol");
    WebElement findElementCSSSelectorHTMLTagAndClass = openGoogleBrowser.findElement(By.cssSelector("button.btn")); // In the following Code we are tried to find the html element using CSS Selector as tag and class using tagname. symbol
    // In the above code we have used button as tagname and .btn as class, it will find the element with tagname button and class btn
    System.out.println(findElementCSSSelectorHTMLTagAndClass.isDisplayed());  // Return true if Element is found in the webpage otherwise  It Throws An Exception as :NoSuchElementException

    System.out.println("6.Find the Element using the CSS Selector as Tag name + Attribute using [] symbol");
    WebElement findElementCSSSelectorHTMLTagAndAttribute = openGoogleBrowser.findElement(By.cssSelector("input[name=' normalize-name']")); // In the following Code we are tried to find the html element using CSS Selector as tagname+Attribute using tagname[attribute=value] symbol
    // In the above code we have used input as tagname and [name='normalize-name'] as attribute, it will find the element with tagname meta and attribute name='description'
    System.out.println(findElementCSSSelectorHTMLTagAndAttribute.isDisplayed());  // Return true if Element is found in the webpage otherwise  It Throws An Exception as :NoSuchElementException
/*
      //-------------------------------------------------------------------------- Invalid Use Cases of CSS Selector --------------------------------------------------------------------------

      //Uncomment the below code to see the exception as NoSuchElementException, as the HTML Element is Invalid, It Throws An Exception as :NoSuchElementException
      System.out.println("1.Find the Invalid Element using the CSS Selector as ID using # symbol");
      WebElement findInvalidElementCSSSelectorID = openGoogleBrowser.findElement(By.cssSelector("#lists11")); // In the following Code we are tried to find the invalid html element using CSS Selector as ID using # symbol
      System.out.println(findInvalidElementCSSSelectorID.isDisplayed());  // As HTML Element is Invalid, It Throws An Exception as :NoSuchElementException

      //Uncomment the below code to see the exception as NoSuchElementException, as the HTML Element is Invalid, It Throws An Exception as :NoSuchElementException
      System.out.println("2.Find the Invalid Element using the CSS Selector as Class using . symbol");
      WebElement findInvalidCSSSelectorClass = openGoogleBrowser.findElement(By.cssSelector(".btn1")); // In the following Code we are tried to find the invalid html element using CSS Selector as Class using . symbol
      System.out.println(findInvalidCSSSelectorClass.isDisplayed());  // As HTML Element is Invalid,  It Throws An Exception as :NoSuchElementException

      //Uncomment the below code to see the exception as NoSuchElementException, as the HTML Element is Invalid, It Throws An Exception as :NoSuchElementException
      System.out.println("3.Find the Invalid Element using the CSS Selector as Attribute using [] symbol");
      WebElement findInvalidElementCSSSelectorAttribute = openGoogleBrowser.findElement(By.cssSelector("[name=' normalize-na1me']")); // In the following Code we are tried to find the invalid html element using CSS Selector as Attribute using [attribute=value] symbol
      System.out.println(findInvalidElementCSSSelectorAttribute.isDisplayed());  // As HTML Element is Invalid, It Throws An Exception as :NoSuchElementException

      //Uncomment the below code to see the exception as NoSuchElementException, as the HTML Element is Invalid, It Throws An Exception as :NoSuchElementException
      System.out.println("4.Find the Invalid Element using the CSS Selector as Tag name + ID using # symbol");
      WebElement findInvalidElementCSSSelectorHTMLTagAndID = openGoogleBrowser.findElement(By.cssSelector("section#listscv")); // In the following Code we are tried to find the invalid html element using CSS Selector as tag and id using tagname# symbol
      // in the above code we have used section as tag name and #listscv as id, it will find the element with tagname section and id listscv
      System.out.println(findInvalidElementCSSSelectorHTMLTagAndID.isDisplayed());  // As HTML Element is Invalid, It Throws An Exception as :NoSuchElementException

      //Uncomment the below code to see the exception as NoSuchElementException, as the HTML Element is Invalid, It Throws An Exception as :NoSuchElementException
      System.out.println("5.Find the Invalid Element using the CSS Selector as Tag name + Class . symbol");
      WebElement findInvalidElementCSSSelectorHTMLTagAndClass = openGoogleBrowser.findElement(By.cssSelector("button.btn11")); // In the following Code we are tried to find the invalid html element using CSS Selector as tag and class using tagname. symbol
      // In the above code we have used button as tagname and .btn11 as class, it will find the element with tagname button and class btn11
      System.out.println(findInvalidElementCSSSelectorHTMLTagAndClass.isDisplayed());  // As HTML Element is Invalid, It Throws An Exception as :NoSuchElementException

     //Uncomment the below code to see the exception as NoSuchElementException, as the HTML Element is Invalid, It Throws An Exception as :NoSuchElementException
      System.out.println("6.Find the Invalid Element using the CSS Selector as Tag name + Attribute using [] symbol");
      WebElement findInvalidElementCSSSelectorHTMLTagAndAttribute = openGoogleBrowser.findElement(By.cssSelector("meta[name='descripcvcvtion']")); // In the following Code we are tried to find the invalid html element using CSS Selector as tagname+Attribute using tagname[attribute=value] symbol
      // In the above code we have used meta as tagname and [name='descripcvcvtion'] as attribute, it will find the element with tagname meta and attribute name='descripcvcvtion'
      System.out.println(findInvalidElementCSSSelectorHTMLTagAndAttribute.isDisplayed());  // As HTML Element is Invalid, It Throws An Exception as :NoSuchElementException

*/



  }
}
