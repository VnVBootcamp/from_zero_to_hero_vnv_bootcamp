import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsExercise1 {
    public static void main(String[] args) throws InterruptedException {
        String browser = "Chrome";
        WebDriver driver;
        if(browser == "Chrome"){
            System.setProperty("webdriver.chrome.driver","C:\\Automation\\Bootcamp\\Support\\Tools\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver","C:\\Automation\\Bootcamp\\Support\\Tools\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get("https://saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.quit();
    }
}
