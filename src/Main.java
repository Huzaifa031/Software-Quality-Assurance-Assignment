import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            LoginPage.performLogin(driver);
            ProductListingPage.ProductLists(driver, 4);
            List<String> AddProducts = Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket");
            Cart.addProductToCart(driver, AddProducts);
            Checkout.performCheckout(driver);
            Checkout.checkout_info(driver);
            Checkout.finish(driver);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
