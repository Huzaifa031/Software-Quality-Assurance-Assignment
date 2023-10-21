import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static final String USERNAME = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    public static final String LOGIN_URL = "https://www.saucedemo.com/";
    public static final String USERNAME_TEXT_BOX_ID = "user-name";
    public static final String PASSWORD_TEXT_BOX_ID = "password";
    public static final String LOGIN_BUTTON_ID = "login-button";

    public static void performLogin(WebDriver driver) {
        driver.get(LOGIN_URL);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameTextBox = driver.findElement(By.id(USERNAME_TEXT_BOX_ID));
        usernameTextBox.sendKeys(USERNAME);
        WebElement passwordTextBox = driver.findElement(By.id(PASSWORD_TEXT_BOX_ID));
        passwordTextBox.sendKeys(PASSWORD);
        WebElement loginButton = driver.findElement(By.id(LOGIN_BUTTON_ID));
        loginButton.click();
    }
}
