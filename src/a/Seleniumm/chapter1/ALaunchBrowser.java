package a.Seleniumm.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALaunchBrowser {

    public static void main(String[] args) {

        WebDriver openGoogleBrowser = new ChromeDriver();
        openGoogleBrowser.get("https://www.google.com/");


    }

}
