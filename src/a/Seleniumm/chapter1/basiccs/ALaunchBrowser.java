package a.Seleniumm.chapter1.basiccs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ALaunchBrowser {

    public static void main(String[] args) throws InterruptedException {
      /*
      Points to Remember
      1. Selenium can automate only web Applications
      2. The Above Version of Selenium 4 Library doesn't require any Driver path its automatically
      stores on the following location
      //C:\Users\\test\.cache\selenium\chromedriver\win64\141.0.7390.122\chromedriver.exe
      3. In Selenium - we can use different virtual browsers such as Google Chrome, firefox & edge to automate web scripts
      Always ensure that to work with Selenium virtual web browser actual browser must be installed.
      for example,  Safari is part of iOS then it is not Opened
        WebDriver openSafariBrowser = new SafariDriver();
        openSafariBrowser.get("https://www.google.com/");
       openSafariBrowser.quit();
       */
//
        WebDriver openGoogleBrowser = new ChromeDriver();
        openGoogleBrowser.get("https://www.google.com/");
        openGoogleBrowser.quit();

  /* ----------------------------- Summary ---------------
           In above line Webdriver is interface which only initiate or invoke only classes
        openGoogleBrowser is the reference variable of WebDriver
         new is the keyword
         ChromeDriver() is used to initiate Chrome Virtual Browser
         Firefox() is used to initiate Firefox Mozilla Virtual Browser
         EdgeDriver() is used to initiate Edge Virtual Browser

        .get is the inbuilt library method which helps to navigate to any website in our code we have used https://www.google.com/"
        .quit is the inbuilt library method which helps to close active virtual web browser.

         */



//
//        // Open Firefox Browser
        WebDriver openFirefoxBrowser = new FirefoxDriver();  // FirefoxDriver is Class
        openFirefoxBrowser.get("https://www.google.com/");
        openFirefoxBrowser.quit();


        // Open Firefox Browser
        WebDriver openEdgeBrowser = new EdgeDriver();  // EdgefoxDriver is Class
        openEdgeBrowser.get("https://www.google.com/");
        openEdgeBrowser.quit();


        // Safari Browser
//        WebDriver openSafariBrowser = new SafariDriver();
//        openSafariBrowser.get("https://www.google.com/");
//        openSafariBrowser.quit();


    }

}
