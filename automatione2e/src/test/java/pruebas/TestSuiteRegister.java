package pruebas;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageRegisterUser;

public class TestSuiteRegister {
    
    WebDriver driver;
    PageRegisterUser registerUser;

    private void inicializarPaginas(WebDriver driver) {
        registerUser = new PageRegisterUser(driver);
    }

    @BeforeMethod
    public void abrirNavegador() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inicializarPaginas(driver);
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
    }

    @Test
    public void registroDeportista() throws InterruptedException{

        String textoEsperado = "Plan Basico";
        String textoActual = null;
        double numero1 = Math.random()*1000;
        double numero2 = Math.random()*1000;
        registerUser.registroDeportista();
        registerUser.nombreDeportista("Juan Sebastian");
        registerUser.apellidoDeportista("Sanchez");
        registerUser.tipoDocumentoDeportista("CC");
        registerUser.numeroDocumentoDeportista("123456789");
        registerUser.numeroTelefonoDeportista("3133133131");
        registerUser.edadDeportista("18");
        registerUser.generoDeportista("Masculino");
        registerUser.pesoDeportista("72");
        registerUser.alturaDeportista("180");
        registerUser.paisNacimientoDeportista("España");
        registerUser.ciudadNacimientoDeportista("Madrid");
        registerUser.paisResidenciaDeportista("Colombia");
        registerUser.ciudadResidenciaDeportista("Bogotá");
        registerUser.tiempoResidenciaDeportista("10");
        registerUser.seleccionDeporteDeportista("Ciclismo");
        registerUser.correoDeportista("yirzajes"+(int)numero1+"@gmail.com");
        registerUser.contrasenaDeportista("Ratica"+(int)numero2+"*");
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 300)
                .perform();
        registerUser.aceptaNotificacionesDeportista();
        registerUser.aceptarTyCDeportista();
        registerUser.aceptarPersonalDataDeportista();
        registerUser.btnAceptarDeportista();
        textoActual = driver.findElement(By.xpath("//div[contains(text(),' Plan Basico ')]")).getText();
        assertEquals(textoActual, textoEsperado);
      

    }

    @AfterMethod
    public void cerrarNavegador() {
        driver.quit();
    }
}
