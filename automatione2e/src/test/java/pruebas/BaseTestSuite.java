package pruebas;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.PageSignIn;

public class BaseTestSuite {

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
    public void clickTuEspacio(){
        driver.get("https://d1jiuccttec78g.cloudfront.net/#/");
        tuEspacioInicial.tuEspacioInicio();
    }

    @AfterMethod
    public void cerrarNavegador() {
        driver.quit();
    }


}
