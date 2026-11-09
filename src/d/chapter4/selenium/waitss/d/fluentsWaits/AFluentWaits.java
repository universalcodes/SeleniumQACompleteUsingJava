package d.chapter4.selenium.waitss.d.fluentsWaits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class AFluentWaits {

    public static void main(String[] args) {
        WebDriver testBrowser = new ChromeDriver();
        testBrowser.get("file:///C:/Users/YogeshKamra/IdeaProjects/SeleniumUICrash/html%20pages/FluentWait.html");
        System.out.println("1. Fluent Wait Technique 1");
        FluentWait<WebDriver> fluentWaitTest = new FluentWait<>(testBrowser)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        WebElement searchBoxVisible = fluentWaitTest.until(driver -> driver.findElement(By.id("searchBox")));
//                searchBoxVisible.sendKeys("Laptop");
        System.out.println("Fluent Wait Technique 1 Passed");
        testBrowser.navigate().refresh();

        System.out.println("2. Fluent Wait Technique 2 without Chaining Method & Lamda Exp");

        FluentWait<WebDriver> fluentWaitTestNew = new FluentWait<>(testBrowser);
        fluentWaitTestNew.withTimeout(Duration.ofSeconds(30));
        fluentWaitTestNew  .pollingEvery(Duration.ofSeconds(2));
        fluentWaitTestNew   .ignoring(NoSuchElementException.class);
        fluentWaitTestNew   .ignoring(TimeoutException.class);;
        WebElement searchBoxVisibleNew = fluentWaitTestNew.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBox")));
        searchBoxVisibleNew = fluentWaitTestNew.until(ExpectedConditions.elementToBeClickable(By.id("searchBox")));
        System.out.println("element is Visible and Clickable");
        searchBoxVisibleNew.sendKeys("Laptop");
        System.out.println("2. Fluent Wait Technique 2 without Chaining Method & Lamda Exp Passed");



    }
}