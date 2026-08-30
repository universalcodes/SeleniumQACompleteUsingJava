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

    public static void main(String[] args) throws InterruptedException {
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

        System.out.println("Launch Browser");
        System.out.println("3. alertIsPresent - Validate Alert with Prompt Box with Ok Button");
        WebDriver openBrowserB = new ChromeDriver();
        openBrowserB.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\Selenium Prompt Alert Practice Alert.html");
        WebElement btnClkAlertPresentA = openBrowserB.findElement(By.id("showPromptButton"));
        WebDriverWait waitForBtn = new WebDriverWait(openBrowserB, Duration.ofSeconds(10));
        waitForBtn.until(ExpectedConditions.elementToBeClickable(btnClkAlertPresentA));
        btnClkAlertPresentA.click();
        Alert alertBtnA = waitForBtn.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertBtnA.getText());
        Thread.sleep(5000);
        alertBtnA.sendKeys("This is Selenium for Testing");
        Thread.sleep(5000);
        alertBtnA.accept();
        System.out.println("Test Case Passed Only Accepted Button is Clicked");
        WebDriverWait waitForAlertText = new WebDriverWait(openBrowserB, Duration.ofSeconds(10));
        WebElement alertPromptText =  waitForAlertText.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
        System.out.println("Alert Text Entered as\t"+alertPromptText.getText());




      //  openBrowserB.close();


        System.out.println("4. alertIsPresent - Validate Alert with Prompt Box with Cancel Button Button");
        WebElement btnClkAlertPresentB = openBrowserB.findElement(By.id("showPromptButton"));
        WebDriverWait waitForBtnA = new WebDriverWait(openBrowserB, Duration.ofSeconds(10));
        waitForBtnA.until(ExpectedConditions.elementToBeClickable(btnClkAlertPresentB));
        btnClkAlertPresentB.click();
        Alert alertBtnB = waitForBtn.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertBtnB.getText());
        Thread.sleep(5000);
        alertBtnB.sendKeys("This is Selenium for Testing");
        Thread.sleep(5000);
        alertBtnB.dismiss();
        System.out.println("Test Case Passed Only Dismiss Button is Clicked");
        openBrowserB.close();





    }

}
