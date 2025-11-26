package a.Seleniumm.chapter1.basiccs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GHandleBrowserCertificates {
    public static void main(String[] args) {


        //Technique 1

//        /*----  Test Case 1 Positive
//        Add Cetificates to the Browser
            // Add URL where the website is not Secured
//        It will bypass the Expire the SSL certificate and Navigate to the website
//
//        */


        ChromeOptions setCertificates = new ChromeOptions();
        setCertificates.setAcceptInsecureCerts(true);  // setAcceptInsecureCerts(boolean type) is the inbuilt method if we pass true SSL Certificate will be passed
        //setCertificates.setAcceptInsecureCerts("String")  // compile time error as boolean is not given
        setCertificates.addArguments("Incognito");
        ChromeDriver openGooglePrivate = new ChromeDriver(setCertificates);
        openGooglePrivate.get("https://self-signed.badssl.com/");  // This the Website Where Website is not Secured



//        /*----  Test Case 2 Nagative
//        Dont Certificates to the Browser
        // Add URL where the website is not Secure
        //        It won't bypass the Expire the SSL certificate and no Navigate to the website


//        */

        ChromeOptions setCertificates2 = new ChromeOptions();
        setCertificates2.setAcceptInsecureCerts(false);  // setAcceptInsecureCerts(boolean type) is the inbuilt method if we  pass false SSL Certificate wont be by passed
        //setCertificates.setAcceptInsecureCerts("String")  // compile time error as boolean is not given
        setCertificates2.addArguments("Incognito");
        ChromeDriver openGooglePrivate2 = new ChromeDriver(setCertificates2);
        openGooglePrivate2.get("https://self-signed.badssl.com/");  // This the Website Where Website is not Secured




        //Technique 2  // if Selenium library is below version 4
        DesiredCapabilities setCertOldWay = new DesiredCapabilities();
        setCertOldWay.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        setCertOldWay.setCapability(CapabilityType.BROWSER_NAME, "Incognito");
        openGooglePrivate.get("https://self-signed.badssl.com/");  // This the Website Where Website is not Secured

        // setCapability is the inbuilt method where we have used String Constant and boolean Type
        // the following interface CapabilityType.ACCEPT_INSECURE_CERTS
        //ACCEPT_INSECURE_CERTS is the fixed String Constant
        // There are some other Strings constants as well
        //BROWSER_NAME, PLATFORM_NAME, BROWSER_VERSION, ACCEPT_INSECURE_CERTS, PAGE_LOAD_STRATEGY, PROXY, SET_WINDOW_RECT, TIMEOUTS, STRICT_FILE_INTERACTABILITY UNHANDLED_PROMPT_BEHAVIOUR, ENABLE_DOWNLOADS



        /*
        Summary

        1. Some websites are not secure in that case we need a SSL Certificate
        Selenium 4 Technique
        we need to use ChromeOptions Class which contains inbuilt
        method  setAcceptInsecureCerts with boolean type Parameter
        true means certificate is added true
        false means certificate is not added false

       Selenium 3 Technique
       we need to use DesiredCapabilities Class which contains inbuilt
 // setCapability is the inbuilt method where we have used String Constant and boolean Type
        // the following interface CapabilityType.ACCEPT_INSECURE_CERTS
        //ACCEPT_INSECURE_CERTS is the fixed String Constant
        // There are some other Strings constants as well
        //BROWSER_NAME, PLATFORM_NAME, BROWSER_VERSION, ACCEPT_INSECURE_CERTS, PAGE_LOAD_STRATEGY, PROXY, SET_WINDOW_RECT, TIMEOUTS, STRICT_FILE_INTERACTABILITY UNHANDLED_PROMPT_BEHAVIOUR, ENABLE_DOWNLOADS


         */
    }
}
