package a.Seleniumm.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALaunchBrowser {

    public static void main(String[] args) {


      /*
      Points to Remember
      1. Selenium can automate only web Applications
      2. The Above Version of Selenium 4 Library doesn't require any Driver path its automatically
      stores on the following location
      //C:\Users\\test\.cache\selenium\chromedriver\win64\141.0.7390.122\chromedriver.exe
      3. In Selenium - we can use different virtual browsers such as Google Chrome, firefox & edge to automate web scripts
      Always ensure that to work with Selenium virtual web browser actual browser must be installed.
       */

        WebDriver openGoogleBrowser = new ChromeDriver();
        openGoogleBrowser.get("https://www.google.com/");
        openGoogleBrowser.quit();


        /* ----------------------------- Summary ---------------
           In above line Webdriver is interface which only initiate or invoke only classes
        openGoogleBrowser is the reference variable of WebDriver
         new is the keyword
          In the following line 20 - Chrome Browser is launched
        .get is the inbuilt library method which helps to navigate to any website in our code we have used https://www.google.com/"
        .quit is the inbuilt library method which helps to close active virtual web browser.
         */

    }

}
