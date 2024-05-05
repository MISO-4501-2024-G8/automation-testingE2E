package pruebas;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageSignIn;
import pageObjects.Reportesext;
import pageObjects.Screenshots;

public class TestSuiteLoginSalir {

    WebDriver driver;
    PageSignIn tuEspacioInicial;
    ExtentReports report;
    ExtentTest test;


    private void inicializarPaginas(WebDriver driver, ExtentTest test) {
        tuEspacioInicial = new PageSignIn(driver, test);
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
  
    }

    @Test
    public void clickTuEspacioSalir(){
        String tituloEsperado = "SportApp";
        String tituloActual = null;
        try {
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
        tuEspacioInicial.tuEspacioInicio();
        tuEspacioInicial.emailDeportista("yirzajes2@gmail.com");
        tuEspacioInicial.passwordDeportista("Ratica98*");
        tuEspacioInicial.botonSalirDeportista();
        tituloActual = driver.getTitle();
        }catch(Exception e) {
        	test.log(LogStatus.FAIL, e.getMessage());
        }
        assertEquals(tituloActual, tituloEsperado);
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
