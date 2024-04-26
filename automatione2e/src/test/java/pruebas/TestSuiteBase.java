package pruebas;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageSignIn;

public class TestSuiteBase {

    WebDriver driver;
    PageSignIn tuEspacioInicial;

    private void inicializarPaginas(WebDriver driver) {
        tuEspacioInicial = new PageSignIn(driver);
    }

    @BeforeMethod
    public void abrirNavegador() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inicializarPaginas(driver);
    }

    @Test
    public void clickTuEspacioIngresar() throws InterruptedException{
        String textEsperado = "Hello, sa-front-web - home";
        String textoActual = null;
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
        tuEspacioInicial.tuEspacioInicio();
        tuEspacioInicial.emailDeportista("yirzajes2@gmail.com");
        tuEspacioInicial.passwordDeportista("Ratica98*");
        tuEspacioInicial.botonIngresarDeportista();
        textoActual = driver.findElement(By.xpath("//h1[contains(text(),'Hello')]")).getText();
        assertEquals(textEsperado, textoActual);
    }

    @Test
    public void clickTuEspacioSalir(){
        String tituloEsperado = "SportApp";
        String tituloActual = null;
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
        tuEspacioInicial.tuEspacioInicio();
        tuEspacioInicial.emailDeportista("yirzajes2@gmail.com");
        tuEspacioInicial.passwordDeportista("Ratica98*");
        tuEspacioInicial.botonSalirDeportista();
        tituloActual = driver.getTitle();
        assertEquals(tituloActual, tituloEsperado);
    }

    @AfterMethod
    public void cerrarNavegador() {
        driver.quit();
    }
}
