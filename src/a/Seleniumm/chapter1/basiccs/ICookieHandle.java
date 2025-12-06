package a.Seleniumm.chapter1.basiccs;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class ICookieHandle {

    public static void main(String[] args) {
        /*
        Points to Remember
        Cookie is the small text file stores in the browser. where it helps to memorize
        the user sessions.
        user sessions - lets say user has entered credentials of one of the websites, so if a user allows it to save into the Cookie,         no need to reenter credentials again and again
         whenever a user tries to access that website its auto saves.

       Preferences - it Helps to save user Preferences,
       for example - user tries to access one of the websites where we have one of the options
       as language once user sets the language of that website no need to set the language again & again
        Cookie is the inbuilt class where it helps to retrieve the cookie
        .getCookieNamed() is the inbuilt method from Cookie Class
        Remember if the Cookie is not available or cookie is invalid then returns null

// 🔹 Cookie Basics
// A cookie is a small text file stored in the browser.
// It helps websites remember user sessions, preferences, and activity.

// 🔹 Simple Cookie
// new Cookie("name","value") → creates a cookie with only name & value.
// Domain, path, expiry will be null by default.

// 🔹 Retrieve Cookie
// driver.manage().getCookieNamed("cookieName") → fetches a cookie by name.
// Returns null if the cookie does not exist.

// 🔹 Add Cookie
// driver.manage().addCookie(cookieObj) → adds a cookie to the current domain.
// You must create the Cookie object first (simple or builder).

// 🔹 Delete Cookie
// driver.manage().deleteCookieNamed("cookieName") → deletes a specific cookie.
// driver.manage().deleteAllCookies() → clears all cookies from the browser.

// 🔹 Builder Pattern
// new Cookie.Builder("name","value") → used to create a detailed cookie.
// .domain("example.com") → sets the domain where the cookie is valid.
// .path("/inventory") → restricts the cookie to a specific path.
// .isSecure(true) → cookie will only be sent over HTTPS.
// .expiresOn(new Date(...)) → sets the expiry date/time.
// .build() → finalizes and returns the Cookie object.

// 🔹 Teaching Note
// Simple Cookie → quick tests with just name & value.
// Builder Cookie → when you need domain, path, secure flag, expiry, etc.
         */

        WebDriver driver = new ChromeDriver();

        // Step 1: Open SauceDemo login page
        driver.get("https://www.saucedemo.com");

        // Step 2: Perform login (demo credentials)
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Step 3: Retrieve  invalid cookie set by the site
        Cookie retrievedInvalidCookie = driver.manage().getCookieNamed("session-username1");  // The following line cookie returns null as cookie name as invalid
        System.out.println("Retrieved invalid cookie\n: " + retrievedInvalidCookie);

        // Step 4: Retrieve cookie set by the site
        Cookie retrievedValidCookie = driver.manage().getCookieNamed("session-username");  // The following line cookie returns valid Cookie as cookie name as valid
        System.out.println("Retrieved valid cookie\t: " + retrievedValidCookie);

        //Add a Single cookie
        Cookie addNewCookie = new Cookie("Username", "Yogesh"); // Cookie is an inbuilt class where two String level arguments are required like key & Value here username is key & value is yogesh
         System.out.println("Added New Cookie Name is\t"+addNewCookie);
   //     boolean username = true;
//        Cookie addCookie2 = new Cookie(username, true); // Compile Time Error as Arguments are boolean datatype which is not allowed, only String is allowed

        // Get Domain Name
        String getDomainName =  new Cookie("Username", "Yogesh").getDomain();
        System.out.println("No Domain is Provided as\t"+getDomainName); // Domain is Null as No Domain is Provided.


        // Add Cookie Builder or get Detailed Cookie with Multiple Attributes

        Cookie addCookieBuilder = new Cookie
                .Builder("Username1", "Yogesh") // we are adding the cookie  here Builder is the inbuilt class from the Cookie Class. It also helps to add multiple attributes such as domain & other attributes,
                .domain("saucedemo.com")  // .domain() is the inbuilt method with Builder return type, where we're passing the domain where cookie has to applied.
                .path("/inventory")   //path()  is the inbuilt method with Builder return type its helps to define cookie for given path for example cookie will be handled for following path /inventory
                .isSecure(true) //isSecure() is the inbuilt method with Builder return type true means  helps to check cookie is sent on secure connection & it returns secure
                .expiresOn(new Date(System.currentTimeMillis() + 86400000)) // expiresOn is the inbuilt method with Builder return type Here cookie is expired after 1 day
                .build(); // it is an inbuilt method where our cookie objects are ready
        System.out.println("Builder Cookie with given Attributes:\t" + addCookieBuilder);

        // Add Cookie Builder or get Detailed Cookie with no Multiple Attributes

        Cookie addCookieBuilder2 = new Cookie
                .Builder("", "") // we are adding the cookie no cookie defined  here Builder is the inbuilt class from the Cookie Class. It also helps to add multiple attributes such as domain, As No Cookie  Defined it returns Null
                .domain("")  // .domain() is the inbuilt method with Builder return type, where we're not passing the domain where cookie has to applied. it returns Null
                .path("/")   //path()  is the inbuilt method with Builder return type that helps to define cookie for given path for example cookie will be handled for following path / here no path is defined it returns /
                .isSecure(false) //isSecure() is the inbuilt method with Builder return type false means helps to check cookie is not sent on secure connection its returns nothing
                .expiresOn(new Date(System.currentTimeMillis() + 86400000)) // expiresOn is the inbuilt method with Builder return type Here cookie is expired after 1 day
                .build(); // it is an inbuilt method where our cookie objects are ready
        System.out.println("Builder Cookie with No Attributes:\t" + addCookieBuilder2);


        // Delete Particular Cookie

        Cookie deleteExistingCookie = driver.manage().getCookieNamed("standard_user");
      // driver.manage().deleteCookie(deleteExistingCookie); // deletes using the Cookie object
       // System.out.println(deleteExistingCookie);  // Run Time Error It throws Exception as Cookie is Deleted

        // Delete All Existing Cookie
      //  driver.manage().deleteAllCookies();

    }

}
