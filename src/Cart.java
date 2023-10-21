import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cart {
    public static final String ADD_TO_CART_BUTTON = "btn_primary";
    public static final String PRODUCT_LIST = "inventory_item";
    public static final String PRODUCT_NAME = "inventory_item_name";
    public static final String SHOPPING_CART = "shopping_cart_badge";

    public static void addProductToCart(WebDriver driver, List<String> AddProducts) {
        List<WebElement> productElements = driver.findElements(By.className(PRODUCT_LIST));

        for (String ActualProductName : AddProducts) {
            for (WebElement product : productElements) {
                String currentProductName = product.findElement(By.className(PRODUCT_NAME)).getText();

                if (currentProductName.equals(ActualProductName)) {
                    System.out.println("Product title is verified: " + currentProductName);
                    System.out.println("Adding " + ActualProductName + " to the cart.");
                    WebElement addToCartButton = product.findElement(By.className(ADD_TO_CART_BUTTON));
                    addToCartButton.click();
                    break;
                }
            }
        }

        navigateToShoppingCart(driver);
    }

    public static void navigateToShoppingCart(WebDriver driver) {
        WebElement cartIcon = driver.findElement(By.className(SHOPPING_CART));
        cartIcon.click();
    }
}
