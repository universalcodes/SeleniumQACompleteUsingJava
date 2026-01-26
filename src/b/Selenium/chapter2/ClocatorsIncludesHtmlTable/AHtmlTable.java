package b.Selenium.chapter2.ClocatorsIncludesHtmlTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AHtmlTable {
    public static void main(String[] args) {
        /*
        Points to Remember
        1. HTML Tables: Used to display tabular data in rows and columns.
        2. Important Tags used in html table:
            <table> : Defines the start of a table.
            <table border="1">
                border="1" → Adds a visible border around the table and its cells.
                By default, HTML tables have no border.
                Setting border="1" makes table lines visible (good for demo/learning).
                Modern practice: use CSS (e.g., style="border:1px solid black;").

            <caption> : Adds a title/description to the table.
            <thead> : Groups the header content.
            <tr>    : Defines a row.
            <th>    : Defines a header cell (bold by default).

            <tbody> : Groups the main body content.
            <td>    : Defines a standard data cell.

            <tfoot> : Groups footer content (like totals/summary).
            <td colspan="2">End of Records</td>
                colspan → Merges two columns into a single cell.
                Example: Instead of separate cells for "First Name" and "Last Name",
                both columns are combined into one cell spanning across 2 columns.
                Useful for summary rows, totals, or footer notes.

        Example Table:
        <table border="1">
            <caption>Student Information</caption>
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Yogesh</td>
                    <td>Kamra</td>
                </tr>
                <tr>
                    <td>Rahul</td>
                    <td>Sharma</td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="2">End of Records</td>
                </tr>
            </tfoot>
        </table>
        */

        WebDriver openBrowser = new ChromeDriver();
        openBrowser.get("file:///F:/Full%20Selenium%20Java%20Journey/CompleteQASelenium/HTMLCodes/ComplexTableTwo.html");

        System.out.println("Find the Table in HTML Code");
        WebElement findTableUsingTableTag = openBrowser.findElement(By.xpath("//table")); // In the following code, we are trying to find table in the html code
        System.out.println("Tables are found in HTML Web Page");
    }
}