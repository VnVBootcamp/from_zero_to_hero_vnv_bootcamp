
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AdvancedWebComponents {
    public static void main(String[] args) {
        //For MacOS
        System.setProperty("webdriver.chrome.driver","/users/jxr20920/chromedriver");

        //For Windows
        //System.setProperty("webdriver.chrome.driver","C:\\folder\chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();

        String baseUrl = "https://www.globalsqa.com/samplepagetest/";
        chromeDriver.get(baseUrl);

    }
}
