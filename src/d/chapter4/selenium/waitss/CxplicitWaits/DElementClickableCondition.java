package d.chapter4.selenium.waitss.CxplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DElementClickableCondition {
    public static void main(String[] args) {
        System.out.println("Launch Browser");
//        String btnXpath = "//*[contains(text(), ' Click Me)]";  // As This Xpath Syntax is Invalid then its throws an exception InvalidSelectorException
        String btnXpath = "//*[contains(text(), ' Click Me')]";
        System.out.println("7. elementToBeClickable - Check Particular Valid Element is Clickable");
        WebDriver openBrowserE = new ChromeDriver();
        openBrowserE.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait waitForElementD = new WebDriverWait(openBrowserE, Duration.ofSeconds(20));
        waitForElementD.until(ExpectedConditions.elementToBeClickable(By.xpath(btnXpath)));
        System.out.println("Test Case Passed");
        openBrowserE.close();

        /*
        Uncomment to Test
        elementToBeClickable - if the Element is Present then which is clickable then Test Case is passed otherwise it throws an TimeOutException
        System.out.println("Launch Browser");
        String btnXpathA = "//*[contains(text(), ' Click MeA')]";
        System.out.println("8. elementToBeClickable - Check Particular Invalid Element is Clickable");
        WebDriver openBrowserF = new ChromeDriver();
        openBrowserF.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
        WebDriverWait waitForElementE = new WebDriverWait(openBrowserF, Duration.ofSeconds(20));
        waitForElementE.until(ExpectedConditions.elementToBeClickable(By.xpath(btnXpathA)));
        System.out.println("Test Case Passed");


         */


//        System.out.println("Launch Browser");
//        String btnXpathB = "//*[contains(text(), 'Wait Practice Lab')]";
//        System.out.println("9. elementToBeClickable - Check Particular Valid Element is Clickable that is not Button");
//        WebDriver openBrowserG = new ChromeDriver();
//        openBrowserG.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\explicitWait.html");
//        WebDriverWait waitForElementF = new WebDriverWait(openBrowserG, Duration.ofSeconds(20));
//        waitForElementF.until(ExpectedConditions.elementToBeClickable(By.xpath(btnXpathB)));
//        System.out.println("Test Case Passed");


        System.out.println("Launch Browser");
        System.out.println("10. elementToBeClickable - Check Particular Valid Element is Clickable that is Check Box");
        WebDriver openBrowserH = new ChromeDriver();
        openBrowserH.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ACompleteSeleniumCodeStepByStep.html");
        WebDriverWait waitForElementG = new WebDriverWait(openBrowserH, Duration.ofSeconds(20));
        waitForElementG.until(ExpectedConditions.elementToBeClickable(By.id("pepCheck")));
        System.out.println("Test Case Passed");


        System.out.println("Launch Browser");
        String btnXpathC = "//*[contains(text(), 'Enabled Elements')]";
        System.out.println("11. elementToBeClickable - Check Particular Valid Element is Clickable that is Radio Box");
        WebDriver openBrowserI = new ChromeDriver();
        openBrowserI.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\ACompleteSeleniumCodeStepByStep.html");
        WebDriverWait waitForElementH = new WebDriverWait(openBrowserI, Duration.ofSeconds(20));
        waitForElementH.until(ExpectedConditions.elementToBeClickable(By.id("rdoEnabledMale")));
        WebElement checkTxtEnabled =  openBrowserI.findElement(By.xpath(btnXpathC));
        System.out.println(checkTxtEnabled.isDisplayed());
        System.out.println(checkTxtEnabled.isEnabled());
        System.out.println(checkTxtEnabled.isSelected());
        waitForElementH.until(ExpectedConditions.elementToBeClickable(By.xpath(btnXpathC)));
        System.out.println("Test Case Passed");


//        System.out.println("12. elementToBeClickable - Check Particular Valid Element is Clickable that is Hidden as Enabled ");
//        WebDriver openBrowserJ = new ChromeDriver();
//        openBrowserJ.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/inputBox.html");
//        WebDriverWait waitForElementI = new WebDriverWait(openBrowserJ, Duration.ofSeconds(20));
//        waitForElementI.until(ExpectedConditions.elementToBeClickable(By.id("txtHiddenEnabled")));
//        System.out.println(checkTxtEnabled.isDisplayed());
//        System.out.println(checkTxtEnabled.isEnabled());
//        System.out.println(checkTxtEnabled.isSelected());


//        System.out.println("13. elementToBeClickable - Check Particular Valid Element is Clickable that is Hidden as Disabled ");
//        WebDriver openBrowserK = new ChromeDriver();
//        openBrowserK.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/inputBox.html");
//        WebDriverWait waitForElementJ = new WebDriverWait(openBrowserK, Duration.ofSeconds(20));
//        waitForElementJ.until(ExpectedConditions.elementToBeClickable(By.id("txtHiddenDisabled")));
//        System.out.println(checkTxtEnabled.isDisplayed());
//        System.out.println(checkTxtEnabled.isEnabled());
//        System.out.println(checkTxtEnabled.isSelected());


//        System.out.println("14. elementToBeClickable - Check Particular Valid Element is Clickable that is Visible but Disabled ");
//        WebDriver openBrowserL = new ChromeDriver();
//        openBrowserL.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/inputBox.html");
//        WebDriverWait waitForElementK = new WebDriverWait(openBrowserL, Duration.ofSeconds(20));
//        waitForElementK.until(ExpectedConditions.elementToBeClickable(By.id("txtDisabled")));
//        System.out.println(checkTxtEnabled.isDisplayed());
//        System.out.println(checkTxtEnabled.isEnabled());
//        System.out.println(checkTxtEnabled.isSelected());


        System.out.println("15. elementToBeClickable - Check Particular Valid Element is Clickable that is Visible but Enabled TextBox ");
        WebDriver openBrowserM = new ChromeDriver();
        openBrowserM.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/inputBox.html");
        WebDriverWait waitForElementL = new WebDriverWait(openBrowserM, Duration.ofSeconds(20));
        waitForElementL.until(ExpectedConditions.elementToBeClickable(By.id("txtLocate")));
        System.out.println(checkTxtEnabled.isDisplayed());
        System.out.println(checkTxtEnabled.isEnabled());
        System.out.println(checkTxtEnabled.isSelected());

    }
}
