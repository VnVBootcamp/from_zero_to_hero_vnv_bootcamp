import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsExercise2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Bootcamp\\Support\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }
}
