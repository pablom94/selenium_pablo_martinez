import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;


public class Ejercicio14 {

    @Test
    public void testParaNetflix(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://netflix.com/uy");

        //Lista de elementos h1 y h2
        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("**************** Elementos h1: ******************");
        for (WebElement elementoH1 : listaH1s){
            System.out.println(elementoH1.getText());
        }
        System.out.println("**************************");

        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("**************** Elementos h2: ******************");
        for (WebElement elementoH2 : listaH2s){
            System.out.println(elementoH2.getText());
        }
        System.out.println("**************************");

        //Refrescar sitio
        driver.navigate().refresh();

        //Texto de los botones de la página
        List<WebElement> btnElements = driver.findElements(By.tagName("button"));
        for (WebElement btn: btnElements) {
            System.out.println("Botones de Netflix: " + btn.getText());
        }

        //Cantidad de Elementos div
        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println("La cantida de divs es " + divElements.size());

        //Título de la página
        System.out.println(driver.getTitle());

        //Elementos tipo link
        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : listaLinks){
            System.out.println("Links: " + link.getText());
        }



    }
}
