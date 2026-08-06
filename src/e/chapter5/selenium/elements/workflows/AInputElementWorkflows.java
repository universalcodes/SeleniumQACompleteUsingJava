package e.chapter5.selenium.elements.workflows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AInputElementWorkflows  {

    /*
    input element workflows:
    input element workflows are the sequences of actions or steps that a user can perform on input elements in a web application.
    These workflows typically involve interacting with various types of input elements,
    such as text fields, checkboxes, radio buttons, dropdowns, and buttons.
    The goal of these workflows is to capture user input, validate it, and submit it to the server for processing.
    we are covering the following text field input element workflows in this class
        1. Locate the Input Type as Text  use isDisplayed()
        2. Enter the Text use sendKeys
        3. Clear The Text use clear()
        4. Ensure the Input Type as Text should be displayed, enabled
        5. Ensure the Input Type as Text should be displayed, disabled
        6. Ensure the Input Type as Text should be not displayed in html but hidden, enabled
        7. Ensure the Input Type as Text should be not displayed in html but hidden, disabled
        8. Ensure the Input Type as Text should be entered through keyboard.
        9. Ensure the Input Type as Text should be copy using ctrl V, then Clear finally paste it inside text Box.

     */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("F:\\Full Selenium Java Journey\\CompleteQASelenium\\htmlCodes\\inputBox.html");


        System.out.println("1. Locate the Input Type as Text & should be Visible as Well");
        WebElement locateInputTypeAsText = openBrowser.findElement(By.id("txtLocate"));
        boolean textBoxIsVisible = locateInputTypeAsText.isDisplayed();
        System.out.println("Text Box is Visible: " + textBoxIsVisible);


        System.out.println("2. Locate the Input Type as Text should be Visible & Enabled as Well");
        WebElement locateInputTypeAsTextEnabled = openBrowser.findElement(By.id("txtLocate"));
        boolean textBoxIsVisibles = locateInputTypeAsTextEnabled.isDisplayed();
        boolean textBoxIsVisibleEnabled = locateInputTypeAsTextEnabled.isDisplayed();
        System.out.println("Text Box is Visible as: " + textBoxIsVisibles +" and Enabled as " + textBoxIsVisibleEnabled) ;


        System.out.println("3. Locate the Input Type as Text should be Visible, Enabled as Well & Enter the Text");
        WebElement enterTextInTextBox = openBrowser.findElement(By.id("txtLocate"));
        System.out.println(enterTextInTextBox.isDisplayed() + " and Enabled as " + enterTextInTextBox.isEnabled());
        System.out.println("Text Box is Visible as: " + textBoxIsVisibles +" and Enabled as " + textBoxIsVisibleEnabled) ;
        locateInputTypeAsTextEnabled.sendKeys("Selenium Java Journey");

        System.out.println("4. Locate the Input Type as Text should be visible, enabled then clear the input box, Enter the New Text");
        WebElement clearTextAndReEnterTextBox = openBrowser.findElement(By.id("txtClear"));
        System.out.println(clearTextAndReEnterTextBox.isDisplayed() + " and Enabled as " + clearTextAndReEnterTextBox.isEnabled());
        clearTextAndReEnterTextBox.clear();
        clearTextAndReEnterTextBox.sendKeys("Text is Cleared and Re-Entered Successfully");


        System.out.println("5. Locate the Input Type as Text Text should be visible, enabled, Enter the New Text & Validate that text");
        WebElement enterTextInTextBoxAndValidate = openBrowser.findElement(By.id("txtEnter"));
        enterTextInTextBoxAndValidate.sendKeys("Selenium Java Journey");
        if(enterTextInTextBoxAndValidate.isDisplayed() && enterTextInTextBoxAndValidate.isEnabled())
        {
            System.out.println("Text is Visible and Enabled");
            String validateEnteredInputText = enterTextInTextBox.getAttribute("value");
            System.out.println("Validate Entered Input Text is: " + validateEnteredInputText);
            if(validateEnteredInputText.equals("Selenium Java Journey"))
            {
                System.out.println("Text is Entered Successfully");
            }
        }
        else
        {
            System.out.println("Text is Not Entered as Input Box is Not Visible or Not Enabled");
        }

        System.out.println("6. Locate the Input Type as Text Text should be visible, enabled, Clear the Text Box, Enter the New Text, Clear it & Paste the Text & Finally Validate the text");
        WebElement copyPasteTextInTextBox = openBrowser.findElement(By.id("txtCopyPaste"));
        System.out.println("Text Box is Visible as: " + copyPasteTextInTextBox.isDisplayed() +" and Enabled as " + copyPasteTextInTextBox.isEnabled()) ;
        System.out.println("Clearing the Existing Text in the Text Box");
      if(copyPasteTextInTextBox.isDisplayed() && copyPasteTextInTextBox.isEnabled())
        {
            copyPasteTextInTextBox.clear();
            System.out.println("Entering the New Text in the Text Box");
            copyPasteTextInTextBox.sendKeys("Text is Cleared, Copied and Pasted Successfully");
            System.out.println("Performing following Keyboard Actions Select the Entire Copy the Text, Clear the Text Box, Paste the Text");
            copyPasteTextInTextBox.sendKeys(Keys.CONTROL, "a");  // Select All
            copyPasteTextInTextBox.sendKeys(Keys.CONTROL, "c");  // Copy the Text
            copyPasteTextInTextBox.clear();
            copyPasteTextInTextBox.sendKeys(Keys.CONTROL, "v");  // paste the Text
            String validateEnteredInputText = copyPasteTextInTextBox.getAttribute("value");
            System.out.println("Validate Entered Input Text is: " + validateEnteredInputText);

            if(validateEnteredInputText.equals("Text is Cleared, Copied and Pasted Successfully"))
            {
                System.out.println("Text is Entered Successfully");
            }
        }
        else
        {
            System.out.println("Text is Not Entered as Input Box is Not Visible or Not Enabled");
        }

        System.out.println("7. Locate the Input Type as Text Text should be visible, enabled, Clear the Existing Text Box Value, Enter the New Text, Clear it & Paste the Text Through Keyboard & Finally Validate the text");

        WebElement copyPasteTextInTextBoxA = openBrowser.findElement(By.id("txtCopyPaste"));
        String validateExistingTextInsideTextBox = copyPasteTextInTextBoxA.getAttribute("value");
        if(!(validateExistingTextInsideTextBox.equals(null)))
        {
            copyPasteTextInTextBoxA.clear(); // it returns the existing text inside the text box, if it is not null then clear the text box
        }
        System.out.println("Text Box is Visible as: " + copyPasteTextInTextBoxA.isDisplayed() +" and Enabled as " + copyPasteTextInTextBoxA.isEnabled()) ;
        System.out.println("Clearing the Existing Text in the Text Box");
        if(copyPasteTextInTextBoxA.isDisplayed() && copyPasteTextInTextBoxA.isEnabled())
        {
            System.out.println("Entering the New Text in the Text Box");
            copyPasteTextInTextBoxA.sendKeys("Selenium Text is Cleared, Copied and Pasted Successfully");
            System.out.println("Performing following Keyboard Actions Select the Entire Copy the Text, Clear the Text Box, Paste the Text");
            copyPasteTextInTextBoxA.sendKeys(Keys.chord(Keys.CONTROL, "a"));  // Select entire text
            copyPasteTextInTextBoxA.sendKeys(Keys.chord(Keys.CONTROL, "c"));  // copy the entire text
            copyPasteTextInTextBoxA.clear();
            copyPasteTextInTextBoxA.sendKeys(Keys.chord(Keys.CONTROL, "v"));  // paste the entire text
            String validateEnteredInputTextNew = copyPasteTextInTextBoxA.getAttribute("value");
            System.out.println("Validate Entered Input Text is: " + validateEnteredInputTextNew);

            if(validateEnteredInputTextNew.equals("Text is Cleared, Copied and Pasted Successfully"))
            {
                System.out.println("Text is Entered Successfully");
            }
        }
        else
        {
            System.out.println("Text is Not Entered as Input Box is Not Visible or Not Enabled");
        }

        System.out.println("8. Ensure Input Box is Displayed But Disabled ");
        WebElement inputTextBoxDisabled = openBrowser.findElement(By.id("txtDisabled"));

        if(!(inputTextBoxDisabled.isEnabled() ))
        {
            boolean inputBoxDisabled =  inputTextBoxDisabled.isEnabled();
            {
                System.out.println(inputBoxDisabled);

            }
        }

        System.out.println("8.1. Ensure Input Box is Displayed But Disabled, Entering the Text on that Box");

        /*
        uncomment to Test
                inputTextBoxDisabled.sendKeys("Sending Data on Disabled Box");  // As This Text Box is Disabled it throws an Exception as ElementNotInteractableException

         */

        System.out.println("9. Ensure that Inbox Text Box is not displayed but enabled ");
        WebElement inputTextBoxHiddenAndEnabled = openBrowser.findElement(By.xpath("//*[@placeholder='Hidden enabled']"));

        if((inputTextBoxHiddenAndEnabled.isEnabled() ))
        {
            boolean inputBoxHiddenAndEnabled =  inputTextBoxHiddenAndEnabled.isEnabled();
            {
                System.out.println(inputBoxHiddenAndEnabled);

            }
        }

        System.out.println("9.1. Ensure Input Box is Hidden But Enabled, Entering the Text on that Box");

        inputTextBoxHiddenAndEnabled.sendKeys("Sending Data on Disabled Box");  // As This Text Box is Disabled it throws an Exception as ElementNotInteractableException
        String validateEnteredTextOnHiddenInputBox = inputTextBoxHiddenAndEnabled.getAttribute("value"); // Validate the Entered text as inbox text box is Hidden But Enabled is Hidden But Enabled
        System.out.println(validateEnteredTextOnHiddenInputBox);

    }
}
