import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.cssSelector;

public class UpdateMyAddresses {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateMyAddress() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        /*Se inicia sesión en la aplicación*/
        Login.authentication("micaela.tosini.89@gmail.com","Almiron030");
        
        /*Se accede a la vista a la opcion MY ADDRESSES y luego a la opcion Update*/
        driver.findElement(cssSelector("li:nth-child(3) > a > span:nth-child(2)")).click();
        driver.findElement(cssSelector(".address_update .icon-chevron-right")).click();

        /*
           En la vista "YOUR ADDRESSES", se actualizan los datos:
            phone, phone_mobile,address1,company y alias
         */
        YourAddresses.addresses("123456789","987654321","Street 443","UTN","UTN AUTOMATION" );
        driver.findElement(cssSelector("#submitAddress > span")).click();

        /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
        assertEquals("UTN AUTOMATION", driver.findElement(cssSelector(".page-subheading")).getText());
    }

}
