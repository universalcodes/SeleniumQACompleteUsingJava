package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FAlertNegativeUseCases {

    public static void main(String[] args) {

        System.out.println("Launch Browser");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Yogesh/Documents/Codex/" + "2026-08-21/sdet-selenium-framework/outputs/" + "prompt-alert-practice.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buttonWhereAlertPresent = wait.until(ExpectedConditions.elementToBeClickable(By.id("showPromptButton")));
        System.out.println("Prompt button is available: " + buttonWhereAlertPresent.isDisplayed());
        WebDriver openBrowserC=null;

            /*
              ==========================================
              TEST 1: NoAlertPresentException - Not Clicking on Button, Directly Switching to Alert it Cause NoAlertPresentException .
              =========================================
             */
        try {
            System.out.println("\nTest 1: Not Clicking on Button, Directly Switching to Alert it Cause NoAlertPresentException");
            Alert unexpectedAlert = driver.switchTo().alert();
            System.out.println("Unexpected alert text: " + unexpectedAlert.getText());
            throw new AssertionError("Test failed: Alert unexpectedly present tha");

        } catch (NoAlertPresentException exception) {

            System.out.println("Test 1 Passed: Not Clicking on Button, Directly Switching to Alert it Cause NoAlertPresentException");
            driver.quit();
        }

            /*
              ==========================================
              TEST 2: TimeoutException - Not Clicking on Button Hence Alert is not displayed its throws an Exception as TimeOutException
              ==========================================
            */
        try {
            System.out.println("TEST 2: TimeoutException - Not Clicking on Button Hence Alert is not displayed its throws an Exception as TimeOutException");
             openBrowserC = new ChromeDriver();
            openBrowserC.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\Selenium Prompt Alert Practice Alert.html");
            WebElement btnClkAlertPresentBA = openBrowserC.findElement(By.id("showPromptButton"));
            WebDriverWait waitForBtnAA = new WebDriverWait(openBrowserC, Duration.ofSeconds(10));
            waitForBtnAA.until(ExpectedConditions.elementToBeClickable(btnClkAlertPresentBA));
            //btnClkAlertPresentBA.click();
            Alert alertBtnBA = waitForBtnAA.until(ExpectedConditions.alertIsPresent());
            System.out.println(alertBtnBA.getText());
        } catch (TimeoutException exception) {
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
            openBrowserC.quit();
        }


            /*
             ==========================================
              TEST 3: Positive prompt test - Clicking on Button, Alert Visible, Enter Text on Alert and Finally Validates the Alert Entered Text
             ==========================================
             */
        try {
            System.out.println("\nTest 3: Positive prompt test - Clicking on Button, Alert Visible, Enter Text on Alert and Finally Validates the Alert Entered Text");
             openBrowserC = new ChromeDriver();
            openBrowserC.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\Selenium Prompt Alert Practice Alert.html");
            WebDriverWait waitA = new WebDriverWait(openBrowserC, Duration.ofSeconds(10));
            waitA.until(ExpectedConditions.elementToBeClickable(By.id("showPromptButton"))).click();
            Alert promptAlert = waitA.until(ExpectedConditions.alertIsPresent());
            String actualAlertMessage = promptAlert.getText();

            System.out.println("Prompt message: " + actualAlertMessage);
            System.out.println("On Alert Box Entered Text as follows");
            promptAlert.sendKeys("This is Selenium for Testing");
            promptAlert.accept();
            String expectedResult = "Result: Entered text: This is Selenium for Testing";
            waitA.until(ExpectedConditions.textToBePresentInElementLocated(By.id("result"), expectedResult));
            WebElement promptTxtEntered = openBrowserC.findElement(By.id("result"));
            String actualResult = promptTxtEntered.getText();
            System.out.println("Page result: " + actualResult);

            if (!actualResult.equals(expectedResult))
            {
                throw new AssertionError("Expected: " + expectedResult + ", but found: " + actualResult);
            }
            System.out.println("Test 3 Passed: Prompt text submitted successfully");
            openBrowserC.close();

        } catch (TimeoutException exception) {
            System.out.println("Test 3 Failed: Prompt or result " + "expected time mein display nahi hua");
            throw exception;
        }
    }
}