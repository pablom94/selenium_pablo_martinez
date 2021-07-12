import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpotifyWithCssSelectorTest {

    @Test
    public void spotifyByPlaceHolderTest (){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spotify.com/uy/signup/");

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("5468546546");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("Matt_Murdock");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("09");
        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("2018");

    }
}
