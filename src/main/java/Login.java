import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class Login {

    private static WebDriver Driver;

    public static void authentication (String email, String password) {
        Driver = WebDriverSupliter.getChromeDriver();

        Driver.findElement(By.id("email")).sendKeys(email);
        Driver.findElement(By.id("passwd")).sendKeys(password);
        Driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}
