import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Checkout {
    public static void performCheckout(WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
    }
    public static void checkout_info(WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement FirstNameTextBox = driver.findElement(By.id("first-name"));
        FirstNameTextBox.sendKeys("Muhammad Huzaifa");
        WebElement LastNameTextBox = driver.findElement(By.id("last-name"));
        LastNameTextBox.sendKeys("Saleem");
        WebElement PostalAddressTextBox = driver.findElement(By.id("postal-code"));
        PostalAddressTextBox.sendKeys("72500");
        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
    }

    public static void finish_page(WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
    }
    public static void finish (WebDriver driver) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
    }

}


