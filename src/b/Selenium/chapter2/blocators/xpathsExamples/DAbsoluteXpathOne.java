package b.Selenium.chapter2.blocators.xpathsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAbsoluteXpathOne {

    /*
    Points to Remember
    1. Xpath stands for Xml Path it is similar to xml file where we have to traverse the html element
        There are two types of xpath
            Relative Xpath
            Absolute Xpath -
            Absolute - It is type of xpath where it starts from root Element and donated by
    / (Single Slash). In Absolute xpath we need to traverse the element from root if any
    Element got missed then that web Element is not visible
    It always works in Sequence order
    for Example  - /html/body/p --- In the following example, WebElement starts from html then body finally P tag

    2.There are multiple ways of Define Relative Xpath using And OR Keyword
        In the Case of AND ensure that all Attributes must be visible
        In the Case of OR ensure that At Least Attribute must be defined

    3. If we passed Invalid Elements, it throws Runtime Error &  Exception occurred as  NoSuchElementFound
     */

    public static void main(String[] args) {


        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/seleniumpage.html");

        // the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openBrowser.get(file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/seleniumpage.html);

//        /----------------------- Test Case 1 Positive -----
//
//            In this we are finding Absolute Xpath
//
        //WebElement validAbsoluteCXpath = openBrowser.findElement(By.path(/html/body/main/section[1]/h2)); // Compile Time Error name locator is not given in String
        WebElement validAbsoluteXpath = openBrowser.findElement(By.xpath("/html/body/main/section[1]/h2"));
        System.out.println("1. Valid Absolute Xpath is Found");
        
         //----------------------- Test Case 2 Positive -----
//
//            In this we are finding Absolute Xpath with Attribute Technique 1
     //   WebElement validAbsoluteXpathWithAttribute = openBrowser.findElement(By.xpath("/html/body/main/section[1]/video/source[@src="/https://www.w3schools.com/html/mov_bbb.mp4/"]"));  // Compile Time Error As String Indentation is Incorrect
        WebElement validAbsoluteXpathWithAttribute = openBrowser.findElement(By.xpath("/html/body/main/section[1]/video/source[@src=\"https://www.w3schools.com/html/mov_bbb.mp4\"]"));  // Technique 1 where we have \"\" to Enter the String
        System.out.println("2. Valid Absolute Xpath with Attribute is Found");

        //----------------------- Test Case 3 Positive -----
       // In this we are finding Absolute Xpath with Attribute Technique 2
        WebElement validAbsoluteXpathWithAttribute3 = openBrowser.findElement(By.xpath("/html/body/main/section[1]/video/source[@src='https://www.w3schools.com/html/mov_bbb.mp4']"));  // Technique2 where we pass the inner String  - (https://www.w3schools.com/html/mov_bbb.mp4) as in
        System.out.println("3. Valid Absolute Xpath with Attribute is Found");

        //----------------------- Test Case 4 Positive -----
        // In this we are finding Absolute Xpath with Multiple Attributes without using And keyword
       // WebElement validAbsoluteXpathWithMultipleAttribute = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'][@method='postt']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validAbsoluteXpathWithMultipleAttribute = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submit'][@method='post']"));  // In the following Code we are defining the 2 Attributes which means its And Condition without using and keyword where 2 of the Attributes must be visible
        System.out.println("4. Valid Absolute Xpath with Multiple Attributes");

        //----------------------- Test Case 5 Positive -----
        // In this we are finding Absolute Xpath with Multiple Attributes using And Keyword
      //  WebElement validAbsoluteXpathWithMultipleAttributes = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'and @method='poost']"));  //  Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validAbsoluteXpathWithMultipleAttributes = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submit'and @method='post']"));  // In the following Code we are defining the 2 Attributes which means its And Condition with using and keyword where 2 of the Attributes must be visible
        System.out.println("5. Valid Absolute Xpath with Multiple Attributes using and keyword");

        //----------------------- Test Case 6 Positive -----
        // In this we are finding Absolute Xpath with Multiple Attributes using OR Keyword
        //WebElement validAbsoluteXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'or @method='post']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validAbsoluteXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'or @method='post']"));  // In the following Code we are defining the 2 Attributes where 1 attributes must be visible as if we used or keyword
        System.out.println("6. Valid Absolute Xpath with Multiple Attributes using  OR keyword");

        //----------------------- Test Case 7 Positive -----
        // In this we are finding Absolute Xpath with Multiple Attributes using Multiple OR keyword
        //WebElement validAbsoluteXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'or @method='yogesh' or @method='postt' ]"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validAbsoluteXpathWithMultipleAttributesss = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'or @method='post' or  @method='postt']"));  // In the following Code we are defining the 2 Attributes where 1 attributes must be visible as if we used or keyword
        System.out.println("7. Valid Absolute Xpath with Multiple Attributes using Multiple OR keyword");


        //----------------------- Test Case 8 Positive -----
        // In this we are finding Absolute Xpath with Multiple Attributes without using AND Keyword
        // WebElement validAbsoluteXpathWithMultipleAttributessss = openBrowser.findElement(By.xpath("/html/body/main/section[6]/iframe[@title='Example ifrrame'][@src='https://exxample.com'][@height='q200']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements, All 3 Attributes are Invalid
        WebElement validAbsoluteXpathWithMultipleAttributessss = openBrowser.findElement(By.xpath("/html/body/main/section[6]/iframe[@title='Example iframe'][@src='https://example.com'][@height='200']"));  // In the following Code we are defining the 3 Attributes which means its And Condition without using and keyword where 3 of the Attributes must be visible
        System.out.println("8. Valid Absolute Xpath with Multiple Attributes More than 2");


        //----------------------- Test Case 9 Positive -----
        // In this we are finding Absolute Xpath with Multiple Attributes using Multiple AND keyword
        //WebElement validAbsoluteXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[6]/iframe[@title='Example iframee'and @src='https://exxample.com' and @height='2200']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements, In the Following code we passed Invalid Elements, All 3 Attributes are Invalid using And keyword
        WebElement validAbsoluteXpathWithMultipleAndAttributesss = openBrowser.findElement(By.xpath("/html/body/main/section[6]/iframe[@title='Example iframe'and @src='https://example.com' and @height='200']"));  // In the following Code we are defining the 3 Attributes where all 3  attributes must be visible as if we used AND keyword
        System.out.println("9. Valid Absolute Xpath with Multiple Attributes using Multiple AND keyword");
    }
}
