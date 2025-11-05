package a.Seleniumm.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBrowserNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver chromeBrowserOperation = new ChromeDriver();
        chromeBrowserOperation.get("https://www.google.com/");
      //  chromeBrowserOperation.navigate().forward();  // It is disabled as we haven't passed any url
     //   chromeBrowserOperation.navigate().back();  // It Navigates to the previous url which is default data when we're not passing another URL
        chromeBrowserOperation.navigate().to("https://www.youtube.com/");
        chromeBrowserOperation.navigate().back();  // It Navigates to the previous url which is Google
        System.out.println("Now its Navigated to Google Again");
        chromeBrowserOperation.navigate().forward();  // It Navigates to forward url which is YouTube
        System.out.println("Now its Navigated to YouTube Again");
        chromeBrowserOperation.navigate().refresh();  // It Reloads the Webpage
        System.out.println("Now its Refresh the Page");

        /*
        Summary
            1. User can perform various browser Navigation Such as back the webpage, forward the webpage, Navigate to URL & Refresh the Page.
            we use .navigate() inbuilt method from Selenium Library, which is part of the Navigation Interface.
            To Perform back webpage Operation we use .back() inbuilt method from Selenium Library, which is part of the Navigation Interface
            To Perform forward webpage Operation we use .forward()inbuilt method from Selenium Library, which is part of the Navigation Interface
            To Perform refresh webpage Operation we use .refresh()inbuilt method from Selenium Library, which is part of the Navigation Interface
            To Perform Navigate to URL we use .to("webaddress")

            Important to Remember
            To Perform Back Operation its Mandatory user has to forward the Browser first,
            If we perform back Operation without navigating the forward Page, then the back browser button is enabled but it its navigates to data which is default webpage.
            If we perform forward Operation without Performing back, then it won't work & forward button is disabled.

         */




    }
}
