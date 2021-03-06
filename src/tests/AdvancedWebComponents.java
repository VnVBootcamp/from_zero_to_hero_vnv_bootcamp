package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AdvancedWebComponents {

    public static void main(String[] args) throws InterruptedException {

        //For Windows
        //System.setProperty("webdriver.chrome.driver","C:\\folder\\chromedriver.exe");
        fakeDropDown();
    }

    private static void openBrowser(WebDriver chromeDriver, String baseUrl){
        chromeDriver.get(baseUrl);
    }

    private static void openSeleniumEasyDropDownExample(WebDriver driver){
        openBrowser(driver, "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
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
        //For MacOS
        System.setProperty("webdriver.chrome.driver","/users/jxr20920/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        //1. After opening browser find element locator (xpath, id, css, name, etc.)
        WebElement daysOfWeek = chromeDriver.findElement(By.id("select-demo"));

        //2. Instantiate Select object - The Select constructor needs a WebElement
        Select myDropDown = new Select(daysOfWeek);

        //3. Manage myDropDown behavior with methods
        Boolean isMultipleOption = myDropDown.isMultiple();

        System.out.println("This select or dropdown is multiple? " + isMultipleOption);
        if (isMultipleOption) {
            myDropDown.selectByIndex(1);
        } else {
            String previousSelectedOption = myDropDown.getFirstSelectedOption().getText(); // <- Saving previous selected option
            System.out.println("Previous selected option is: " + previousSelectedOption); // <- Printing on console previous selected option
            myDropDown.selectByIndex(2); // <- Select third option
            System.out.println("Selected option is: " + myDropDown.getFirstSelectedOption().getText()); // <- Printing third selected option
            myDropDown.selectByIndex(0); // <- Deselecting the option (returning to previous selectedf option)
        }

        chromeDriver.quit();
    }

    private static void fakeDropDown() throws InterruptedException {
        //For MacOS
        System.setProperty("webdriver.chrome.driver","/users/jxr20920/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/automation-practice-form");

        chromeDriver.manage().window().fullscreen();

        //final String DD_STATE_XPATH = "//div[@id='state']";
        final String DD_OPTIONS_XPATH = "//div[@id='state']/span";
        final String DD_OPTION_RAJASTHAN_XPATH = "//*[contains(@text,'Rajasthan')]";

        WebElement fakeDropDown = chromeDriver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        fakeDropDown.sendKeys("Rajasthan");
        Thread.sleep(1000);
        WebElement fakeDropOption = chromeDriver.findElement(By.xpath("//div[contains(@id,'react-select')]"));
        fakeDropOption.click();
        chromeDriver.quit();
    }
}

