package a.Seleniumm.chapter1.basiccs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBrowserBasicIOperations {

    public static void main(String[] args) {

        /*
        Points to Remember
        Browser has the following Basics Operations with the respective URL.
        1. Get the Title the of Launched webpage.
        getTitle() is the in-built method where we get the title of the Webpage.
        2. Get the Current URL of the webpage.
         getCurrentUrl() is the in-built method where we get the current URL of the Webpage.
        3. Maximize the Browser
        openGoogleChrome.manage().window().maximize();
        4. Minimize the Browser
        openGoogleChrome.manage().window().minimize();
        5. Delete All Cookies.
         openGoogleChrome.manage().deleteAllCookies();
        6. Window Handles.
        getWindowHandle() is the inbuilt method which to get the String of Active Browser
       7. Close the Browser
       quit() is the inbuilt Method which helps to close the browser.

       If we are not passing the URL in the Selenium Virtual Driver then the default value is data
       */

        WebDriver openGoogleChrome = new ChromeDriver();
        openGoogleChrome.manage().deleteAllCookies();
        // The Following line 30 help us to delete all cookies the Browser.
        openGoogleChrome.manage().window().minimize();
        // The Following line 32 help us to minimize the Browser.
        openGoogleChrome.manage().window().maximize();
        // The Following line 34  help us to maximize the Browser.
       openGoogleChrome.get("https://www.google.com/");
        // The Following line 36  help us to launch the URL Address
        String getURLAddressTitle = openGoogleChrome.getTitle();
        System.out.println(getURLAddressTitle); // get the title of the Webpage.
        String getCurrentURL = openGoogleChrome.getCurrentUrl();
        System.out.println(getCurrentURL); // get the current URL of the Webpage.
        String getStringWindow= openGoogleChrome.getWindowHandle();
        System.out.println(getStringWindow); // get the String Window of the Webpage.
       String getWebPageSource =  openGoogleChrome.getPageSource();
        System.out.println(getWebPageSource); // Get the html code of the opened url
        //openGoogleChrome.quit();  // close the Browser
    }
}
