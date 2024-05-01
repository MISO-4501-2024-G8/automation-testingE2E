package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PageSignIn {
	
	ExtentTest test;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    WebElement tuEspacio;

    @FindBy(id = "email")
    WebElement emailDeportista;

    @FindBy(id = "password")
    WebElement passwordDeportista;

    @FindBy(xpath = "(//button[@class='btn btn-warning'])[1]")
    WebElement botonIngresar;

    @FindBy(xpath = "(//button[@class='btn btn-warning'])[2]")
    WebElement botonSalir;

    public PageSignIn(WebDriver driver, ExtentTest test) {   
    	this.test = test;
        PageFactory.initElements(driver, this);
    }

    public void tuEspacioInicio(){
        tuEspacio.click();
        test.log(LogStatus.INFO, "Click en botón de inicio de Sesión");
    }

    public void emailDeportista(String usuario){
        emailDeportista.sendKeys(usuario);
        test.log(LogStatus.INFO, "Ingreso de Email");
    }

    public void passwordDeportista(String contraseña){
        passwordDeportista.sendKeys(contraseña);
        test.log(LogStatus.INFO, "Ingreso de Contraseña");
    }

    public void botonIngresarDeportista(){
        botonIngresar.click();
        test.log(LogStatus.INFO, "Click en botón de ingresar deportista");
    }

    public void botonSalirDeportista(){
        botonSalir.click();
        test.log(LogStatus.INFO, "Click en botón de Salir");
    }

}
