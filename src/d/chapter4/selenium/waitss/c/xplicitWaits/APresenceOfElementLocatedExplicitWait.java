package d.chapter4.selenium.waitss.c.xplicitWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class APresenceOfElementLocatedExplicitWait {
    public static void main(String[] args) {
        ChromeDriver openBrowser  = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\Expicits Waits.html");
        System.out.println("1. Working on Dynamic Element Using Explicit Wait Where Element is Visible  ");
        WebDriverWait wait  = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        WebElement validateElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Dynamically Added']")));
        System.out.println(validateElement.getText());

        System.out.println("2. Working on Dynamic Element Using Explicit Wait Where Element is Not Visible Its Hidden");
        WebDriverWait waitA  = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        WebElement validateElementA = waitA.until(ExpectedConditions.presenceOfElementLocated(By.id("hiddenElement")));
        System.out.println(validateElementA.getText());

        /*
            UnComment To Test
        System.out.println("3. Working on Invalid Element its throws An Exception as TimeoutException Occurred");
        WebDriverWait waitB = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
        WebElement validateInvalidElement = waitB.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Dynamically Addedd']")));
        System.out.println(validateInvalidElement.getText());


         */
        System.out.println("4. Working on Invalid Element with Try Catch Block it throws an Exception as TimeOutException");

        try{

            WebDriverWait waitC = new WebDriverWait(openBrowser, Duration.ofSeconds(10));
            WebElement validateInvalidElementA = waitC.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Dynamically Addedd']")));
            System.out.println(validateInvalidElementA.getText());

        }

        catch (TimeoutException elementNotAvialable)
        {
            System.out.println(elementNotAvialable.getMessage());
            // for Debugging Purpose Use the following Code
         //  elementNotAvialable.printStackTrace();

        }



    }

    }