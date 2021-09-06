import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class testAssertFunctions {

    @Test
    public void testAssertFunctions() throws InterruptedException {

        //Set properties: webDriver
        System.setProperty("webdriver.chrome.driver", "/Users/jyg0221/Desktop/chromedriver");

        //Initialize the driver with the desire webDriver
        WebDriver driver = new ChromeDriver();

        //Web Page url
        driver.navigate().to("https://www.saucedemo.com");

        //Explicit wait
        WebDriverWait ewait = new WebDriverWait(driver, 5);

        //Get Web Page Title
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Swag Labs";
        System.out.print("actual title: " + ActualTitle);
        System.out.println(": expected title: " + ExpectedTitle);


        //Validate if title is that we expected.
        Assertions.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("The assertEquals was met! ");

        //Explicit Wait to say Hey you! wait for all items loading correctly!
        Thread.sleep(5);

        //Find Elements and Send Keys
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();


        //Implicit Wait to say Hey you! wait for all items loading correctly!
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);


        //Validate if all item are availables
        List<WebElement> dynamicElement = driver.findElements(By.className("inventory_item_name"));
        Thread.sleep(5);
        Assertions.assertNotNull(dynamicElement.size());
        if  (dynamicElement.size() != 0){
            //If list size is non-zero, element is present
            System.out.println("All Elements are present");
        } else{
            //Else if size is 0, then element is not present
            System.out.println("Elements not present");
        }

        /*Explicit Waits Tread.sleep
        Thread.sleep(2000);
        WebDriverWait ewait = new WebDriverWait(driver, 5);
        */

        //Explicit wait
        ewait.until(ExpectedConditions.titleContains("Swag"));

        //Validate if Sauce Labs Fleece Jacket exist in the page
        Assertions.assertTrue(driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).isDisplayed());
        System.out.println("Sauce Labs Fleece Jacket already exist on this page");
        driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();

        String ActualTitle2 = driver.getTitle();
        //Validate that page title is not Ready to shopping
        Assertions.assertNotEquals("Ready to Shopping", ActualTitle2);
        System.out.println("The title page is not Ready to Shopping! ");
        //Add Sauce Labs Fleece Jacket to cart.
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        //Go to cart.
        driver.findElement(By.className("shopping_cart_link")).click();


        //Validate that Sauce Jacket was added to cart.
        Assertions.assertNotNull(driver.findElement(By.linkText("Sauce Labs Fleece Jacket")));
        System.out.println("The Sauce Labs Fleece Jacket was added Successfully!");

        Thread.sleep(1000);
        //Remove the item from cart.
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();


        //Back to Continue Shopping
        driver.findElement(By.id("continue-shopping")).click();
        Thread.sleep(1000);
        Assertions.assertNotNull(driver.findElement(By.id("item_3_img_link")));
        System.out.println("The Red T-Shirt is in the page");
        //Add Red T-Shirt
        driver.findElement(By.id("item_3_img_link")).click();
        Thread.sleep(1000);
        System.out.println("The Red T-Shirt was added to the cart");

        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        //Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        String ActualTitleCart = driver.getTitle();


        //Validate that page title is not equals to "Moda Swag"
        Assertions.assertTrue(ActualTitleCart != "Swag Moda");
        //Validate that page title is that you are waiting.
        System.out.println("Hey This is easy!");

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //Do checkout to go shopping:
        driver.findElement(By.id("checkout")).click();

        //Full information
        driver.findElement(By.id("first-name")).sendKeys("Peppa");
        driver.findElement(By.id("last-name")).sendKeys("Pig");
        driver.findElement(By.id("postal-code")).sendKeys("24080");

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();


        //Explicit wait
	  	/*WebDriverWait wait = new WebDriverWait(driver,10);
	  	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
	  	wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();*/

    //driver.quit();
    }
}
