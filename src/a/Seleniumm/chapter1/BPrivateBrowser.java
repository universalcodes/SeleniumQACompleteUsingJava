package a.Seleniumm.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BPrivateBrowser {

    public static void main(String[] args) {
        // Open Private Browser
        ChromeOptions openPrivateBrowser = new ChromeOptions();
        //  openPrivateBrowser.addArguments("Incognito");  // Pass the Valid Private Browser Name.
        // openPrivateBrowser.addArguments("Test");  // As there is no browser named as Test so  only Normal Google Browser is Opened.
        openPrivateBrowser.addArguments("Google Chrome");  // As we are passing Google Chrome, then 2 Instances of Google Chrome is Opened in the same window  where first tab is blank

        WebDriver openGoogleBrowserPrivate = new ChromeDriver(openPrivateBrowser);
        openGoogleBrowserPrivate.get("https://www.google.com/");
        String browserName =  openPrivateBrowser.getBrowserVersion();
        System.out.println(browserName);

        /*
        ----------- Summary ----------------------
        We need to use ChromeOptions class
        Create the object the ChromeOptions Class
        use Inbuilt Method ChromeOptions class .addArguments
       In  .addArgument method pass the private browser in the String
       for Google Chrome we use Incognito
            Always Remember  if we pass any Random String or Invalid Browser Name for Example  As there is no browser named as Test so only simple Browser has Opened
            if wwe userpassing Google Chrome then 2 Instances of Google Chrome is Opened in the same window where first tab is blank
       Finally use the Simple code & pass the object of ChromeOptions created as openPrivateBrowser
       WebDriver openPrivateBrowser = new ChromeDriver (openPrivateBrowser)


         */

    }
}
