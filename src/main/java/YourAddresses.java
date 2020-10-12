import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class YourAddresses {

    private static WebDriver Driver;

    public static void addresses (String phone, String phone_mobile, String address1, String company, String alias) {
        Driver = WebDriverSupliter.getChromeDriver();

        Driver.findElement(By.id("phone")).clear();
        Driver.findElement(By.id("phone")).sendKeys(phone);

        Driver.findElement(By.id("phone_mobile")).clear();
        Driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);

        Driver.findElement(By.id("address1")).clear();
        Driver.findElement(By.id("address1")).sendKeys(address1);

        Driver.findElement(By.id("company")).clear();
        Driver.findElement(By.id("company")).sendKeys(company);

        Driver.findElement(By.id("alias")).clear();
        Driver.findElement(By.id("alias")).sendKeys(alias);
    }

}
