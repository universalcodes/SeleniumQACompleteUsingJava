package d.chapter4.selenium.waitss.c.xplicitWaits.a.StaleexceptionExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CStaleExceptionExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\YStaleException.html");
        String getWebTitle = openBrowser.getTitle();
        System.out.println("Title as follows\t"+getWebTitle);
        System.out.println("1. Stale Exception Occurred");
        WebElement searchStaleElement = openBrowser.findElement(By.id("searchBox"));
        Thread.sleep(5000);
        if(searchStaleElement.isDisplayed())
        {
            System.out.println("Entered into if");
            System.out.println(searchStaleElement.getText());
            openBrowser.navigate().refresh();
            System.out.println("As Page has been Refreshed So, Stale Exception is Occurred");
            searchStaleElement.sendKeys("Dell Laptop");


        }
    }
}