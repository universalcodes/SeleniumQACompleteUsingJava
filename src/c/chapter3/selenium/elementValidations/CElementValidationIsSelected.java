package c.chapter3.selenium.elementValidations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CElementValidationIsSelected {
    /*
    points to remember
    1. isSelected() is the inbuilt method which helps to understand weather element is selected or not
       isSelected() return type is boolean if Element is selected then true otherwise false
       isSelected() no argument is needed
       It is mainly used with:
           - CheckBox
           - Radio Button
           - Option elements (inside <select>)
      It is generally NOT used for:
           - Text Box
           - Button
           - Link
           - Label
    *  If the Element is Not visible then it throws an Exception as NoSuchElementException


     */

    public static void main(String[] args) {
        System.out.println("Launch Browser");
        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/seleniumpage.HTML");

        System.out.println("1. Validate Valid Radio Box Element is already selected or not using isSelected(), Radio Box is Already Selected");
        WebElement checkValidWebElementRadioBoxSelected = openBrowser.findElement(By.id("radioButtonSelected"));
        boolean validElementResultRadioBox = checkValidWebElementRadioBoxSelected.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultRadioBox);
        System.out.println(checkValidWebElementRadioBoxSelected.isSelected());   // Return true if Element radio box is already selected

        System.out.println("2. Validate Valid Radio Box Element is already selected or not using isSelected(), Radio Box is not Selected");
        WebElement checkValidWebElementRadioBoxNotSelected = openBrowser.findElement(By.name("accountType"));
        boolean validElementResult = checkValidWebElementRadioBoxNotSelected.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResult);
        System.out.println(checkValidWebElementRadioBoxNotSelected.isSelected());   // Return true if Element radio box is already selected, otherwise false

        System.out.println("3. Validate Valid Check Box Element is already selected or not using isSelected(), Check Box is Already Selected");
        WebElement checkValidWebElementCheckBoxSelected = openBrowser.findElement(By.id("savingAccount"));
        boolean validElementResultCheckBox = checkValidWebElementCheckBoxSelected.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultCheckBox);
        System.out.println(checkValidWebElementCheckBoxSelected.isSelected());   // Return true if Element check box is already selected otherwise false

        System.out.println("4. Validate Valid Check Box Element is already selected or not using isSelected(), Check Box not Selected");
        WebElement checkValidWebElementCheckBoxNotSelected = openBrowser.findElement(By.id("salaryAccount"));
        boolean validElementResultCheckBoxTwo = checkValidWebElementCheckBoxNotSelected.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultCheckBoxTwo);
        System.out.println(checkValidWebElementCheckBoxNotSelected.isSelected());   // Return true if Element radio box is already selected, otherwise false

        System.out.println("5. Validate Valid DropDown Element is already selected or not using isSelected(), Dropdown is Already Selected");
        WebElement checkValidWebElementDropDownBoxSelected = openBrowser.findElement(By.xpath("//option[normalize-space()='Current Account']"));
        boolean validElementResultDropDownBox = checkValidWebElementDropDownBoxSelected.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultDropDownBox);
        System.out.println(checkValidWebElementDropDownBoxSelected.isSelected());   // Return true if Element Dropdown box value is already selected otherwise false

        System.out.println("6. Validate Valid Check Box Element is already selected or not using isSelected(), Dropdown not Selected");
        WebElement checkValidWebElementDropDownBoxNotSelected = openBrowser.findElement(By.xpath("//option[normalize-space()='Salary Account']"));
        boolean validElementResultDropDownTwo = checkValidWebElementDropDownBoxNotSelected.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultDropDownTwo);
        System.out.println(checkValidWebElementDropDownBoxNotSelected.isSelected());   // Return true if Element radio box is already selected, otherwise false


        /*
        ----------------------------------------------------Deal with Hidden Element----------------------------------------------------------


         */
        System.out.println("7. Validate Valid Check Box Element is already selected or not using isSelected(), Check Box is Already Selected But Hidden");
        WebElement checkValidWebElementCheckBoxSelectedHidden = openBrowser.findElement(By.id("hiddenCheckBox"));
        boolean validElementResultCheckBoxHidden = checkValidWebElementCheckBoxSelectedHidden.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultCheckBoxHidden);
        System.out.println(checkValidWebElementCheckBoxSelectedHidden.isSelected());   // Return true if Element check box is hidden & already selected otherwise false


        System.out.println("8. Validate Valid Check Box Element is already selected or not using isSelected(), Check Box not Selected But Hidden");
        WebElement checkValidWebElementCheckBoxNotSelectedHidden = openBrowser.findElement(By.id("hiddenCheckBox2"));
        boolean validElementResultCheckBoxHiddenNotSelected = checkValidWebElementCheckBoxNotSelectedHidden.isSelected();
        System.out.println("The Result of Valid Element as follows:\t"+validElementResultCheckBoxHiddenNotSelected);
        System.out.println(checkValidWebElementCheckBoxNotSelectedHidden.isSelected());   // Return true if Element check box is already selected otherwise false





    }
}
