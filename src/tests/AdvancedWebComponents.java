package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AdvancedWebComponents {

    private static WebDriver chromeDriver = new ChromeDriver();

    public static void main(String[] args) {
        openBrowser();
    }

    private static void openBrowser(){
        //For MacOS
        System.setProperty("webdriver.chrome.driver","/users/jxr20920/chromedriver");

        //For Windows
        //System.setProperty("webdriver.chrome.driver","C:\\folder\chromedriver.exe");

        String baseUrl = "https://www.globalsqa.com/samplepagetest/";
        chromeDriver.get(baseUrl);
    }
}

