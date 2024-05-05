package pruebas;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageRegisterPartner;
import pageObjects.PageRegisterUser;
import pageObjects.Reportesext;
import pageObjects.Screenshots;


public class TestSuiteRegisterPartner {

    WebDriver driver;
    PageRegisterPartner registerPartner;
    ExtentReports report;
    ExtentTest test;
    
    private void inicializarPaginas(WebDriver driver, ExtentTest test) {
    	registerPartner = new PageRegisterPartner(driver, test);
    }

    @BeforeMethod
    @Parameters({ "Caso" })
    public void abrirNavegador(String caso) {
    	report = Reportesext.getInstance();
		test = report.startTest(caso);
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        inicializarPaginas(driver, test);
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
    }

    @Test
    public void registroSocio() throws InterruptedException{
        String textoEsperado = "Hola Compañia Automatizada!";
        String textoActual = null;
        double numero1 = Math.random()*1000;
        double numero2 = Math.random()*1000;
        try {
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
        }catch(Exception e) {
        	test.log(LogStatus.FAIL, e.getMessage());
        }
        assertEquals(textoEsperado, textoActual);
        test.log(LogStatus.PASS, "Caso pasado satisfactoriamente");

    }

    @AfterMethod
	public void afterMethod(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verify Welcome Text Failed", imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
