package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GTitleException {
    public static void main(String[] args) {
        String btnXpath = "//*[contains(text(), 'Change Page Title After 3 Seconds')]";
        System.out.println("1. elementToBeClickable - Check Particular Valid Element is Clickable & Change The Title of the Page");
        WebDriver openBrowserE = new ChromeDriver();
        openBrowserE.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait waitDriver = new WebDriverWait(openBrowserE, Duration.ofSeconds(30));
        waitDriver.until(ExpectedConditions.titleIs("Selenium Explicit Wait Practice Lab"));
        System.out.println("Old Title as Follows: " + openBrowserE.getTitle());
        waitDriver.until(ExpectedConditions.elementToBeClickable(By.xpath(btnXpath))).click();
        System.out.println("Title is changed to: " + openBrowserE.getTitle());
        waitDriver.until(ExpectedConditions.titleIs("Selenium Dashboard - Success"));
        System.out.println("Title is changed Successfully");

        try
        {
            System.out.println("1. Wrong Title Exception - Validate Invalid The Title of the Page");
            WebDriver openBrowserEA = new ChromeDriver();
            openBrowserEA.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
            WebDriverWait waitDriverA = new WebDriverWait(openBrowserEA, Duration.ofSeconds(30));
            waitDriverA.until(ExpectedConditions.titleIs("Selenium Explicit Wait Practice LabA"));
        }
        catch(TimeoutException wrongTitleException)
        {
            System.out.println("Title is not matched as per Expected Title"+wrongTitleException.getMessage());
        }
    }

}
