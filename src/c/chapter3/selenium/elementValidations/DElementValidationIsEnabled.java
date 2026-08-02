package c.chapter3.selenium.elementValidations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DElementValidationIsEnabled {

    /*
    point to remember
     * 1. isEnabled() is an inbuilt WebElement method.
     * 2. It is used to check whether a web element is enabled or disabled.
     * 3. It returns a boolean value.
     * 4. Return type is boolean.
     * 5. It takes no arguments.
     * 6. It can be used for buttons, text boxes, dropdowns, checkboxes, radio buttons, etc.
     * 7. If the element is enabled, it returns true.
     * 8. If the element is disabled, it returns false.
     */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("1. Validate Valid Inbox Box is Enabled");
        WebElement checkValidWebElementInputBoxEnabled = openBrowser.findElement(By.id("txtEnabledUsername"));
        boolean validInputBoxEnabledResult = checkValidWebElementInputBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputBoxEnabledResult);
        System.out.println(checkValidWebElementInputBoxEnabled.isEnabled());   // Return true if Element input box is already Enabled

        System.out.println("2. Validate Valid Inbox Password Box is Enabled");
        WebElement checkValidWebElementInputPasswordBoxEnabled = openBrowser.findElement(By.id("txtEnabledPassword"));
        boolean validInputPasswordBoxEnabledResult = checkValidWebElementInputPasswordBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputPasswordBoxEnabledResult);
        System.out.println(checkValidWebElementInputPasswordBoxEnabled.isEnabled());   // Return true if Element password input box is already Enabled

        System.out.println("3. Validate Valid Inbox Email Box is Enabled");
        WebElement checkValidWebElementInputEmailBoxEnabled = openBrowser.findElement(By.id("txtEnabledEmail"));
        boolean validInputEmailBoxEnabledResult = checkValidWebElementInputEmailBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputEmailBoxEnabledResult);
        System.out.println(checkValidWebElementInputEmailBoxEnabled.isEnabled());   // Return true if Element email box is already Enabled

        System.out.println("4. Validate Valid Inbox Email Box is Enabled");
        WebElement checkValidWebElementInputAgeBoxEnabled = openBrowser.findElement(By.id("txtEnabledAge"));
        boolean validInputAgeBoxEnabledResult = checkValidWebElementInputAgeBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputAgeBoxEnabledResult);
        System.out.println(checkValidWebElementInputAgeBoxEnabled.isEnabled());   // Return true if Element age number box is already Enabled

        System.out.println("5. Validate Valid Inbox Date Box is Enabled");
        WebElement checkValidWebElementInputDateBoxEnabled = openBrowser.findElement(By.id("txtEnabledDate"));
        boolean validInputDateBoxEnabledResult = checkValidWebElementInputDateBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputDateBoxEnabledResult);
        System.out.println(checkValidWebElementInputDateBoxEnabled.isEnabled());   // Return true if Element date number box is already Enabled


        System.out.println("6. Validate Valid Inbox Comment Box is Enabled");
        WebElement checkValidWebElementInputCommentBoxEnabled = openBrowser.findElement(By.id("txtEnabledDate"));
        boolean validInputCommentBoxEnabledResult = checkValidWebElementInputCommentBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputCommentBoxEnabledResult);
        System.out.println(checkValidWebElementInputCommentBoxEnabled.isEnabled());   // Return true if Element comment box is already Enabled


        System.out.println("7. Validate Valid Inbox Country  is Enabled");
        WebElement checkValidWebElementInputCountryBoxEnabled = openBrowser.findElement(By.id("ddlEnabledCountry"));
        boolean validInputCountryBoxEnabledResult = checkValidWebElementInputCountryBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputCountryBoxEnabledResult);
        System.out.println(checkValidWebElementInputCountryBoxEnabled.isEnabled());   // Return true if Element Country is already Enabled

        System.out.println("8. Validate Valid File Upload is Enabled");
        WebElement checkValidWebElementFileUploadEnabled = openBrowser.findElement(By.id("fileEnabledResume"));
        boolean validFileUploadEnabledResult = checkValidWebElementFileUploadEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validFileUploadEnabledResult);
        System.out.println(checkValidWebElementFileUploadEnabled.isEnabled());   // Return true if Element file upload is already Enabled

        System.out.println("9. Validate Valid Color Picker is Enabled");
        WebElement checkValidWebElementColorPickerBoxEnabled = openBrowser.findElement(By.id("colorEnabledTheme"));
        boolean checkValidWebElementColorPickerBoxEnabledResult = checkValidWebElementColorPickerBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+checkValidWebElementColorPickerBoxEnabledResult);
        System.out.println(checkValidWebElementColorPickerBoxEnabled.isEnabled());   // Return true if Element Color Picker is already Enabled

        System.out.println("10. Validate Submit Button is Enabled");
        WebElement checkValidWebElementSubmitBoxEnabled = openBrowser.findElement(By.id("btnEnabledSubmit"));
        boolean checkValidWebElementSubmitBoxEnabledResult = checkValidWebElementSubmitBoxEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+checkValidWebElementSubmitBoxEnabledResult);
        System.out.println(checkValidWebElementSubmitBoxEnabled.isEnabled());   // Return true if Element Submit Button is already Enabled


        
        /*
        All Input boxes are disabled
         */

        System.out.println("\nValidate Disabled Input Boxes\n");


        System.out.println("1. Validate Valid Inbox Box is Disabled");
        WebElement checkValidWebElementInputBoxDisabled = openBrowser.findElement(By.id("txtDisabledUsername"));
        boolean validInputBoxDisabledResult = checkValidWebElementInputBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputBoxDisabledResult);
        System.out.println(checkValidWebElementInputBoxDisabled.isEnabled());   // Return true if Element input box is already Disabled

        System.out.println("2. Validate Valid Inbox Password Box is Disabled");
        WebElement checkValidWebElementInputPasswordBoxDisabled = openBrowser.findElement(By.id("txtDisabledPassword"));
        boolean validInputPasswordBoxDisabledResult = checkValidWebElementInputPasswordBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputPasswordBoxDisabledResult);
        System.out.println(checkValidWebElementInputPasswordBoxDisabled.isEnabled());   // Return true if Element password input box is already Disabled

        System.out.println("3. Validate Valid Inbox Email Box is Disabled");
        WebElement checkValidWebElementInputEmailBoxDisabled = openBrowser.findElement(By.id("txtDisabledEmail"));
        boolean validInputEmailBoxDisabledResult = checkValidWebElementInputEmailBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputEmailBoxDisabledResult);
        System.out.println(checkValidWebElementInputEmailBoxDisabled.isEnabled());   // Return true if Element email box is already Disabled

        System.out.println("4. Validate Valid Inbox Email Box is Disabled");
        WebElement checkValidWebElementInputAgeBoxDisabled = openBrowser.findElement(By.id("txtDisabledAge"));
        boolean validInputAgeBoxDisabledResult = checkValidWebElementInputAgeBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputAgeBoxDisabledResult);
        System.out.println(checkValidWebElementInputAgeBoxDisabled.isEnabled());   // Return true if Element age number box is already Disabled

        System.out.println("5. Validate Valid Inbox Date Box is Disabled");
        WebElement checkValidWebElementInputDateBoxDisabled = openBrowser.findElement(By.id("txtDisabledDate"));
        boolean validInputDateBoxDisabledResult = checkValidWebElementInputDateBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputDateBoxDisabledResult);
        System.out.println(checkValidWebElementInputDateBoxDisabled.isEnabled());   // Return true if Element date number box is already Disabled


        System.out.println("6. Validate Valid Inbox Comment Box is Disabled");
        WebElement checkValidWebElementInputCommentBoxDisabled = openBrowser.findElement(By.id("txtDisabledDate"));
        boolean validInputCommentBoxDisabledResult = checkValidWebElementInputCommentBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputCommentBoxDisabledResult);
        System.out.println(checkValidWebElementInputCommentBoxDisabled.isEnabled());   // Return true if Element comment box is already Disabled


        System.out.println("7. Validate Valid Inbox Country  is Disabled");
        WebElement checkValidWebElementInputCountryBoxDisabled = openBrowser.findElement(By.id("ddlDisabledCountry"));
        boolean validInputCountryBoxDisabledResult = checkValidWebElementInputCountryBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputCountryBoxDisabledResult);
        System.out.println(checkValidWebElementInputCountryBoxDisabled.isEnabled());   // Return true if Element Country is already Disabled

        System.out.println("8. Validate Valid File Upload is Disabled");
        WebElement checkValidWebElementFileUploadDisabled = openBrowser.findElement(By.id("fileDisabledResume"));
        boolean validFileUploadDisabledResult = checkValidWebElementFileUploadDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validFileUploadDisabledResult);
        System.out.println(checkValidWebElementFileUploadDisabled.isEnabled());   // Return true if Element file upload is already Disabled

        System.out.println("9. Validate Valid Color Picker is Disabled");
        WebElement checkValidWebElementColorPickerBoxDisabled = openBrowser.findElement(By.id("colorDisabledTheme"));
        boolean checkValidWebElementColorPickerBoxDisabledResult = checkValidWebElementColorPickerBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+checkValidWebElementColorPickerBoxDisabledResult);
        System.out.println(checkValidWebElementColorPickerBoxDisabled.isEnabled());   // Return true if Element Color Picker is already Disabled

        System.out.println("10. Validate Submit Button is Disabled");
        WebElement checkValidWebElementSubmitBoxDisabled = openBrowser.findElement(By.id("btnDisabledSubmit"));
        boolean checkValidWebElementSubmitBoxDisabledResult = checkValidWebElementSubmitBoxDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+checkValidWebElementSubmitBoxDisabledResult);
        System.out.println(checkValidWebElementSubmitBoxDisabled.isEnabled());   // Return true if Element Submit Button is already Disabled

        System.out.println("\nValidate Enabled Input Boxes as Hidden \n");

        System.out.println("1. Validate Valid Inbox Box Enabled but Hidden");
        WebElement checkValidWebElementInputBoxHiddenEnabled = openBrowser.findElement(By.id("txtHiddenEnabledUsername"));
        boolean validInputBoxHiddenEnabledResult = checkValidWebElementInputBoxHiddenEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputBoxHiddenEnabledResult);
        System.out.println(checkValidWebElementInputBoxHiddenEnabled.isEnabled());   // Return true if Element input box is already Enabled but  Hidden

        System.out.println("2. Validate Valid Inbox Password Box Enabled but Hidden");
        WebElement checkValidWebElementPasswordBoxHiddenEnabled = openBrowser.findElement(By.id("txtHiddenEnabledPassword"));
        boolean validInputPasswordBoxEnabledHiddenResult = checkValidWebElementPasswordBoxHiddenEnabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputPasswordBoxEnabledHiddenResult);
        System.out.println(checkValidWebElementPasswordBoxHiddenEnabled.isEnabled());   // Return true if Element password input box is already Enabled but Hidden

        System.out.println("\nValidate Disabled Input Boxes as Hidden \n");

        System.out.println("1. Validate Valid Inbox Box Disabled but Hidden");
        WebElement checkValidWebElementInputBoxHiddenDisabled = openBrowser.findElement(By.id("txtHiddenDisabledUsername"));
        boolean validInputBoxHiddenDisabledResult = checkValidWebElementInputBoxHiddenDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputBoxHiddenDisabledResult);
        System.out.println(checkValidWebElementInputBoxHiddenDisabled.isEnabled());   // Return true if Element input box is already Disabled but Hidden

        System.out.println("2. Validate Valid Inbox Disabled Box Enabled but Hidden");
        WebElement checkValidWebElementPasswordBoxHiddenDisabled = openBrowser.findElement(By.id("txtHiddenDisabledPassword"));
        boolean validInputPasswordBoxHiddenDisabledResult = checkValidWebElementPasswordBoxHiddenDisabled.isEnabled();
        System.out.println("The Result of Valid Element as follows:\t"+validInputPasswordBoxHiddenDisabledResult);
        System.out.println(checkValidWebElementPasswordBoxHiddenDisabled.isEnabled());   // Return true if Element password input box is already Disabled but Hidden

        System.out.println("\nValidate Multiple Elements as Enabled \n");
        List<WebElement> checkMultipleElementsAsEnabled = openBrowser.findElements(By.xpath("//*[contains(@id, 'txtEnabled')]"));
        int countOfMultipleElementsAsEnabled = checkMultipleElementsAsEnabled.size();
        System.out.println("Total Count of Multiple Elements as Enabled\t" + countOfMultipleElementsAsEnabled);
        for(WebElement validateMultipleElementsAsEnabled : checkMultipleElementsAsEnabled)
        {
            System.out.println(validateMultipleElementsAsEnabled.isEnabled());
            String getEnabledElementsAttributes =    validateMultipleElementsAsEnabled.getAttribute(   "id");
            System.out.println("Get Enabled Elements Attributes as follows:\t"+getEnabledElementsAttributes);
        }


        System.out.println("\nValidate Multiple Elements as Enabled But Hidden \n");
        List<WebElement> checkMultipleElementsAsEnabledButHidden = openBrowser.findElements(By.xpath("//*[contains(@id, 'txtHiddenEnabled')]"));
        int countOfMultipleElementsAsEnabledButHidden = checkMultipleElementsAsEnabledButHidden.size();
        System.out.println("Total Count of Multiple Elements as Enabled But Hidden\t" + countOfMultipleElementsAsEnabledButHidden);
        for(WebElement validateMultipleElementsAsEnabledButHidden : checkMultipleElementsAsEnabledButHidden)
        {
            System.out.println(validateMultipleElementsAsEnabledButHidden.isEnabled());
            String getEnabledHiddenElementsAttributes =    validateMultipleElementsAsEnabledButHidden.getAttribute(   "id");
            System.out.println("Get Enabled Elements Attributes as follows:\t"+getEnabledHiddenElementsAttributes);
        }

        System.out.println("\nValidate Multiple Elements as Disabled \n");
        List<WebElement> checkMultipleElementsAsDisabled = openBrowser.findElements(By.xpath("//*[contains(@id, 'txtDisabled')]"));
        int countOfMultipleElementsAsDisabled = checkMultipleElementsAsDisabled.size();
        System.out.println("Total Count of Multiple Elements as Disabled\t" + countOfMultipleElementsAsDisabled);
        for(WebElement validateMultipleElementsAsDisabled : checkMultipleElementsAsDisabled)
        {
            System.out.println(validateMultipleElementsAsDisabled.isEnabled());
            String getDisabledElementsAttributes =    validateMultipleElementsAsDisabled.getAttribute(   "id");
            System.out.println("Get Enabled Elements Attributes as follows:\t"+getDisabledElementsAttributes);
        }

        System.out.println("\nValidate Multiple Elements as Disabled But Hidden \n");
        List<WebElement> checkMultipleElementsAsDisabledButHidden = openBrowser.findElements(By.xpath("//*[contains(@id, 'txtHiddenDisabled')]"));
        int countOfMultipleElementsAsDisabledButHidden = checkMultipleElementsAsDisabledButHidden.size();
        System.out.println("Total Count of Multiple Elements as Disabled as Hidden\t" + countOfMultipleElementsAsDisabledButHidden);
        for(WebElement validateMultipleElementsAsDisabledButHidden : checkMultipleElementsAsDisabledButHidden)
        {
            System.out.println(validateMultipleElementsAsDisabledButHidden.isEnabled());
            String getDisabledHiddenElementsAttributes =    validateMultipleElementsAsDisabledButHidden.getAttribute(   "id");
            System.out.println("Get Enabled Elements Attributes as follows:\t"+getDisabledHiddenElementsAttributes);
        }

    }
}
