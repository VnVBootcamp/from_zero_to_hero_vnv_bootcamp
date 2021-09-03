import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstTest {
        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver","C:\\Automation\\Bootcamp\\Support\\Tools\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://saucedemo.com");
            System.out.println(driver.getTitle());
        }
}
