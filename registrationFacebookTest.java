import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class registrationFacebookTest {

    public WebDriver getFacebookDriver(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        return driver;
    }

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = getFacebookDriver();

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("testing@selenium.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        setBirth(driver, "26","jun","1980");

        driver.findElement(By.xpath("//input[@value='2']")).click();

        Thread.sleep(2000);
        driver.close();

    }

    private void setBirth (WebDriver driver, String day, String month, String year){

        WebElement dias = driver.findElement(By.name("birthday_day"));
        Select comboDia = new Select(dias);
        comboDia.selectByVisibleText(day);

        WebElement meses = driver.findElement(By.name("birthday_month"));
        Select comboMes = new Select(meses);
        comboMes.selectByVisibleText(month);

        WebElement año = driver.findElement(By.name("birthday_year"));
        Select comboAño = new Select(año);
        comboAño.selectByVisibleText(year);

    }
}
