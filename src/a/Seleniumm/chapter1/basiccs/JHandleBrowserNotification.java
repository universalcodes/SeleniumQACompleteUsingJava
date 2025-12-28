package a.Seleniumm.chapter1.basiccs;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class JHandleBrowserNotification {
    public static void main(String[] args) throws InterruptedException {
        // ======= CONFIGURE CASE =======
        // Case 1: Allow while visiting → use 1
        // Case 2: Allow this time → use 1 + temp profile
        // Case 3: Never allow → use 2

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();

        // Change this value to 1 (allow), 2 (block), or remove for prompt
        prefs.put("profile.default_content_setting_values.geolocation", 1); // 1 = Allow
      // prefs.put("profile.default_content_setting_values.geolocation", 2); //  2 = Block

        options.setExperimentalOption("prefs", prefs);

        // Optional: simulate ephemeral profile for "Allow this time"
      //   options.addArguments("--user-data-dir=" + System.getProperty("java.io.tmpdir") + "/chrome-temp-profile");

        WebDriver driver = new ChromeDriver(options);

        // ======= STEP 1: Navigate to site =======
        driver.get("https://permission.site/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ======= STEP 2: Click Location button =======
        WebElement locationButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Location']")));
        locationButton.click();

        // ======= STEP 3: Wait for result =======
        Thread.sleep(3000); // or use explicit wait for result element

        // ======= STEP 4: Validate via JS Permissions API =======
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object permissionState = js.executeAsyncScript(
                "const callback = arguments[arguments.length - 1];" +
                        "navigator.permissions.query({name:'geolocation'}).then(r => callback(r.state));"
        );

        System.out.println("📍 Location permission state: " + permissionState); // granted / denied / prompt



        // ======= STEP 6: Close browser =======

    }
}
