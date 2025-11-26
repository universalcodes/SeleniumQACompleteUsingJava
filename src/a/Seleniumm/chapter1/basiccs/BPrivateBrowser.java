package a.Seleniumm.chapter1.basiccs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BPrivateBrowser {

    public static void main(String[] args) {
        // Open Private Browser
        ChromeOptions openPrivateBrowser = new ChromeOptions();
        openPrivateBrowser.addArguments("Incognito");  // Pass the Valid Private Browser Name.

        // openPrivateBrowser.addArguments("Test");  // As there is no browser named as Test so  only Normal Google Browser is Opened.
        //   openPrivateBrowser.addArguments("Google Chrome");  // As we are passing Google Chrome, then 2 Instances of Google Chrome are Opened in the same window with 2 different tabs  where the first tab is as default as data, Another Tab Opens with given URL

        WebDriver openGoogleBrowserPrivate = new ChromeDriver(openPrivateBrowser);
        openGoogleBrowserPrivate.get("https://www.google.com/");
//        String browserName =  openPrivateBrowser.getBrowserVersion();
//        System.out.println(browserName);

// Opening Firefox Private
        FirefoxOptions openFirefoxPrivateBrowserSetUp = new FirefoxOptions();
        openFirefoxPrivateBrowserSetUp.addArguments("-Private");  // -Private is name of Mozilla Firefox Browser
//     //   WebDriver openFirefoxBrowserPrivate = new ChromeDriver(openFirefoxPrivateBrowserSetUp); // Compile Time Error as we are passing Options of Firefox but using  class of ChromeDriver()
        WebDriver openFirefoxBrowserPrivate = new FirefoxDriver(openFirefoxPrivateBrowserSetUp);
        openFirefoxBrowserPrivate.get("https://www.google.com/");


        // Opening Edge Private
        EdgeOptions openEdgePrivateBrowserSetUp = new EdgeOptions();
        openEdgePrivateBrowserSetUp.addArguments("InPrivate");  // InPrivate is name of Mozilla Edge Browser
        //   WebDriver openFirefoxBrowserPrivate = new ChromeDriver(openFirefoxPrivateBrowserSetUp); // Compile Time Error as we are passing Options of Firefox but using  class of ChromeDriver()
        //   WebDriver openEdgeBrowserPrivate = new FirefoxDriver(openEdgePrivateBrowserSetUp); // Compile Time Error as we are passing Options of Edge but using  class of FirefoxDriver()
        WebDriver openEdgeBrowserPrivate = new EdgeDriver(openEdgePrivateBrowserSetUp);
        openEdgeBrowserPrivate.get("https://www.google.com/");



        /*
        ----------- Summary ----------------------
        We need to use ChromeOptions class
        Create the object the ChromeOptions Class
        use Inbuilt Method ChromeOptions class .addArguments
       In  .addArgument method pass the private browser in the String
       for Google Chrome we use Incognito
         for Firefox we use -Private
       for Edge we use InPrivate

            Always Remember  if we pass any Random String or Invalid Browser Name, for Example,  As there is no browser named as Test so only simple Browser has Opened
            if wwe user passing Google Chrome then 2 Instances of Google Chrome is Opened in the same window where first tab is blank
       Finally use the Simple code & pass the object of ChromeOptions created as openPrivateBrowser
       WebDriver openPrivateBrowser = new ChromeDriver (openPrivateBrowser)






         */

    }
}
