package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EAlertExplicitCondition {

    public static void main(String[] args) {
        System.out.println("Launch Browser");
//        String invalidAlertXpath = "//*[contains(text(), 'Show Alert with only OK Button'] ";  // As This Xpath Syntax is Invalid then its throws an exception InvalidSelectorException
        String validAlertXpath = "//*[contains(text(), 'Show Alert with only OK Button')] ";
        System.out.println("1. alertIsPresent - Validate Alert should be Present");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebElement clkAlertBtn = openBrowser.findElement(By.xpath(validAlertXpath));
        WebDriverWait waitForElement = new WebDriverWait(openBrowser, Duration.ofSeconds(20));
        waitForElement.until(ExpectedConditions.elementToBeClickable(clkAlertBtn));
        clkAlertBtn.click();
        Alert ckhAlert =  waitForElement.until(ExpectedConditions.alertIsPresent());
        System.out.println(ckhAlert.getText());
        ckhAlert.accept();

        System.out.println("Test Case Passed");
        openBrowser.close();
    }

}
