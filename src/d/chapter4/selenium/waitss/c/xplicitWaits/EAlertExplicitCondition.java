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



        System.out.println("Launch Browser");
//        String invalidAlertXpath = "//*[contains(text(), 'Show Alert with only OK Button'] ";  // As This Xpath Syntax is Invalid then its throws an exception InvalidSelectorException
        String validAlertXpathA = "//*[contains(text(), 'Show Alert with All Actions')]";
        System.out.println("2. alertIsPresent - Validate Alert should be Present with ok Button And Cancel Button");
        WebDriver openBrowserA = new ChromeDriver();
        openBrowserA.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\Alert.html");
        WebElement btnClkAlertPresent = openBrowserA.findElement(By.xpath(validAlertXpathA));
        WebDriverWait waitForElementA = new WebDriverWait(openBrowserA, Duration.ofSeconds(20));
        waitForElementA.until(ExpectedConditions.elementToBeClickable(btnClkAlertPresent));
        btnClkAlertPresent.click();
        Alert ckhAlertA =  waitForElementA.until(ExpectedConditions.alertIsPresent());
        System.out.println(ckhAlertA.getText());
        ckhAlertA.accept();  // This is just for ok for alert pop another alert pop will be visible.
        Alert ckhAlertAOne =  waitForElementA.until(ExpectedConditions.alertIsPresent());
        System.out.println(ckhAlertAOne.getText());
        ckhAlertAOne.dismiss();
        System.out.println("Test Case Passed");
        openBrowserA.close();
    }

}
