package d.chapter4.selenium.waitss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BHardSeleniumWait {
    /*
          points to Remember
    1. Hard Wait - It is also known as Thread.sleep Wait
        It waits for the element with Fixed time, Time is Defined by User
        Though it is not recommended for Automation Script
        for example -
                Thread.sleep(5000);

        Thread is the inbuilt class of Java, sleep is the inbuilt method of Thread Class
        It uses the compile Time exception - InterruptedException
        The Args type of Sleep
        * sleep(long milliseconds)  // In the above example - 5000 means milliseconds, if we convert the milliseconds into seconds then it is 5 Seconds
        Thread.sleep(Duration.ofSeconds(5));   // Here Script wait for fix 5 Seconds we have used Duration class import from java.time,
        ofSeconds is the inbuilt method of Duration class, ofSeconds means wait time will be in Seconds
          Thread.sleep(Duration.ofSeconds(5));   // Here Script wait for fix 5 Seconds
        Thread.sleep(Duration.ofMillis(5000));   // Here Script wait for fix 5000 milliseconds which means fix 5 Seconds
        Thread.sleep(Duration.ofMinutes(1));   // Here Script wait for fix minute
        Thread.sleep(Duration.ofHours(1));   // Here Script wait for fix an Hour
        Thread.sleep(Duration.ofNanos(34567));   // Here Script wait for fix 34567 nano
        Thread.sleep(Duration.ofNanos(1000000000l)); //Here Script wait for fix an 1000000000 nanos which means fix 1 Second
        Thread.sleep(Duration.ofDays(1)); //Here Script wait for 1 Day
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");
        Thread.sleep(5000);   // Here Script wait for fix 5 Seconds
        Thread.sleep(Duration.ofSeconds(5));   // Here Script wait for fix 5 Seconds
        Thread.sleep(Duration.ofMillis(5000));   // Here Script wait for fix 5000 milliseconds which means fix 5 Seconds
        Thread.sleep(Duration.ofMinutes(1));   // Here Script wait for fix minute
      //  Thread.sleep(Duration.ofHours(1));   // Here Script wait for fix an Hour
        Thread.sleep(Duration.ofNanos(1000000000l)); //Here Script wait for fix an 1000000000 nanos which means fix 1 Second
      //  Thread.sleep(Duration.ofDays(1)); //Here Script wait for 1 Day
        System.out.println("Thread Wait is Completed");

    }
}
