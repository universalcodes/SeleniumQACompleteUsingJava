package d.chapter4.selenium.waitss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DImplicitWait {
    /*
    implicit wait -
    It is the type of wait
    where it waits for all Elements across
    the WebPage
    
      the arg type of implicitlyWait is 
         implicitlyWait(Duration.ofSeconds(30))
        implicitlyWait(Duration.ofMillis(5000));   // Here Script wait for fix 5000 milliseconds which means fix 5 Seconds
        implicitlyWait(Duration.ofMinutes(1));   // Here Script wait for fix minute
        implicitlyWait(Duration.ofHours(1));   // Here Script wait for fix an Hour
        implicitlyWait(Duration.ofNanos(34567));   // Here Script wait for fix 34567 nano
        implicitlyWait(Duration.ofNanos(1000000000l)); //Here Script wait for fix an 1000000000 nanos which means fix 1 Second
        implicitlyWait(Duration.ofDays(1)); //Here Script wait for 1 Day


     RunTime Exception
                implicitlyWait(Duration.ofDays(-1)); // As -1 is not acceptable Value, its Throws an Run Time Exception
                Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument: value must be a non-negative integer

     */

    public static void main(String[] args) {

        System.out.println("1. Launch Browser with Implicit wait with 30 Seconds,");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        openBrowser.get("https://www.amazon.in/");
        WebElement searchBox = openBrowser.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.clear();
        searchBox.sendKeys("I Phone 17 Pro Max");

        System.out.println("Test Case is Completed Successfully");


        System.out.println("2.Check Element Implicit wait with 30 Seconds for Search the Product,");
        openBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        openBrowser.get("https://www.amazon.in/");
        WebElement searchProduct = openBrowser.findElement(By.xpath("//*[contains(text(), 'UA43UE86AHULXL' )]"));
        boolean validateProduct = searchProduct.isDisplayed();
        System.out.println("The Result of Product as follows\t"+validateProduct);
        System.out.println("Test Case is Completed Successfully");




    }
}
