import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ProductListingPage {

    public static final String PRODUCT_LIST = "inventory_item";
    public static final String PRODUCT_NAME = "inventory_item_name";
    public static final String PRODUCT_PRICE = "inventory_item_price";

    public static void ProductLists (WebDriver driver, int numberOfProductsToSelect) throws Exception {
        List<WebElement> productElements = driver.findElements(By.className(PRODUCT_LIST));
        int numberOfProducts = productElements.size();

        if (numberOfProductsToSelect < numberOfProducts) {
            Random random = new Random();

            for (int i = 0; i < numberOfProductsToSelect; i++) {
                int randomIndex = random.nextInt(numberOfProducts);
                WebElement randomProduct = productElements.get(randomIndex);
                String productTitle = randomProduct.findElement(By.className(PRODUCT_NAME)).getText();
                String productPrice = randomProduct.findElement(By.className(PRODUCT_PRICE)).getText();

                System.out.println("Product Title: " + productTitle + " Product Price: " + productPrice);
            }
        } else {
            System.out.println("Number of products reached the maximum limit");
        }
    }
}
