package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedWebComponents {

    private static WebDriver chromeDriver = new ChromeDriver();


    public static void main(String[] args) {
        //For MacOS
        System.setProperty("webdriver.chrome.driver","/users/jxr20920/chromedriver");

        //For Windows
        //System.setProperty("webdriver.chrome.driver","C:\\folder\\chromedriver.exe");
        selectDeselectDropDown();

        chromeDriver.quit();
    }

    private static void openBrowser(String baseUrl){
        chromeDriver.get(baseUrl);
    }

    private static void openGlobalSQAFormExample(){
        openBrowser("https://www.globalsqa.com/samplepagetest/");
    }

    private static void openSeleniumEasyDropDownExample(){
        openBrowser("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
    }

    private static void openDemoQAForm(){
        openBrowser("https://demoqa.com/automation-practice-form");
    }

    private static void openSeleniumEasyOtherDropDown(){
        openBrowser("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
    }

    private static void openSeleniumEasyTableExample(){
        openBrowser("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
    }

    private static void openSeleniumEasyDatePicker(){
        openBrowser("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
    }

    private static void openDemoQABooksListExample(){
        openBrowser("https://demoqa.com/books");
    }

    private static void dropDownSelectByValue(Select select, String value){
        select.selectByValue(value);
        System.out.println("Value selected: " + value);
    }

    private static void dropDownDeSelectByValue(Select select, String value){
        select.deselectByValue(value);
        System.out.println("Value de-selected: " + value);
    }

    private static void selectDeselectDropDown(){
        openSeleniumEasyDropDownExample();
        //1. After opening browser find element locator (xpath, id, css, name, etc.)
        WebElement webPageDropDown = chromeDriver.findElement(By.id("testId"));
        //2. Instantiate Select object
        Select myDropDown = new Select(webPageDropDown);
        //3. Manage myDropDown behavior with methods
        Boolean isMultipleOption = myDropDown.isMultiple();
    }
}

