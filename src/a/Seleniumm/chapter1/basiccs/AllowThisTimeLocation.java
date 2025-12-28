package a.Seleniumm.chapter1.basiccs;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import java.nio.file.*;
import java.util.*;

public class AllowThisTimeLocation {
    public static void main(String[] args) throws Exception {
        // Step 1: Create a unique temp profile directory
        //  Path tempProfile = Files.createTempDirectory("chrome-ephemeral-");

        // Step 2: Configure ChromeOptions
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        //     prefs.put("profile.default_content_setting_values.geolocation", 1); // Allow location
        prefs.put("profile.default_content_setting_values.geolocation", 0); // Allow location

        options.setExperimentalOption("prefs", prefs);

        // Attach temp profile (ephemeral)
    //    options.addArguments("--user-data-dir=" + tempProfile.toString());

        WebDriver driver = new ChromeDriver(options);

        // Step 3: Navigate to permission.site
        driver.get("https://permission.site/");
        driver.findElement(By.xpath("//*[text()='Location']")).click();

        Thread.sleep(3000);

        // Step 4: Validate permission state via JS
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object locationStatus = js.executeAsyncScript(
                "const cb = arguments[arguments.length - 1];" +
                        "navigator.permissions.query({name:'geolocation'}).then(r => cb(r.state));"
        );
        System.out.println("📍 Location permission state: " + locationStatus);

        driver.quit();

        // Step 5: Delete temp profile (so next run prompts again)
//        try {
//        //    Files.walk(tempProfile).sorted(Comparator.reverseOrder())
//             //    .forEach(p -> p.toFile().delete());
//        } catch (Exception ignored) {}
//    }
    }
}