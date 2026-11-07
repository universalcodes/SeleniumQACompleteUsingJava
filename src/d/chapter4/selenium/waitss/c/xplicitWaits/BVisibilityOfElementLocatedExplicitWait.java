package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BVisibilityOfElementLocatedExplicitWait {
    public static void main(String[] args) {
        ChromeDriver openBrowser  = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\Expicits Waits.html");
        System.out.println("1. Working on Dynamic Element Using Explicit Wait Where Element is Present & Visible Not Hidden  ");
        WebDriverWait wait  = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        WebElement validateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Dynamically Added']")));
        System.out.println(validateElement.getText());

        /*
        UnComment To Test
        As the Element is Present in DOM but Hidden for UI its Throws TimeOutException


         */


        System.out.println("2. Working on Dynamic Element Using Explicit Wait Where Element is Not Visible Its Hidden");
        WebDriverWait waitA  = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        WebElement validateElementA = waitA.until(ExpectedConditions.visibilityOfElementLocated(By.id("hiddenElement")));
        System.out.println(validateElementA.getText());

        try{

            System.out.println("2. Working on Dynamic Element Using Explicit Wait Where Element is Not Visible Its Hidden");
            WebDriverWait waitAA  = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
            WebElement validateElementAA = waitAA.until(ExpectedConditions.visibilityOfElementLocated(By.id("hiddenElement")));
            System.out.println(validateElementAA.getText());

        }
        catch (TimeoutException timeOutExpValidation)
        {
            // timeOutExpValidation.printStackTrace();  -- This is for Debugging Purpuse \
            System.out.println(timeOutExpValidation.getMessage());
        }
    }
}