package b.Selenium.chapter2.blocators.xpathsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FWildCardXpath {
    public static void main(String[] args) {
            /*
            Wildcards - Whenever a user is trying to  find any web Element & user not sure about which tag has to be used.
            the need to * Asterisk symbol this is called Wild Card
            There are two types of WildCards
            1. Asterisk  Based *
            2. Node Based

            1. Asterisk  Based - user has to use * Symbol

            HTML Tag Asterisk Example - //* [@title='mywebpage'] // In the following code we are not sure not about starting tag, so we have used * for HTML tag & Attribute too.

           Attribute Asterisk Example - //div [@*='mywebpage'] // In the following code we are not sure not about what attribute to be used, so we have used * for Attribute.

           HTML Tag & Attribute Example - //* [@*='mywebpage'] // In the following code we are not sure not about what attribute & HTML tag to be used, so we have used * for HTML tag & Attribute too.

           2. Node Based

                1. Node is Basically a Replacement of HTML Tags

             */





        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("Find the Title of IFrame using *");
        WebElement findElementByAsteriskTitle = openBrowser.findElement(By.xpath("//*[@title='Example iframe']")); // In the Following Code we are trying to find IFrame Title but not sure Starting Tag so used *

        System.out.println("Find the Childs of HTML using *");
        WebElement findElements = openBrowser.findElement(By.xpath("HTML//*//a[@href='mailto:demo@example.com']")); // In the Following Code we are trying to find href attribute using  *  HTML//* means all child,subchild tag child  after

    }
}