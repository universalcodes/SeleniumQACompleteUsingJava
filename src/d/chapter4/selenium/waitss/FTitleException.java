package d.chapter4.selenium.waitss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FTitleException {
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

    }
}
