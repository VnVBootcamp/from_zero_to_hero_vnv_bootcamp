import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsExercise3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\Bootcamp\\Support\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("_6ltj")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("¿Olvidaste la cuenta?")).click();


    }


}
