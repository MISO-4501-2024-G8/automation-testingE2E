package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class PageRegisterPartner {
	
	ExtentTest test;
	
    @FindBy(xpath = "//a[contains(text(),'Socios')]")
    WebElement btnSocios;

    @FindBy(xpath = "//button[contains(text(),'Agregar Socio')]")
    WebElement btnAgregarSocio;

    @FindBy(id = "name")
    WebElement nombreCompania;

    @FindBy(id = "docType")
    WebElement tipoDocCompania;

    @FindBy(id = "docNum")
    WebElement numeroDocCompania;

    @FindBy(id = "phone")
    WebElement numeroTelefonoCompania;

    @FindBy(xpath  = "//input[@id='company_creation_date']")
    WebElement fechaCreacionCompania;

    @FindBy(id = "company_address")
    WebElement direccionCompania;

    @FindBy(id = "contact_name")
    WebElement nombreContacto;

    @FindBy(id = "company_description")
    WebElement descripcionCompania;

    @FindBy(id = "email")
    WebElement correoCompania;

    @FindBy(id = "password")
    WebElement contrasenaCompania;

    @FindBy(id = "acceptanceTyc")
    WebElement aceptaTyC;

    @FindBy(id = "btnContinueSignup")
    WebElement btnContinuar;

    public PageRegisterPartner(WebDriver driver, ExtentTest test){
    	this.test = test;
        PageFactory.initElements(driver, this);
    }

    public void sociosHome(){
        btnSocios.click();
        test.log(LogStatus.INFO, "Click en botón de Socios");
    }

    public void btnAgregarSocios(){
        btnAgregarSocio.click();
        test.log(LogStatus.INFO, "Click en botón de Registro Socio");
    }

    public void nombreCompania(String nombre){
        nombreCompania.sendKeys(nombre);
        test.log(LogStatus.INFO, "Ingreso nombre socio: "+nombre);
    }

    public void tipoDocCompania(String tipo){
        tipoDocCompania.sendKeys(tipo);
        test.log(LogStatus.INFO, "Ingreso tipo documento: "+tipo);
    }

    public void numeroDocCompania(String numero){
        numeroDocCompania.sendKeys(numero);
        test.log(LogStatus.INFO, "Ingreso número de documento: "+numero);
    }

    public void numeroTelefonoCompania(String numero){
        numeroTelefonoCompania.sendKeys(numero);
        test.log(LogStatus.INFO, "Ingreso número de teléfono: "+numero);
    }

    public void fechaCreacionCompania(){
        fechaCreacionCompania.click();
        test.log(LogStatus.INFO, "Ingreso fecha de creación");
    }

    public void direccionCompania(String direccion){
        direccionCompania.sendKeys(direccion);
        test.log(LogStatus.INFO, "Ingreso dirección socio: "+direccion);
    }

    public void nombreContacto(String nombre){
        nombreContacto.sendKeys(nombre);
        test.log(LogStatus.INFO, "Nombre contacto: "+nombre);
    }

    public void descripcionCompania(String descripcion){
        descripcionCompania.sendKeys(descripcion);
        test.log(LogStatus.INFO, "Descripción: "+descripcion);
    }

    public void correoCompania(String correo){
        correoCompania.sendKeys(correo);
        test.log(LogStatus.INFO, "Correo socio: "+correo);
    }

    public void contrasenaCompania(String contrasena){
        contrasenaCompania.sendKeys(contrasena);
        test.log(LogStatus.INFO, "Contraseña: "+contrasena);
    }

    public void aceptaTyC(){
        aceptaTyC.click();
        test.log(LogStatus.INFO, "Acepta Términos y Condiciones");
    }

    public void btnContinuar(){
        btnContinuar.submit();
        test.log(LogStatus.INFO, "Click en botón de Registro y Finalizar");
    }

}
