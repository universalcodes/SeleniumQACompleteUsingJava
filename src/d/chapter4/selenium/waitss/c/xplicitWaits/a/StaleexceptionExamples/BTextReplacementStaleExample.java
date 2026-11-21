package d.chapter4.selenium.waitss.c.xplicitWaits.a.StaleexceptionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BTextReplacementStaleExample {
    public static void main(String[] args) {
        ChromeDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/htmlCodes/Y1StaleTextReplacementException.html");
        WebElement findTextElement = openBrowser.findElement(By.xpath("//*[text()='Original message']"));
        String validateText = findTextElement.getText();
        System.out.println("Before Text Replacement: " + validateText);
        WebElement clickButton = openBrowser.findElement(By.xpath("//*[normalize-space()='Replace Message']"));
        clickButton.click();
        System.out.println(findTextElement.isDisplayed());


    }
}
