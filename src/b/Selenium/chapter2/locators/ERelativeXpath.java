package b.Selenium.chapter2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERelativeXpath {

    /*
    Points to Remember
    1. Xpath stands for Xml Path it is similar to xml file where we have to traverse the html element
        There are two types of xpath
            Relative Xpath
            Relative Xpath -
            Relative - It is type of xpath where it can starts from direct Element and donated by
    // (Single Slash). In Relative xpath we need to traverse the element from root if any
    we can direct use of Elements, Its not necessary that we have to use sequential order we can use directly
    It always works in Sequence order
    for Example  - //html//body//p --- In the following example, WebElement starts from html then body finally P tag

    2.There are multiple ways of Define Relative Xpath using And OR Keyword
        In the Case of AND ensure that all Attributes must be visible
        In the Case of OR ensure that At Least Attribute must be defined

    3. If we passed Invalid Elements, it throws Runtime Error &  Exception occurred as  NoSuchElementFound

    4. Wildcard - we can * symbol which helps when we are not sure about starting html tag then it will traverse from the entire html page
    for example
            "//form[@action='/submit'][@method='post'];  // In the following Code we are defining the 2 Attributes where it starts from form tag which means its And Condition without using and keyword where 2 of the Attributes must be visible  -- Relative Xpath
            "//*[@action='/submit'][@method='post'];  // In the following Code we are defining the 2 Attributes but we are not sure from which tag it begins it is also known as tag wildcard  -- Relative Xpath
        Similar
                    "//*[@*='/submit'][@*='post'];  // In the following Code we are defining the 2 Attributes but we are not sure from which tag it begins & also we are sure about attribute name so have used * symbol-- Relative Xpath

     */

    public static void main(String[] args) {

        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/seleniumpage.html");

        // the following line won't work as we didn't have http protocol & it considered as InvalidArgumentException
        // openBrowser.get(file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/seleniumpage.html);

//        /----------------------- Test Case 1 Positive -----
//
//            In this we are finding Relative Xpath
//
        //WebElement validRelativeCXpath = openBrowser.findElement(By.path(//html/body//main//section[1]//h2)); // Compile Time Error name locator is not given in String
        WebElement validRelativeXpath = openBrowser.findElement(By.xpath("//html//body//main//section[1]//h2"));   // Defining Relative Xpath with complete root
        System.out.println("1. Valid Relative Xpath is Found");
        WebElement validRelativeXpathExample2 = openBrowser.findElement(By.xpath("//section[1]"));// Search Only Section -- Relative Xpath
        System.out.println("1. Valid Relative Xpath Example2 is Found");
        WebElement validRelativeXpathExample3 = openBrowser.findElement(By.xpath("//h2[1]"));  // Search only Heading -- Relative Xpath
        System.out.println("1. Valid Relative Xpath Example3 is Found");


        //----------------------- Test Case 2 Positive -----
//
//            In this we are finding Relative Xpath with Attribute Technique 1
     //   WebElement validRelativeXpathWithAttribute = openBrowser.findElement(By.xpath("/html/body/main/section[1]/video/source[@src="/https://www.w3schools.com/html/mov_bbb.mp4/"]"));  // Compile Time Error As String Indentation is Incorrect
        WebElement validRelativeXpathWithAttribute = openBrowser.findElement(By.xpath("//html//body//main//section[1]//video//source[@src=\"https://www.w3schools.com/html/mov_bbb.mp4\"]"));  // Defining Relative Xpath with Complete Root Technique 1 where we have \"\" to Enter the String
        System.out.println("2. Valid Relative Xpath with Attribute is Found");
        WebElement validRelativeXpathWithAttribute2 = openBrowser.findElement(By.xpath("//video"));  // Search Only Video Element -- Relative Xpath
        System.out.println("2. Valid Relative New Xpath Example 2 with Attribute is Found");
        WebElement validRelativeXpathWithAttribute3= openBrowser.findElement(By.xpath("//source[@src=\"https://www.w3schools.com/html/mov_bbb.mp4\"]"));  // Search Only Source Element with String Indentation  -- Relative Xpath
        System.out.println("2. Valid Relative New Xpath Example 3 with Attribute is Found");
        WebElement validRelativeXpathWithAttribute4= openBrowser.findElement(By.xpath("//*[@src=\"https://www.w3schools.com/html/mov_bbb.mp4\"]"));  // Search Only @src Attribute but not sure starting tag so we have used *, it is also known as tag wildcard  -- Relative Xpath
        System.out.println("2. Valid Relative New Xpath Example 4 with Attribute is Found");


        //----------------------- Test Case 3 Positive -----
       // In this we are finding Relative Xpath with Attribute Technique 2

        WebElement validRelativeXpathWithAttribute5= openBrowser.findElement(By.xpath("//source[@src='https://www.w3schools.com/html/mov_bbb.mp4']"));  // Search Only Video Source Element where substring define as char -- Relative Xpath
        System.out.println("3. Valid Relative New Xpath Example 5 with Attribute is Found");

        //----------------------- Test Case 4 Positive -----
        // In this we are finding Relative Xpath with Multiple Attributes without using And keyword
       // WebElement validRelativeXpathWithMultipleAttribute = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'][@method='postt']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validRelativeXpathWithMultipleAttribute = openBrowser.findElement(By.xpath("//html//body//main//section[3]//form[@action='/submit'][@method='post']"));  // In the following Code we are defining the 2 Attributes with complete root which means its And Condition without using and keyword where 2 of the Attributes must be visible -- Relative Xpath
        System.out.println("4. Valid Relative Xpath with Multiple Attributes");
        WebElement validRelativeXpathWithMultipleAttribute2 = openBrowser.findElement(By.xpath("//form[@action='/submit'][@method='post']"));  // In the following Code we are defining the 2 Attributes within the same node tag form  which means its And Condition without using and keyword where 2 of the Attributes must be visible -- Relative Xpath
        System.out.println("4. Valid Relative Xpath Example 2 with Multiple Attributes");
        WebElement validRelativeXpathWithMultipleAttribute3 = openBrowser.findElement(By.xpath("//*[@action='/submit'][@method='post']"));  // In the following Code we are defining the 2 Attributes  but not sure starting tag so we have used * it is also known as tag wildcard   -- Relative Xpath -- Relative Xpath
        System.out.println("4. Valid Relative Xpath Example 3 with Multiple Attributes");


        //----------------------- Test Case 5 Positive -----
        // In this we are finding Relative Xpath with Multiple Attributes using And Keyword
      //  WebElement validRelativeXpathWithMultipleAttributes = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'and @method='poost']"));  //  Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validRelativeXpathWithMultipleAttributes = openBrowser.findElement(By.xpath("//html//body//main//section[3]//form[@action='/submit'and @method='post']"));  // In the following Code we are defining the 2 Attributes within the same node with Complete root which means its And Condition with using and keyword where 2 of the Attributes must be visible -- Relative Xpath
        System.out.println("5. Valid Relative Xpath with Multiple Attributes using and keyword");
        WebElement validRelativeXpathWithMultipleAttributes2 = openBrowser.findElement(By.xpath("//form[@action='/submit'and @method='post']"));  // In the following Code we are defining the 2 Attributes within the same node which means its And Condition with using and keyword where 2 of the Attributes must be visible -- Relative Xpath
        System.out.println("5. Valid Relative Xpath Example 2 with Multiple Attributes using and keyword");
        WebElement validRelativeXpathWithMultipleAttributes3 = openBrowser.findElement(By.xpath("//*[@action='/submit'and @method='post']"));  //  In the following Code we are defining the 2 Attributes using and keyword but not sure starting tag so we have used *  it is also known as tag wildcard  -- Relative Xpath
        System.out.println("5. Valid Relative Xpath Example 3 with Multiple Attributes using and keyword");


        //----------------------- Test Case 6 Positive -----
        // In this we are finding Relative Xpath with Multiple Attributes using OR Keyword
        //WebElement validRelativeXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'or @method='post']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validRelativeXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("//html//body//main//section[3]//form[@action='/submitt'or @method='post']"));  // In the following Code we are defining the 2 Attributes with Complete Root where 1 attributes must be visible as if we used or keyword
        System.out.println("6. Valid Relative Xpath with Multiple Attributes using  OR keyword");
        WebElement validRelativeXpathWithMultipleAttributess2 = openBrowser.findElement(By.xpath("//form[@action='/submitt'or @method='post']"));  // In the following Code we are defining the 2 Attributes with  where 1 attributes must be visible as if we used or keyword
        System.out.println("6. Valid Relative Xpath Example 2 with Multiple Attributes using  OR keyword");
        WebElement validRelativeXpathWithMultipleAttributess3 = openBrowser.findElement(By.xpath("//*[@action='/submitt'or @method='post']"));  // In the following Code we are defining the 2 Attributes using OR keyword but not sure starting tag so we have used * it is also known as tag wildcard   -- Relative Xpath
        System.out.println("6. Valid Relative Xpath Example 3 with Multiple Attributes using  OR keyword");



        //----------------------- Test Case 7 Positive -----
        // In this we are finding Relative Xpath with Multiple Attributes using Multiple OR keyword
        //WebElement validRelativeXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[3]/form[@action='/submitt'or @method='yogesh' or @method='postt' ]"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements
        WebElement validRelativeXpathWithMultipleAttributesss = openBrowser.findElement(By.xpath("//html//body//main//section[3]//form[@action='/submitt'or @method='post' or  @method='postt']"));  // In the following Code we are defining the 2 Attributes with complete root where 1 attributes must be visible as if we used or keyword -- Relative Xpath
        System.out.println("7. Valid Relative Xpath with Multiple Attributes using Multiple OR keyword");
        WebElement validRelativeXpathWithMultipleAttributesss2 = openBrowser.findElement(By.xpath("//form[@action='/submitt'or @method='post' or  @method='postt']"));  // In the following Code we are defining the 3 Attributes where 1 attributes must be visible as if we used or keyword -- Relative Xpath
        System.out.println("7. Valid Relative Xpath with Multiple Attributes using Multiple OR keyword Example 2");
        WebElement validRelativeXpathWithMultipleAttributesss3 = openBrowser.findElement(By.xpath("//*[@action='/submitt'or @method='post' or  @method='postt']"));  //  // In the following Code we are defining the 3 Attributes using OR keyword but not sure starting tag so we have used * it is also known as tag wildcard  -- Relative Xpath
        System.out.println("7. Valid Relative Xpath with Multiple Attributes using Multiple OR keyword Example 3");



        //----------------------- Test Case 8 Positive -----
        // In this we are finding Relative Xpath with Multiple Attributes without using AND Keyword
        // WebElement validRelativeXpathWithMultipleAttributessss = openBrowser.findElement(By.xpath("/html/body/main/section[6]/iframe[@title='Example ifrrame'][@src='https://exxample.com'][@height='q200']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements, All 3 Attributes are Invalid
        WebElement validRelativeXpathWithMultipleAttributessss = openBrowser.findElement(By.xpath("//html//body//main//section[6]//iframe[@title='Example iframe'][@src='https://example.com'][@height='200']"));  // In the following Code we are defining the 3 Attributes with Complete root which means its And Condition without using and keyword where 3 of the Attributes must be visible -- Relative Xpath
        System.out.println("8. Valid Relative Xpath with Multiple Attributes More than 2");
        WebElement validRelativeXpathWithMultipleAttributessss2 = openBrowser.findElement(By.xpath("//iframe[@title='Example iframe'][@src='https://example.com'][@height='200']"));  // In the following Code we are defining the 3 Attributes which means its And Condition without using and keyword where 3 of the Attributes must be visible -- Relative Xpath
        System.out.println("8. Valid Relative Xpath with Multiple Attributes More than 2 Example 2");
        WebElement validRelativeXpathWithMultipleAttributessss3 = openBrowser.findElement(By.xpath("//*[@title='Example iframe'][@src='https://example.com'][@height='200']"));  // In the following Code we are defining the 3 Attributes but not sure starting tag so we have used * it is also known as tag wildcard  -- Relative Xpath
        System.out.println("8. Valid Relative Xpath with Multiple Attributes More than 2 Example 3");


        //----------------------- Test Case 9 Positive -----
        // In this we are finding Relative Xpath with Multiple Attributes using Multiple AND keyword
        //WebElement validRelativeXpathWithMultipleAttributess = openBrowser.findElement(By.xpath("/html/body/main/section[6]/iframe[@title='Example iframee'and @src='https://exxample.com' and @height='2200']"));  // Runtime Error &  Exception occurred as  NoSuchElementFound, In the Following code we passed Invalid Elements, In the Following code we passed Invalid Elements, All 3 Attributes are Invalid using And keyword
        WebElement validRelativeXpathWithMultipleAndAttributesss = openBrowser.findElement(By.xpath("//html//body//main//section[6]//iframe[@title='Example iframe'and @src='https://example.com' and @height='200']"));  // In the following Code we are defining the 3 Attributes with Complete root where all 3  attributes must be visible as if we used AND keyword -- Relative Xpath
        System.out.println("9. Valid Relative Xpath with Multiple Attributes using Multiple AND keyword");
        WebElement validRelativeXpathWithMultipleAndAttributesssss2 = openBrowser.findElement(By.xpath("//iframe[@title='Example iframe'and @src='https://example.com' and @height='200']"));  // In the following Code we are defining the 3 Attributes where all 3  attributes must be visible as if we used AND keyword -- Relative Xpath
        System.out.println("9. Valid Relative Xpath with Multiple Attributes using Multiple AND keyword Example 2");
        WebElement validRelativeXpathWithMultipleAndAttributesssss3 = openBrowser.findElement(By.xpath("//*[@title='Example iframe'and @src='https://example.com' and @height='200']"));  // // In the following Code we are defining the 3 Attributes using and keyword but not sure starting tag so we have used *  it is also known as tag wildcard -- Relative Xpath
        System.out.println("9. Valid Relative Xpath with Multiple Attributes using Multiple AND keyword Example 3");

//        //----------------------- Test Case 10 Positive -----
        WebElement validRelativeXpathWithMultipleAndAttributees1 = openBrowser.findElement(By.xpath("//iframe[@*='Example iframe'and @*='https://example.com' and @*='200']"));  // // In the following Code we are defining the 3 Attributes using and keyword we are not sure about attribute name only Value is defined we have also used * for attributes it is also known as attributes wildcard  -- Relative Xpath
        System.out.println("10. Valid Relative Xpath Attribute as Defined as * ");

        //----------------------- Test Case 11 Positive -----
        System.out.println("Search Same Element within DOM");
        WebElement sameElementMultipleTimes = openBrowser.findElement(By.xpath("(//input)[5]"));  // In the following code 5 Element of Input is Searched within Entire DOM
        System.out.println("11. In This we are Searching Same Element which defined multiple times, Valid Relative Xpath Attribute as Defined as ()[]  ");

        //----------------------- Test Case 12 Positive -----
        System.out.println("Search only Attribute with WildCard");
        WebElement checkingOnlyAttributeWithWildcard = openBrowser.findElement(By.xpath("//*[@Name]"));  // In the following code we are checking only attribute on wildcard
        System.out.println("12. In this we are only Checking Weather Attribute is Present or Not on Wildcard ");

        //----------------------- Test Case 13 Positive -----
        System.out.println("Search only Attribute with Specific Tag");
        WebElement checkingOnlyAttributeWithTag = openBrowser.findElement(By.xpath("//input[@Name]"));  // In the following code we are checking only attribute on given Tag Input
        System.out.println("12. In this we are only Checking Weather Attribute is Present or Not within the given Tag. ");

        //----------------------- Test Case 13 Positive -----

        System.out.println("Search Same Element within Parent");
        WebElement sameElementMultipleTimes2 = openBrowser.findElement(By.xpath("//input[1]"));  // In the following code 5 Element of Input is Searched within Every Parent Tag
        System.out.println("13. In This we are Searching Same Element which defined multiple times, Search 1 Element within every Parent Tag  ");


        //----------------------- Test Case 14 Positive -----

        System.out.println("Search Same Element within Entire DOM");
        WebElement sameElementMultipleTimesWithinDOM = openBrowser.findElement(By.xpath("(//input)[5]"));  // In the following code we
                System.out.println("14. In This We have Searched 5th Input Tag within the entire DOM  ");


        //----------------------- Test Case 15 Positive -----

        System.out.println("Search Different Element within the Entire DOM using | Expression");
        WebElement findDifferentElementsAttr = openBrowser.findElement(By.xpath("//*[@title='Example iframee'] | //source[@src='https://www.w3schools.com/html/mov_bbb.mp4']"));  // In the following code we have searched 2 Elements | expression helps to understand atleast one element within the entire DOM
        System.out.println("15. We have searched at least one Element within Entire DOM using | Expression  ");

        //----------------------- Test Case 16 Positive -----

        System.out.println("Search Different Element within the Entire DOM using | Expression");
        WebElement findDifferentMultipleElements = openBrowser.findElement(By.xpath("//*[@title='Example iframee'] | //source[@src='https://www.w3schools.com/html/moov_bbb.mp4'] | //source[@src='https://www.w3schools.com/html/mov_bbb.mp4'] | //*[@id='Yogesh']"));  // In the following code, we have searched 2 Elements | expression helps to understand atleast one element within the entire DOM
        System.out.println("16. We have searched at least one Element within Entire DOM using | Expression  ");


        //----------------------- Test Case 17 Positive -----

        System.out.println("Find Any Child of Particular HTML Tag");
        WebElement findAnyChildOfParticularTag = openBrowser.findElement(By.xpath("//body/*"));  // In the following code Body is the main tag we have searched all childs of body tag. As we are not sure about child tags, so we gave *. * Denotes it can be any child.
        System.out.println("17. In Following Example we have Searched All Childs of Body Tag Using *  ");

        //----------------------- Test Case 18 Positive -----

        System.out.println("Find Particular Child of Particular HTML Tag");
        WebElement findParticularChildOfParticularTag = openBrowser.findElement(By.xpath("//body/*[1]"));  // In the following code Body is the main tag we have searched all childs of body tag. As we are not sure about child tags, we have used index value
        System.out.println("18. In Following Example we have Searched Particular Child of Body Tag Using index Value ");
        System.out.println(findParticularChildOfParticularTag.getTagName());

        //----------------------- Test Case 19 Positive -----

        System.out.println("Find All Ddescendant Childs of Particular HTML Tag");
        WebElement findAllDescendantsChildOfParticularTag = openBrowser.findElement(By.xpath("//body//*[1]"));  // In the following code Body is the main tag we have searched all childs of body tag. As we are not sure about child tags, so we gave *. * Denotes it can be any child.
        System.out.println("19. In Following Example we have Searched Particular Child of Body Tag Using index Value ");
        System.out.println(findParticularChildOfParticularTag.getTagName());


    }


}
