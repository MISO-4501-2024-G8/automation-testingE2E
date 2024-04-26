package pruebas;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageRegisterPartner;


public class TestSuiteRegisterPartner {

    WebDriver driver;
    PageRegisterPartner registerPartner;

    @BeforeMethod
    public void abrirNavegador() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //inicializarPaginas(driver);
        registerPartner = new PageRegisterPartner(driver);
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
    }

    @Test
    public void registroSocio() throws InterruptedException{
        String textoEsperado = "Hola Compañia Automatizada!";
        String textoActual = null;
        double numero1 = Math.random()*1000;
        double numero2 = Math.random()*1000;
        registerPartner.sociosHome();
        registerPartner.btnAgregarSocios();
        registerPartner.nombreCompania("Compañia Automatizada");
        registerPartner.tipoDocCompania("CC");
        registerPartner.numeroDocCompania(""+(int)(numero1));
        registerPartner.numeroTelefonoCompania("3152258159");
        registerPartner.fechaCreacionCompania();
        registerPartner.direccionCompania("Calle"+ (int)numero2 +"");
        registerPartner.nombreContacto("Alexander Yirsa");
        registerPartner.descripcionCompania("Descripción de empresa creada por medio de la automatización de pruebas");
        registerPartner.correoCompania("yirzajes"+(int)numero1+"@gmail.com");
        registerPartner.contrasenaCompania("Ratica"+(int)numero2+"*");
        registerPartner.aceptaTyC();
        registerPartner.btnContinuar();
        textoActual = driver.findElement(By.xpath("//a[contains(text(),'Hola')]")).getText();
        assertEquals(textoEsperado, textoActual);

    }

    @AfterMethod
    public void cerrarNavegador() {
        //driver.quit();
    }

}
